```sql

-- 1) Find the name of the salesperson who won order O2.
SELECT SPName
FROM salesperson s
JOIN ordr o ON s.SPId = o.SId
WHERE o.ONum = 'O2';

-- 2) List the line details of each order and include the ID of the salesperson who won the order.
-- Order the output by order number and, where there are identical order numbers, by item code.
SELECT o.ONum, ol.ItemCode, ol.Qty, s.SPId AS salesperson_id
FROM ordr o
JOIN OrderLine ol ON o.ONum = ol.ONum
JOIN salesperson s ON s.SPId = o.SId
ORDER BY o.ONum, ol.ItemCode;

-- 3) List the names of salespersons who have won orders and the order numbers of their orders:
SELECT s.SPName, o.ONum
FROM salesperson s
LEFT JOIN ordr o ON s.SPId = o.SId
WHERE o.ONum IS NOT NULL
ORDER BY s.SPName, o.ONum;

-- 4) List the names of all salespersons and the order numbers of their orders, if any:
SELECT s.SPName, o.ONum
FROM salesperson s
LEFT JOIN ordr o ON s.SPId = o.SId;

-- 5) Find the names of salespersons who have won orders using a subquery:
SELECT SPName
FROM salesperson
WHERE SPId IN (SELECT SId FROM ordr);

-- 6) Find the name of the salesperson who won order O3 using a subquery:

SELECT SPName
FROM salesperson
WHERE SPId = (SELECT SId FROM ordr WHERE ONum = 'O3');

-- 7) Display the order number and the total number of order lines of every order which has two or more order lines:

SELECT o.ONum, COUNT(ol.ONum) AS total_order_lines
FROM ordr o
JOIN OrderLine ol ON o.ONum = ol.ONum
GROUP BY o.ONum
HAVING COUNT(ol.ONum) >= 2;

-- 8) Display the code, description, and price of stock items which cost more than the average price of stock items:

SELECT ICode, IDesc, UnitPrice
FROM stock
WHERE UnitPrice > (SELECT AVG(UnitPrice) FROM stock);

-- 9) Display the order number and the order value of each order:

SELECT o.ONum, SUM(ol.Qty * s.UnitPrice) AS order_value
FROM ordr o
JOIN OrderLine ol ON o.ONum = ol.ONum
JOIN stock s ON ol.ItemCode = s.ICode
GROUP BY o.ONum;

-- 10) Display the order number, item code, quantity, unit price, and line value of lines whose line value is less than the average line value:

SELECT o.ONum, ol.ItemCode, ol.Qty, s.UnitPrice, (ol.Qty * s.UnitPrice) AS line_value
FROM ordr o
JOIN OrderLine ol ON o.ONum = ol.ONum
JOIN stock s ON ol.ItemCode = s.ICode
WHERE (ol.Qty * s.UnitPrice) < (SELECT AVG(ol.Qty * s.UnitPrice) FROM OrderLine ol);
```