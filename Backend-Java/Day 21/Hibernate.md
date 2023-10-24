# Hibernate

Hibernate is an ORM (Object Relational Mapping) tool that is used to persistently store the Java objects into the relational database. It is just a framework that provides the implementation of JPA (Java Persistence API). It internally uses JDBC API, but eliminates a lot of problems of JDBC API. It is open source and lightweight ORM tool that performs powerful object-relational mapping and query databases using HQL and SQL. Hibernate maps the Java classes to the database tables. It also provides the data query and retrieval facilities that significantly reduces the development time. Hibernate is a high-performance ORM tool. It is faster than other ORM tools because of its less overhead feature.

## Advantages of Hibernate Framework

- Hibernate framework provides the facility to create the tables of the database automatically. So there is no need to create tables in the database manually.
- Hibernate framework provides the facility to update the database tables automatically, based on the configuration we make in the XML file.
- Hibernate framework provides the facility to write the database logic in the independent object called POJO (Plain Old Java Object) class. In hibernate framework, we provide the data with the help of POJO classes to the database tables.
- Hibernate framework provides the facility to write the HQL (Hibernate Query Language) queries instead of native SQL queries. So database portability is there. HQL queries are database independent queries. So if we use HQL queries, we can switch the database without changing the queries.
- Hibernate framework provides the facility to represent the inheritance relationship between classes. So object relational impedance mismatch problem is solved.
- Hibernate framework provides the facility to represent one-to-one, one-to-many, many-to-one and many-to-many relationships between classes. So object relational impedance mismatch problem is solved.
- Hibernate framework provides the facility to represent the associations between classes. So object relational impedance mismatch problem is solved.
- Hibernate framework provides the facility to represent the collections between classes. So object relational impedance mismatch problem is solved.

## Disadvantages of Hibernate Framework

- Hibernate framework provides the facility to create the tables of the database automatically. So we don't have any control over the creation of the tables. So we can't create the tables with the indexes.
- Hibernate framework provides the facility to update the database tables automatically, based on the configuration we make in the XML file. So we don't have any control over the updation of the tables. So we can't update the tables with the indexes.
- Hibernate framework provides the facility to write the database logic in the independent object called POJO (Plain Old Java Object) class. So we can't write the database logic in the database specific SQL queries. So we can't use the database specific features like stored procedures, functions, etc.

## Hibernate Architecture

![Hibernate Architecture](https://static.javatpoint.com/hibernate/images/hibernate-architecture.png)

The Hibernate architecture includes many objects persistent object, session factory, transaction factory, connection factory, session, transaction etc. 
The following figure shows the architecture of Hibernate:

- **Configuration object:** The Configuration object is created by the application by reading the hibernate configuration file (hibernate.cfg.xml). This object is used to create the SessionFactory object.
- **SessionFactory object:** The SessionFactory object is created by the Configuration object. It is a factory of session and client of ConnectionProvider. It holds second level cache (optional) of data. The org.hibernate.SessionFactory interface provides factory method to get the object of Session.
- **Session object:** The session object provides an interface between the application and data stored in the database. It is a short-lived object and wraps the JDBC connection. It is factory of Transaction, Query and Criteria. It holds a first-level cache (mandatory) of data. The org.hibernate.Session interface provides methods to insert, update and delete the object. It also provides factory methods for Transaction, Query and Criteria.
- **Transaction object:** The transaction object specifies the atomic unit of work. It is optional. The org.hibernate.Transaction interface provides methods for transaction management.
- **Query object:** The Query object is used to retrieve data from the database. The org.hibernate.Query interface provides methods to retrieve data from the database and bind the parameters.
- **Criteria object:** The Criteria object is used to create and execute object oriented criteria queries to retrieve objects. The org.hibernate.Criteria interface provides methods to retrieve data from the database.
- **Persistent object:** The persistent object is a plain old Java object (POJO) class, which is mapped to the database table. The instance of the persistent class represents a single row in the database table. For example: if the Employee table has three columns id, name and salary, then the persistent class may be as follows:

```java
public class Employee{
private int id;
private String name;
private float salary;
//setters and getters
}
```

## Hibernate CRUD Operations

CRUD stands for create, retrieve, update and delete. Hibernate provides methods to store, update, delete and retrieve objects from the database. The following table describes the methods provided by the Hibernate Session interface:

| S.N. | Methods | Description |
| ---- | ------- | ----------- |
| 1 | public Serializable save(Object obj) | It is used to save the object into the database. |
| 2 | public void update(Object obj) | It is used to update the object into the database. |
| 3 | public void delete(Object obj) | It is used to delete the object into the database. |
| 4 | public Object get(Class c, Serializable id) | It is used to get the record of the given id. |
| 5 | public Object load(Class c, Serializable id) | It is used to load the record of the given id. |
| 6 | public List getAll(Class c) | It is used to get all the records of the given class name. |

## Hibernate CRUD Example

Let's see the simple example of hibernate CRUD operations.

### Student.java

```java
package com.Yash.HibernateDemo;

public class Student {
private int id;
private String name;
private String email;
private String course;
private float fee;
//setters and getters
}
```

### HibernateUtil.java

```java
package com.Yash.HibernateDemo;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
private static final SessionFactory sessionFactory;
static {
try {
sessionFactory = new Configuration().configure().buildSessionFactory();
} catch (Throwable ex) {
System.err.println("Initial SessionFactory creation failed." + ex);
throw new ExceptionInInitializerError(ex);
}
}
public static SessionFactory getSessionFactory() {
return sessionFactory;
}
}
```

### StudentDao.java

```java
package com.Yash.HibernateDemo;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class StudentDao {
public static int save(Student s) {
int status = 0;
Session session = HibernateUtil.getSessionFactory().openSession();
Transaction t = session.beginTransaction();
status = (Integer) session.save(s);
t.commit();
session.close();
return status;
}
public static int update(Student s) {
int status = 0;
Session session = HibernateUtil.getSessionFactory().openSession();
Transaction t = session.beginTransaction();
session.update(s);
t.commit();
session.close();
return status;
}
public static int delete(Student s) {
int status = 0;
Session session = HibernateUtil.getSessionFactory().openSession();
Transaction t = session.beginTransaction();
session.delete(s);
t.commit();
session.close();
return status;
}
public static Student getStudentById(int id) {
Student s = null;
Session session = HibernateUtil.getSessionFactory().openSession();
Transaction t = session.beginTransaction();
s = (Student) session.get(Student.class, id);
t.commit();
session.close();
return s;
}
public static List<Student> getAllStudents() {
List<Student> list = null;
Session session = HibernateUtil.getSessionFactory().openSession();
Transaction t = session.beginTransaction();
list = session.createQuery("from Student").list();
t.commit();
session.close();
return list;
}
}
```

### Test.java

```java
package com.Yash.HibernateDemo;

import java.util.Iterator;
import java.util.List;

public class Test {
public static void main(String[] args) {
// TODO Auto-generated method stub
Student s1 = new Student();
s1.setName("Yash");
s1.setEmail("yash@gmail.com");
s1.setCourse("Hibernate");
s1.setFee(5000);
Student s2 = new Student();
s2.setName("Aarya");
s2.setEmail("aarya@gmail.com");
s2.setCourse("Hibernate");
s2.setFee(5000);
Student s3 = new Student();
s3.setName("Raj");
s3.setEmail("raj@gmail.com");
s3.setCourse("Hibernate");
s3.setFee(5000);

StudentDao.save(s1);
StudentDao.save(s2);
StudentDao.save(s3);

s3.setFee(6000);
StudentDao.update(s3);

StudentDao.delete(s2);

Student s = StudentDao.getStudentById(1);

```

```java
List<Student> list = StudentDao.getAllStudents();   
Iterator<Student> itr = list.iterator();
while (itr.hasNext()) {
Student st = itr.next();
System.out.println(st.getId() + " " + st.getName() + " " + st.getEmail() + " " + st.getCourse() + " " + st.getFee());
}
}
}
```

## Hibernate Query Language (HQL)

HQL stands for Hibernate Query Language. Hibernate provides HQL (Hibernate Query Language) for performing the database operations. HQL is an object-oriented query language similar to SQL. Hibernate supports the various object-oriented features like inheritance, polymorphism, association, composition etc. So we can use the object-oriented features in HQL. HQL is database independent query language. So we can write database independent queries. HQL queries are translated by Hibernate into conventional SQL queries, which in turns perform action on database. HQL is useful when we are working with the persistent objects. HQL is similar to SQL except that we use the class name instead of table name in the HQL. HQL is translated by Hibernate into conventional SQL queries, which in turns perform action on database. HQL supports the various object-oriented features like inheritance, polymorphism, association, composition etc. So we can use the object-oriented features in HQL. HQL is database independent query language. So we can write database independent queries. HQL queries are translated by Hibernate into conventional SQL queries, which in turns perform action on database. HQL is useful when we are working with the persistent objects. HQL is similar to SQL except that we use the class name instead of table name in the HQL.