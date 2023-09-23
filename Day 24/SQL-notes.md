# SQL 

SQL is a language used to communicate with databases. It is the standard language for relational database management systems. SQL statements are used to perform tasks such as update data on a database, or retrieve data from a database.

## SQL Syntax

SQL keywords are NOT case sensitive: select is the same as SELECT

Some database systems require a semicolon at the end of each SQL statement.

### SELECT

The SELECT statement is used to select data from a database.

The data returned is stored in a result table, called the result-set.

```sql
SELECT column1, column2, ...
FROM table_name;
```

### SELECT DISTINCT

The SELECT DISTINCT statement is used to return only distinct (different) values.

```sql
SELECT DISTINCT column1, column2, ...
FROM table_name;
```

### WHERE

The WHERE clause is used to filter records.

The WHERE clause is used to extract only those records that fulfill a specified condition.

```sql
SELECT column1, column2, ...
FROM table_name
WHERE condition;
```

### AND, OR and NOT Operators

The WHERE clause can be combined with AND, OR, and NOT operators.

The AND and OR operators are used to filter records based on more than one condition:

The AND operator displays a record if all the conditions separated by AND are TRUE.

The OR operator displays a record if any of the conditions separated by OR is TRUE.

The NOT operator displays a record if the condition(s) is NOT TRUE.

```sql
SELECT column1, column2, ...
FROM table_name
WHERE condition1 AND condition2 AND condition3 ...;
```

```sql
SELECT column1, column2, ...
FROM table_name
WHERE condition1 OR condition2 OR condition3 ...;
```

```sql
SELECT column1, column2, ...
FROM table_name
WHERE NOT condition;
```

### ORDER BY

The ORDER BY keyword is used to sort the result-set in ascending or descending order.

The ORDER BY keyword sorts the records in ascending order by default. To sort the records in descending order, use the DESC keyword.

```sql
SELECT column1, column2, ...
FROM table_name

ORDER BY column1, column2, ... ASC|DESC;
```

### INSERT INTO

The INSERT INTO statement is used to insert new records in a table.

```sql
INSERT INTO table_name (column1, column2, column3, ...)
VALUES (value1, value2, value3, ...);
```

### UPDATE

The UPDATE statement is used to modify the existing records in a table.

```sql
UPDATE table_name
SET column1 = value1, column2 = value2, ...
WHERE condition;
```

### DELETE

The DELETE statement is used to delete existing records in a table.

```sql
DELETE FROM table_name WHERE condition;
```

### TOP, LIMIT or ROWNUM

The SELECT TOP clause is used to specify the number of records to return.

The SELECT TOP clause is useful on large tables with thousands of records. Returning a large number of records can impact performance.

MySQL Syntax

```sql
SELECT column_name(s)
FROM table_name
LIMIT number;
```

