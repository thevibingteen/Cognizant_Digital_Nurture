# Exercise 5 - Get All Employees Using Native Query

## Objective

Demonstrate the use of a Native SQL Query in Spring Data JPA.

---

## Files

- Employee.java
- EmployeeRepository.java
- EmployeeService.java
- OrmLearnApplication.java
- application.properties
- pom.xml

---

## Native Query

```java
@Query(value = "SELECT * FROM employee",
       nativeQuery = true)
```

---

## Concepts Used

- Native SQL Query
- @Query Annotation
- nativeQuery = true
- Spring Data JPA Repository
- Service Layer

---

## Expected Output

```
Employee List

1 - Rahul - 55000.0
2 - Priya - 62000.0
3 - Aman - 71000.0
```

---

## Conclusion

This exercise demonstrates how native SQL queries can be executed using Spring Data JPA. While HQL is generally preferred for portability, native queries are useful when database-specific SQL features are required.