SELECT Exercises

Write and save an .sql script to represent the queries below. Finally spool output to a file to capture both queries and outputs.

1) Find the name of the salesperson who won order O2. (Hint: this involves a join.)

2) List the line details of each order and include the ID of the salesperson who won the order. Order the output by order number and, where there are identical order numbers, by item code.

3) List the names of salespersons who have won orders and the order numbers of their orders in ascending order of name then order number.

4) List the names of all salespersons and the order numbers of their orders, if any. (Hint: what kind of join is this?)

5) Find the names of salespersons who have won orders. Use a subquery.

6) Find the name of the salesperson who won order O3. Use a subquery. (Hint: Get the ID of the salesperson in the subquery.)

7) Display the order number and the total number of order lines of every order which has two or more order lines. (Hint: you are going to have to count the number of order lines on each order and keep those which number two or more. GROUP BY?)

8) Display the code, description and price of stock items which cost more than the average price of stock items. (Hint: use a subquery.)

9) Display the order number and the order value of each order. (The order value of an order is calculated by totalling the product of the qty and the unitprice of each orderline.)

10) Display the order number, item code, quantity, unit price and line value of lines whose line value is less than the average line value. (Line value can be calculated by multiplying unitprice by quantity.) (Hint: Use a subquery to get the average line value. Then find those lines whose line value is less than the average.)