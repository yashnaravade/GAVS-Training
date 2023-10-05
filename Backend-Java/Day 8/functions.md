# Single row functions

## 1. What is a single row function?

A single row function is a function that operates on a single row of data at a time and returns one result per row.

## 2. What are the different types of single row functions?

The different types of single row functions which are most commonly used are:

- Character functions
- Number functions
- Date functions
- Conversion functions
- General functions
- Analytical functions
- Grouping functions
- Advanced functions

## 3. What are character functions?

Character functions operate on character data. They can manipulate the character data, format the output and perform calculations on the character data.

- UPPER: Converts all the letters in the character string to uppercase.
- LOWER: Converts all the letters in the character string to lowercase.
- INITCAP: Converts the first letter of each word in the character string to uppercase and the rest of the letters to lowercase.
- LENGTH: Returns the length of the character string.
- CONCAT: Concatenates two character strings.
- SUBSTR: Returns a portion of the character string.
- INSTR: Returns the position of a character string within another character string.
- LPAD: Left pads the character string with a specified set of characters.
- RPAD: Right pads the character string with a specified set of characters.
- TRIM: Removes the specified characters from the beginning or the end of the character string.
- LTRIM: Removes the specified characters from the beginning of the character string.
- RTRIM: Removes the specified characters from the end of the character string.
- REPLACE: Replaces a sequence of characters in a character string with another set of characters.
- TRANSLATE: Replaces a sequence of characters in a character string with another set of characters.
- REGEXP_REPLACE: Replaces a sequence of characters in a character string with another set of characters using regular expressions.

## 4. What are number functions?

Number functions operate on numeric data. They can manipulate the numeric data, format the output and perform calculations on the numeric data.

- ROUND: Rounds the number to the specified number of decimal places.
- TRUNC: Truncates the number to the specified number of decimal places.
- MOD: Returns the remainder of the division of the first number by the second number.
- ABS: Returns the absolute value of the number.
- SIGN: Returns the sign of the number.
- CEIL: Returns the smallest integer greater than or equal to the number.
- FLOOR: Returns the largest integer less than or equal to the number.
- POWER: Returns the first number raised to the power of the second number.
- SQRT: Returns the square root of the number.
- EXP: Returns the exponential value of the number.
- LN: Returns the natural logarithm of the number.
- LOG: Returns the logarithm of the number to the base specified.
- SIN: Returns the sine of the number.

## 5. What are date functions?

Date functions operate on date data. They can manipulate the date data, format the output and perform calculations on the date data.

- SYSDATE: Returns the current date and time.
- CURRENT_DATE: Returns the current date.
- CURRENT_TIMESTAMP: Returns the current date and time.
- ADD_MONTHS: Returns the date after adding the specified number of months to the date.
- MONTHS_BETWEEN: Returns the number of months between two dates.
- NEXT_DAY: Returns the date of the next specified day of the week.
- LAST_DAY: Returns the date of the last day of the month.
- ROUND: Rounds the date to the specified unit.
- TRUNC: Truncates the date to the specified unit.
- EXTRACT: Returns the specified part of the date.
- TO_CHAR: Converts the date to a character string.
- TO_DATE: Converts the character string to a date.
- TO_TIMESTAMP: Converts the character string to a timestamp.

## 6. What are conversion functions?

Conversion functions convert a value from one datatype to another datatype.

- TO_CHAR: Converts a value from number or date datatype to character datatype.
- TO_NUMBER: Converts a value from character datatype to number datatype.
- TO_DATE: Converts a value from character datatype to date datatype.
- CAST: Converts a value from one datatype to another datatype.
- TRANSLATE: Converts a character string from one set of characters to another set of characters.
- DECODE: Compares a value with a list of values and returns another value when the match is found.
- NVL: Replaces a null value with another value.
- NVL2: Returns one value if the expression is not null and another value if the expression is null.
- NULLIF: Returns null if the two expressions are equal, otherwise returns the first expression.
- COALESCE: Returns the first non-null expression in the list.
- LNNVL: Returns true if the expression is null, otherwise returns false.
- NANVL: Returns the first expression if it is not a number, otherwise returns the second expression.
- NLS_CHARSET_DECL_LEN: Returns the length of the character set name.
- NLS_CHARSET_ID: Returns the character set ID number.
- NLS_CHARSET_NAME: Returns the name of the character set.
- etc.

## 7. What are general functions?

General functions are functions that do not fall into any of the other categories.

- GREATEST: Returns the greatest value in the list.
- LEAST: Returns the least value in the list.
- NULLIF: Returns null if the two expressions are equal, otherwise returns the first expression.
- COALESCE: Returns the first non-null expression in the list.
- LNNVL: Returns true if the expression is null, otherwise returns false.
- NANVL: Returns the first expression if it is not a number, otherwise returns the second expression.
- NLS_CHARSET_DECL_LEN: Returns the length of the character set name.
- NLS_CHARSET_ID: Returns the character set ID number.

## 8. What are analytical functions?

Analytical functions compute an aggregate value based on a group of rows and return multiple rows for each group.

- RANK: Returns the rank of each row in the group.
- DENSE_RANK: Returns the rank of each row in the group without gaps.
- ROW_NUMBER: Returns the sequential row number, starting with 1, within a group.
- FIRST: Returns the first value in the group.
- LAST: Returns the last value in the group.
- LAG: Returns the value of the column in the previous row.
- LEAD: Returns the value of the column in the next row.
- CUME_DIST: Returns the cumulative distribution of a value in a group.

## 9. What are grouping functions?

Grouping functions are functions that operate on groups of rows to give one result per group.

- GROUP_ID: Returns the ID number of the group.
- GROUPING: Returns 1 if the column is a superaggregate, otherwise returns 0.
- GROUPING_ID: Returns the ID number of the superaggregate.
- CUBE: Generates a result set that shows aggregates for all combinations of values in the selected columns.
- ROLLUP: Generates a result set that shows aggregates for a hierarchy of values in the selected columns.
- GROUPING SETS: Generates a result set that shows aggregates for a list of values in the selected columns.
- etc.

## 10. What are advanced functions?

Advanced functions are functions that are used to perform advanced operations.

- MODEL: Performs calculations on the cells of a multidimensional array.

## Examples of single row functions for String Manipulation using character functions

### 1. UPPER

Converts all the letters in the character string to uppercase.

```sql
SELECT UPPER('Hello World!') FROM dual;
```

### 2. LOWER

Converts all the letters in the character string to lowercase.

```sql
SELECT LOWER('Hello World!') FROM dual;
```

### Example of single row functions for number manipulation using number functions

### 1. ROUND

Rounds the number to the specified number of decimal places.

```sql
SELECT ROUND(123.456, 2) FROM dual;
```

### 2. TRUNC

Truncates the number to the specified number of decimal places.

```sql
SELECT TRUNC(123.456, 2) FROM dual;
```

### Example of single row functions for date manipulation using date functions

### 1. SYSDATE

Returns the current date and time.

```sql
SELECT SYSDATE FROM dual;
```

### 2. CURRENT_DATE

Returns the current date.

```sql
SELECT CURRENT_DATE FROM dual;
```

### 3. CURRENT_TIMESTAMP

Returns the current date and time.

```sql
SELECT CURRENT_TIMESTAMP FROM dual;
```

### Example of single row functions for conversion using conversion functions

### 1. TO_CHAR

Converts a value from number or date datatype to character datatype.

```sql
SELECT TO_CHAR(123.456) FROM dual;
```

### 2. TO_NUMBER

Converts a value from character datatype to number datatype.

```sql

SELECT TO_NUMBER('123.456') FROM dual;
```

### 3. TO_DATE

Converts a value from character datatype to date datatype.

```sql
SELECT TO_DATE('2021-01-01', 'YYYY-MM-DD') FROM dual;
```

### Example of single row functions for general functions

### 1. GREATEST

Returns the greatest value in the list.

```sql
SELECT GREATEST(1, 2, 3) FROM dual;
```

### 2. LEAST

Returns the least value in the list.

```sql
SELECT LEAST(1, 2, 3) FROM dual;
```

### Example of single row functions for analytical functions

### 1. RANK

Returns the rank of each row in the group.

```sql
SELECT RANK() OVER (ORDER BY salary DESC) AS rank, first_name, salary FROM employees;
```

### 2. DENSE_RANK

Returns the rank of each row in the group without gaps.

```sql
SELECT DENSE_RANK() OVER (ORDER BY salary DESC) AS rank, first_name, salary FROM employees;
```

### 3. ROW_NUMBER

Returns the sequential row number, starting with 1, within a group.

```sql
SELECT ROW_NUMBER() OVER (ORDER BY salary DESC) AS rank, first_name, salary FROM employees;
```

### 4. FIRST

Returns the first value in the group.

```sql
SELECT FIRST_VALUE(salary) OVER (ORDER BY salary DESC) AS first, first_name, salary FROM employees;
```

### 5. LAST

Returns the last value in the group.

```sql
SELECT LAST_VALUE(salary) OVER (ORDER BY salary DESC) AS last, first_name, salary FROM employees;
```