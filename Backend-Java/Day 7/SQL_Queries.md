# SQL Queries:

- Query: A query is a request for data or information from a database table or combination of tables.

1. select \* from table_name; # select all columns from table_name
2. select column_name from table_name; # select column_name from table_name
3. select column_name from table_name where condition; # select column_name from table_name where condition
4. select distinct column_name from table_name; # select distinct column_name from table_name
5. select column_name from table_name where condition1 and condition2; # select column_name from table_name where condition1 and condition2
6. select column_name from table_name where condition1 or condition2; # select column_name from table_name where condition1 or condition2

## Example:

1. select \* from employee; # select all columns from employee
2. select emp_name from employee; # select emp_name from employee
3. select emp_name from employee where emp_id = 1; # select emp_name from employee where emp_id = 1
4. select distinct emp_name from employee; # select distinct emp_name from employee
5. select emp_name from employee where emp_id = 1 and emp_name = 'John'; # select emp_name from employee where emp_id = 1 and emp_name = 'John'
6. select emp_name from employee where emp_id = 1 or emp_name = 'John'; # select emp_name from employee where emp_id = 1 or emp_name = 'John'
7. select emp_name from employee where emp_id = 1 or emp_name = 'John' order by emp_name; # select emp_name from employee where emp_id = 1 or emp_name = 'John' order by emp_name
8. select emp_name from employee where emp_id = 1 or emp_name = 'John' order by emp_name desc; # select emp_name from employee where emp_id = 1 or emp_name = 'John' order by emp_name desc
9. select emp_name from employee where emp_id = 1 or emp_name = 'John' order by emp_name desc limit 1; # select emp_name from employee where emp_id = 1 or emp_name = 'John' order by emp_name desc limit 1
10. select emp_name from employee where emp_id = 1 or emp_name = 'John' order by emp_name desc limit 1 offset 1; # select emp_name from employee where emp_id = 1 or emp_name = 'John' order by emp_name desc limit 1 offset 1
11. select employee_id, first_name, last_name from employees where first_name like 'A%'; # select employee_id, first_name, last_name from employees where first_name like 'A%

    `% is wildcard character`

12. Concat: 
- Concatenation operator is used to concatenate two or more strings. 
- It is represented by two vertical bars (||).
- It can be used to combine columns from different tables into one column.

    `select first_name || ' ' || last_name "Employee Name" from employees;`

13. Arithmetic Operators:
14. Comparison Operators:
15. Logical Operators:
16. Order By:
17. Group By:   
18. Having:
19. In:
20. Between:
21. Like:
22. Aliases:
23. Joins:
24. Union:
25. Intersect:
26. Except:
27. Min:
28. Max:
29. Count:
30. Sum:
31. Avg:
32. Any:
33. All:
34. Exists:
35. Case:
36. Truncate:
37. Date Functions:
38. Null Functions:
39. NVL:
40. Decode:
41. Constraints:
42. Primary Key:
43. Foreign Key:
44. Not Null:
    1.   select \* from employee where emp_name is not null;
    2.   select \* from employee where emp_name is null;
    3. Here, we can't use emp_name = null, because null is not a value, it is a state of value.

45. Unique:
46. Check:
47. Default:


