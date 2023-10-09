# Assignment: SQL:

```sql
-- Create the Studies table
CREATE TABLE Studies (
    PNAME VARCHAR(50),
    INSTITUTE VARCHAR(50),
    COURSE VARCHAR(50),
    COURSE_FEE INT
);

-- Insert data into the Studies table
INSERT INTO Studies (PNAME, INSTITUTE, COURSE, COURSE_FEE)
VALUES
    ('ANAND', 'SABBHARI', 'PGDCA', 4500),
    ('ALTAF', 'COIT', 'DCA', 7200),
    ('JULIANA', 'BOPS', 'MCA', 22000),
    ('KAMALA', 'PRAGATHI', 'DCA', 5000),
    ('MARY', 'SABHARI', 'PGDCA', 4500),
    ('NELSON', 'PRAGATHI', 'DAP', 6200),
    ('PATRIK', 'PRAGATHI', 'DCAP', 5200),
    ('QADIR', 'APPLE', 'HDCA', 14000),
    ('RAMESH', 'SABHARI', 'PGDCA', 4500),
    ('REBECCA', 'BRILLIANT', 'DCAP', 11000),
    ('REMTHA', 'BDPS', 'DCS', 6000),
    ('REVATHI', 'SABHARI', 'DAP', 5000),
    ('VIJAYA', 'BDPS', 'DCA', 48000);

-- Create the SOFTWARE table
CREATE TABLE SOFTWARE (
    PNAME VARCHAR(50),
    TITLE VARCHAR(50),
    DEVELOPIN VARCHAR(50),
    SCOST DECIMAL(10, 2),
    DCOST DECIMAL(10, 2),
    SOLD INT
);

-- Insert data into the SOFTWARE table
INSERT INTO SOFTWARE (PNAME, TITLE, DEVELOPIN, SCOST, DCOST, SOLD)
VALUES
    ('MARY', 'README', 'CPP', 300.00, 1200.00, 84),
    ('ANAND', 'PARACHUTES', 'BASIC', 399.95, 6000.00, 43),
    ('ANAND', 'VIDEO TITLING', 'PASCAL', 7500.00, 16000.00, 9),
    ('JULIANA', 'INVENTORY', 'COBOL', 3000.00, 3500.00, 0),
    ('KAMALA', 'PAYROLL PACKAGE', 'DBASE', 9000.00, 20000.00, 7),
    ('AMRY', 'FINANCIAL ACCT.', 'ORACLE', 18000.00, 85000.00, 4),
    ('MARY', 'CODE GENERATOR', 'C', 4500.00, 20000.00, 23),
    ('PATTRICK', 'README', 'CPP', 300.00, 1200.00, 84),
    ('QADIR', 'BOMBS AWAY', 'ASSEMBLY', 750.00, 3000.00, 11),
    ('QADIR', 'VACCINES', 'C', 1900.00, 3100.00, 21),
    ('RAMESH', 'HOTEL MGMT.', 'DBASE', 13000.00, 35000.00, 4),
    ('RAMESH', 'DEAD LEE', 'PASCAL', 5999.95, 4500.00, 73),
    ('REMITHA', 'PC UTILITIES', 'C', 725.00, 5000.00, 51),
    ('REMITHA', 'TSR HELP PKG.', 'ASSEMBLY', 2500.00, 6000.00, 7),
    ('REVATHI', 'HOSPITAL MGMT.', 'PASCAL', 1100.00, 75000.00, 2),
    ('VIJAYA', 'TSR EDITOR', 'C', 900.00, 700.00, 6);

-- Create the PROGRAMMER table
CREATE TABLE PROGRAMMER (
    PNAME VARCHAR(50),
    DOB DATE,
    DOJ DATE,
    GENDER CHAR(1),
    PROF1 VARCHAR(50),
    PROF2 VARCHAR(50),
    SALARY DECIMAL(10, 2)
);

-- Insert data into the PROGRAMMER table
INSERT INTO PROGRAMMER (PNAME, DOB, DOJ, GENDER, PROF1, PROF2, SALARY)
VALUES
    ('ANAND', '1966-04-12', '1992-04-21', 'M', 'PASCAL', 'BASIC', 3200.00),
    ('ALTAF', '1964-07-02', '1990-11-13', 'M', 'CLIPPER', 'COBOL', 2800.00),
    ('JULIANA', '1960-01-31', '1990-04-21', 'F', 'COBOL', 'DBASE', 3000.00),
    ('KAMALA', '1968-08-30', '1992-01-02', 'F', 'C', 'DBASE', 2900.00),
    ('AMRY', '1970-06-24', '1991-02-01', 'F', 'CPP', 'ORACLE', 4500.00),
    ('NELSON', '1985-09-11', '1989-08-11', 'M', 'COBOL', 'DBASE', 2500.00),
    ('PATTRIK', '1965-11-10', '1990-04-21', 'M', 'PASCAL', 'CLIPPER', 2800.00),
    ('QADIR', '1965-08-31', '1991-04-21', 'M', 'ASSEMBLY', 'C', 3000.00),
    ('RAMESH', '1967-05-03', '1991-02-28', 'M', 'PASCAL', 'DBASE', 3200.00),
    ('REBECCA', '1967-01-01', '1990-12-01', 'F', 'BASIC', 'COBOL', 2500.00),
    ('REMITHA', '1970-04-19', '1993-04-20', 'F', 'C', 'ASSEMBLY', 3600.00),
    ('REVATHI', '1969-12-02', '1992-01-02', 'F', 'PASCAL', 'BASIC', 3700.00),
    ('VIJAYA', '1965-12-14', '1992-05-02', 'F', 'FOXPRO', 'C', 3500.00);
```

# Questions:

1. Find out the selling cost avg for packages developed in pascal
2. Display name , ages of all programmers
3. Display the names of those who have done the Dap course
4. Display the name and DOB of all programmers born in January
5. What is the highest no. of copies sold by a package
6. Display lowest course fee
7. How many programmers done a PGDCA course
8. How much revenue has been earned through sales of packages developed in C
9. Display the details of the software developed by ramesh
10. How many programmers studied at sabhari
11. Display details of packages whose sales crossed the 2000 mark
12. Display the details of packages for which the development cost have been recovered
13. What is the costliest software development in the basic
14. How many packages developed in dbase
15. How many programmers studied in pragathi
16. How many programmers payed 5000 to 10000 for their course
17. What is AVG course fee
18. Display the details of the programmers knowing C
19. How many programmers know either cobol or pascal
20. How Many programmers don’t know pascal and C
21. How old is the oldest male programmer?
22. What is the avg age of female programmer?
23. Calculate the experience in years for each programmers and display with their names in descending order
24. Who are the programmers who celebrate their birthday during the current month
25. How many females programmers are their
26. What are the languages studied by the male programmers
27. What is the AVG salary
28. How many people draw salary 2000-4000
29. Display the details of those who don’t know clipper , cobol or pascal
30. Display the cost of package developed by each programmer
31. Display the sales values of the packages developed by the each programmer
32. Display the no. of packages sold by each programmer
33. Display the sales cost of the packages developed by each programmer language wise
34. Display each language name with AVG development cost, AVG selling cost and AVG price per copy
35. Display each institute name with no. of course , avg. cost per course
36. Display each institute name with no. of courses , avg cost for per course
37. Display each institute name for with no. of students
38. Display names of male and female programmers, gender also
39. Display the name of programmers and their packages
40. Display the no. of packages in each language expect C and C++
41. Display the no. of packages in each language for which development cost is less than 1000
42. Display the total SCOST , DCOST AND Amount to be recovered for each programmer for those whose cost has not yet been recovered
43. Display AVG difference between SCOST,DCOST for each packages
44. Display highest, lowest and average salaries for those earning more than 2000
45. Who is the highest paid C programmer
46. Who is the highest paid female programmer
47. Display the name of the highest paid programmers for each language
48. Who is the least experience programmer
49. Who is the most experience male programmer knowing pascal
50. Which language is known by only one programmer
51. Who is the above programmer refered in 50
52. Who is the youngest programmer knowing DBASE
53. Which female programmer earning more than 3000 does not know C C++ Oracle or DBASE
54. Which institute has most no. of students
55. What is the costliest Course
56. Which course has been done by the most of the students
57. Which institute conduct costliest course
58. Display the name of the institute and course which has below avg course fee
59. Display the name of the courses whose fees are within 1000 of the avg fee
60. Which package has the highest development cost
61. Which course has below avg number of students
62. Which package has the lowest selling cost
63. Who developed the package that has sold the least no of copies
64. Which language has used to develop the package, which has the highest sales amount
65. How many copies of package that has the least difference between development and selling cost where sold
66. Which is the costliest package developed in PASCAL
67. Which language used to develop the most no of packages
68. Which programmer has developed the highest no of packages
69. Who is the author of costliest package
70. Display the names of the packages which have sold less than the avg. no. of copies
71. Who are the authors of packages which have recovered more than double the development cost
72. Display the programmer name and the cheapest package developed by them in each language
73. Display the language used by each programmer to develop the highest selling and lowest selling package
74. Who is the youngest male programmer born in 1965
75. Who is the oldest female programmer who joined in 1992
76. In which year was the most no of programmer born
77. In which month did most no of programmer join
78. In which language are most of the programmer proficient
79. Who are the main programmer earning below the avg. salary of female programmers
80. Who are the female programmer earning more than the highest paid
81. Which language has been stated as the prof by most prof programmers
82. Display the details of those who are drawing the same salary
83. Display the details of the software developed by the male programmer earning more than 3000
84. Display the details of the packages developed in PASCAL by the female programmer
85. Display the details of the programmer who joined before 1990

# Answers:

1. SELECT AVG(SCOST) FROM SOFTWARE WHERE DEVELOPIN = 'PASCAL';
2. SELECT PNAME, DATEDIFF(CURDATE(), DOB) / 365 AS AGE FROM PROGRAMMER;
3. SELECT PNAME FROM STUDIES WHERE COURSE = 'DAP';
4. SELECT PNAME, DOB FROM PROGRAMMER WHERE MONTH(DOB) = 1;
5. SELECT MAX(SOLD) FROM SOFTWARE;
6. SELECT MIN(COURSE_FEE) FROM STUDIES;
7. SELECT COUNT(\*) FROM STUDIES WHERE COURSE = 'PGDCA';
8. SELECT SUM(SCOST) FROM SOFTWARE WHERE DEVELOPIN = 'C';
9. SELECT \* FROM SOFTWARE WHERE PNAME = 'RAMESH';
10. SELECT COUNT(\*) FROM STUDIES WHERE INSTITUTE = 'SABBHARI';
11. SELECT \* FROM SOFTWARE WHERE SOLD > 2000;
12. SELECT \* FROM SOFTWARE WHERE SCOST < DCOST;
13. SELECT MAX(SCOST) FROM SOFTWARE WHERE DEVELOPIN = 'BASIC';
14. SELECT COUNT(\*) FROM SOFTWARE WHERE DEVELOPIN = 'DBASE';
15. SELECT COUNT(\*) FROM STUDIES WHERE INSTITUTE = 'PRAGATHI';
16. SELECT COUNT(\*) FROM STUDIES WHERE COURSE_FEE BETWEEN 5000 AND 10000;
17. SELECT AVG(COURSE_FEE) FROM STUDIES;
18. SELECT \* FROM PROGRAMMER WHERE PROF1 = 'C' OR PROF2 = 'C';
19. SELECT COUNT(\*) FROM PROGRAMMER WHERE PROF1 = 'COBOL' OR PROF2 = 'COBOL' OR PROF1 = 'PASCAL' OR PROF2 = 'PASCAL';
20. SELECT COUNT(\*) FROM PROGRAMMER WHERE PROF1 != 'PASCAL' AND PROF2 != 'PASCAL' AND PROF1 != 'C' AND PROF2 != 'C';
