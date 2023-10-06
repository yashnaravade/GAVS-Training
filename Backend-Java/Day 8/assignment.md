# SQL assignment:

## Create a database named `assignment` and create the following tables in it:

Suppliers(sid, sname, address)

Parts(pid, pname, color)

PartsSupplied(sid, pid, cost)

### Questions:

1. Find the pnames of parts for which there is some supplier. Each name should appear only once in the result set.

2. Find the total number of parts (pids) that are red.

3. Find the pnames of parts supplied by Acme Widget Suppliers.

4. Find the pnames of parts that Acme Widget Suppliers does not supply.

5. Find the pnames of parts supplied by Acme Widget Suppliers and no one else.

6. Find the sids of suppliers that supply a red part or a green part.

7. Find the sids of suppliers that supply at least a red part and a green part (Hint: The expression color = 'red' AND color = 'green' is always false)

8. Print the sid and average cost of parts supplied by that supplier, for each supplier.

9. For each supplier, print the sid, sname and maximum cost for the parts supplied by that supplier.

10. Find the sid, sname, address and total number of parts supplied, for suppliers that supply at least 2 parts.

11. For each supplier, print the sid, sname and the number of red parts supplied by that supplier.

12. Find the snames of suppliers who supply every red part.

13. Find the sids of suppliers who charge more for some part than the average cost of that part (averaged over all the suppliers that supply that part).

14. Find the sids of suppliers that supply only red parts.

15. For every supplier that supplies a green part and a red part (at least), print the name and price of the most expensive part that it supplies.

### The script to create the tables and insert data is given below:

```sql
CREATE TABLE Suppliers (
    sid INTEGER PRIMARY KEY,
    sname CHAR(20),
    address CHAR(30)
);

CREATE TABLE Parts (
    pid INTEGER PRIMARY KEY,
    pname CHAR(20),
    color CHAR(10)
);

CREATE TABLE PartsSupplied (
    sid INTEGER,
    pid INTEGER,
    cost INTEGER,
    PRIMARY KEY (sid, pid),
    FOREIGN KEY (sid) REFERENCES Suppliers(sid),
    FOREIGN KEY (pid) REFERENCES Parts(pid)
);

INSERT INTO Suppliers (sid, sname, address) VALUES (1, 'Acme Widget Suppliers', '1 Grub St., Potemkin Village, IL'), (2, 'Big Red Tool and Die', '4 My Way, Bermuda Shorts, OR'), (3, 'Perfunctory Parts', '99999 Short Pier, Terra Del Fuego, TX'), (4, 'Alien Aircaft Inc.', '2 Groom Lake, Rachel, NV');

INSERT INTO Parts (pid, pname, color) VALUES (1, 'Left Handed Bacon Stretcher Cover', 'Red'), (2, 'Smoke Shifter End', 'Black'), (3, 'Acme Widget Washer', 'Red'), (4, 'Acme Widget Washer', 'Silver');

INSERT INTO PartsSupplied (sid, pid, cost) VALUES (1, 1, 100), (1, 2, 100), (1, 3, 200), (1, 4, 300);
```

### The expected output is given below:

```sql
+--------------------------+
| pnames                   |
+--------------------------+
| Left Handed Bacon Stretc |
| Smoke Shifter End        |
| Acme Widget Washer       |
| I Brake for Crop Circles |
| Anti-Gravity Turbine Gen |
| Fire Hydrant Cap         |
| 7 Segment Display        |
| 6 Ft. Balloon            |
| ThinkPad 2300 Battery    |
| Airplane Seat Belt Exten |
+--------------------------+
10 rows in set (0.00 sec)
```

```sql
+--------------------------+
| count(*)                 |
+--------------------------+
|                        4 |
+--------------------------+
1 row in set (0.00 sec)
```

## Answers:

1. Find the pnames of parts for which there is some supplier. Each name should appear only once in the result set.

```sql
SELECT DISTINCT pname AS pnames FROM Parts;
```

2. Find the total number of parts (pids) that are red.

```sql
SELECT COUNT(pid) FROM Parts WHERE color = 'Red';
```

3. Find the pnames of parts supplied by Acme Widget Suppliers.

```sql
SELECT DISTINCT pname AS pnames FROM Parts WHERE pid IN (SELECT pid FROM PartsSupplied WHERE sid = (SELECT sid FROM Suppliers WHERE sname = 'Acme Widget Suppliers'));
```

4. Find the pnames of parts that Acme Widget Suppliers does not supply.

```sql
SELECT DISTINCT pname AS pnames FROM Parts WHERE pid NOT IN (SELECT pid FROM PartsSupplied WHERE sid = (SELECT sid FROM Suppliers WHERE sname = 'Acme Widget Suppliers'));
```

5. Find the pnames of parts supplied by Acme Widget Suppliers and no one else.

```sql
SELECT DISTINCT pname AS pnames FROM Parts WHERE pid IN (SELECT pid FROM PartsSupplied WHERE sid = (SELECT sid FROM Suppliers WHERE sname = 'Acme Widget Suppliers')) AND pid NOT IN (SELECT pid FROM PartsSupplied WHERE sid != (SELECT sid FROM Suppliers WHERE sname = 'Acme Widget Suppliers'));
```

6. Find the sids of suppliers that supply a red part or a green part.

```sql
SELECT DISTINCT sid FROM PartsSupplied WHERE pid IN (SELECT pid FROM Parts WHERE color = 'Red' OR color = 'Green');
```

7. Find the sids of suppliers that supply at least a red part and a green part (Hint: The expression color = 'red' AND color = 'green' is always false)

```sql
SELECT DISTINCT sid FROM PartsSupplied WHERE pid IN (SELECT pid FROM Parts WHERE color = 'Red') AND pid IN (SELECT pid FROM Parts WHERE color = 'Green');
```

8. Print the sid and average cost of parts supplied by that supplier, for each supplier.

```sql
SELECT sid, AVG(cost) FROM PartsSupplied GROUP BY sid;
```

9. For each supplier, print the sid, sname and maximum cost for the parts supplied by that supplier.

```sql
SELECT sid, sname, MAX(cost) FROM PartsSupplied, Suppliers WHERE sid = Suppliers.sid GROUP BY sid;
```

10. Find the sid, sname, address and total number of parts supplied, for suppliers that supply at least 2 parts.

```sql
SELECT sid, sname, address, COUNT(pid) FROM PartsSupplied, Suppliers WHERE sid = Suppliers.sid GROUP BY sid HAVING COUNT(pid) >= 2;
```

11. For each supplier, print the sid, sname and the number of red parts supplied by that supplier.

```sql
SELECT sid, sname, COUNT(pid) FROM PartsSupplied, Suppliers WHERE sid = Suppliers.sid AND pid IN (SELECT pid FROM Parts WHERE color = 'Red') GROUP BY sid;
```

12. Find the snames of suppliers who supply every red part.

```sql
SELECT sname FROM Suppliers WHERE sid IN (SELECT sid FROM PartsSupplied WHERE pid IN (SELECT pid FROM Parts WHERE color = 'Red') GROUP BY sid HAVING COUNT(pid) = (SELECT COUNT(pid) FROM Parts WHERE color = 'Red'));
```

13. Find the sids of suppliers who charge more for some part than the average cost of that part (averaged over all the suppliers that supply that part).

```sql
SELECT sid FROM PartsSupplied WHERE cost > (SELECT AVG(cost) FROM PartsSupplied WHERE pid = PartsSupplied.pid);
```

14. Find the sids of suppliers that supply only red parts.

```sql
SELECT sid FROM PartsSupplied WHERE pid IN (SELECT pid FROM Parts WHERE color = 'Red') AND pid NOT IN (SELECT pid FROM Parts WHERE color != 'Red');
```

15. For every supplier that supplies a green part and a red part (at least), print the name and price of the most expensive part that it supplies.

```sql
SELECT sname, MAX(cost) FROM PartsSupplied, Suppliers WHERE sid = Suppliers.sid AND pid IN (SELECT pid FROM Parts WHERE color = 'Red' OR color = 'Green') GROUP BY sid;
```


