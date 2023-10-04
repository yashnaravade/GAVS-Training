## 1. Using select statements

- Write a query to list all the tables in HR schema

- Display employeeID, first name, last name, email, phone number from employees table.

- Display all columns of JOB_HISTORY table.

- Display the first name, last name concatenated and appearing under the column “EMPLOYEE NAME”.

- Write a query to display a sentence like Employee name working as JOB_ID for every employee record.

- Write a query to display the names of all the employees with their annual salary.

## 2. Scoping and ordering of rows

- Write a query to select rows from the employees table with the department number of 30.

- Write a query to select the name, job, and salary and department number of all employees except purchase clerks from department number 30.

- Display the employee name and department number of all employees in dept 10 and 30 in alphabetical order by name.

- Display the employee name, job_id and email of those employees who were hired between 1 Jan 1993 and 1 Dec 1995.Order the results in the ascending order of hiredate.

- Write a query to search for employees with the pattern 'A_B' in their name.

## 3. Joins

Write a query to display names of employees and department names of those employees who are working in Europe.

Write a query to display department wise details including the Manager’s name and if a particular department does not have any manager, display the message ‘no manager assigned yet’.

Display information on all the department managers.

Manager ID, Manager Name, His current department name and previous department name.

Display old job title and current job title for each employee in the organization.

## 4. SQL Functions

- Write a query to display second string of  job_title in the Jobs table only if the job_title has more than one string.

- Replace occurrences of Manager in the job_title of jobs table with analyst.

- Write a query to display the previous job history of the employees with years of experience in each job category.

- Write a query to display the details of employees with ‘ON BENCH’ value for department ID if no employees have been assigned to that department.

- Write a query to display revised salary for selected employees

a. If he is a manager give 50%hike

b. If he is a representative give 20%hike

c. if he is a programmer give 30%hike.

(Use case expression)

- Write a query to display country wise details with the region name.

(Use the data in the region table and use decode function)

## 5. Group Functions & Group by, Having Clause

- Find the number of employees working in each country with country name and no of employees.

- Find the number of employees   reporting to each department head.

- To return the number of employees and their average yearly salary across all possible combinations of department and job category.

Display department name, job_title, total no of employees, average salary.

# Solutions:

## 1. Using select statements

1. Write a query to list all the tables in HR schema

```sql
select * from employees;
```

2. Display employeeID, first name, last name, email, phone number from employees table.

```sql
select employee_id, first_name, last_name, email, phone_number from employees;
```

3. Display all columns of JOB_HISTORY table.

```sql
select * from job_history;
```

4. Display the first name, last name concatenated and appearing under the column “EMPLOYEE NAME”.

```sql
select concat(first_name, ' ', last_name) "Employee Name" from employees;
```

5. Write a query to display a sentence like Employee name working as JOB_ID for every employee record.

```sql
select concat(first_name, ' ', last_name, ' working as ', job_id) "Employee Name" from employees;
```

6. Write a query to display the names of all the employees with their annual salary.

```sql
select concat(first_name, ' ', last_name) "Employee Name", salary*12 "Annual Salary" from employees;
```

## 2. Scoping and ordering of rows

1. Write a query to select rows from the employees table with the department number of 30.

```sql
select * from employees where department_id = 30;
```

2. Write a query to select the name, job, and salary and department number of all employees except purchase clerks from department number 30.

```sql
select first_name, job_id, salary, department_id from employees where department_id = 30 and job_id != 'PU_CLERK';
```

3. Display the employee name and department number of all employees in dept 10 and 30 in alphabetical order by name.

```sql
select first_name, department_id from employees where department_id in (10, 30) order by first_name;
```

4. Display the employee name, job_id and email of those employees who were hired between 1 Jan 1993 and 1 Dec 1995.Order the results in the ascending order of hiredate.

```sql
select first_name, job_id, email from employees where hire_date between '1993-01-01' and '1995-12-01' order by hire_date;
```

5. Write a query to search for employees with the pattern 'A_B' in their name.

```sql
SELECT CONCAT(first_name, ' ', last_name) AS employee_name
FROM employees
WHERE first_name LIKE 'A_B' OR last_name LIKE 'A_B';
```

## 3. Joins

1. Write a query to display names of employees and department names of those employees who are working in Europe.

   ```sql
   select concat(first_name, ' ', last_name) "Employee Name", department_name from employees e join departments d on e.department_id = d.department_id where location_id in (select location_id from locations where country_id = 'IT' or country_id = 'UK');
   ```

2. Write a query to display department wise details including the Manager’s name and if a particular department does not have any manager, display the message ‘no manager assigned yet’.

   ```sql
   select department_name, concat(first_name, ' ', last_name) "Manager Name" from departments d join employees e on d.manager_id = e.employee_id union select department_name, 'No Manager Assigned Yet' from departments where manager_id is null;
   ```

3. Display information on all the department managers.

```sql
select concat(first_name, ' ', last_name) "Manager Name", department_name from employees e join departments d on e.employee_id = d.manager_id;
```

4. Manager ID, Manager Name, His current department name and previous department name.

```sql
select concat(e1.first_name, ' ', e1.last_name) "Manager Name", d1.department_name "Current Department", d2.department_name "Previous Department" from employees e1 join departments d1 on e1.employee_id = d1.manager_id join departments d2 on e1.employee_id = d2.manager_id;
```

5. Display old job title and current job title for each employee in the organization.

```sql
select e1.first_name, e1.last_name, j1.job_title "Current Job Title", j2.job_title "Previous Job Title" from employees e1 join jobs j1 on e1.job_id = j1.job_id join jobs j2 on e1.job_id = j2.job_id;
```
