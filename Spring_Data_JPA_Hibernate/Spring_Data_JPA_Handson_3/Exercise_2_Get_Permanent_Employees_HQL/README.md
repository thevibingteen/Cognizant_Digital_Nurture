# Exercise 2 - Get All Permanent Employees Using HQL

## Objective

Retrieve all permanent employees using Hibernate Query Language (HQL).

## Files

- Employee.java
- Department.java
- Skill.java
- EmployeeRepository.java
- EmployeeService.java
- OrmLearnApplication.java
- application.properties
- pom.xml

## Concepts Used

- HQL
- @Query Annotation
- LEFT JOIN FETCH
- Spring Data JPA
- Repository Pattern

## Query Used

```java
SELECT e
FROM Employee e
LEFT JOIN FETCH e.department
LEFT JOIN FETCH e.skillList
WHERE e.permanent = true
```

## Result

The application retrieves all permanent employees together with their department and associated skills using a single optimized HQL query.