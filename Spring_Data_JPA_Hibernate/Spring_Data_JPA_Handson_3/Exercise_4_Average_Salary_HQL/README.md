# Exercise 4 - Get Average Salary Using HQL

## Objective

Use Hibernate Query Language (HQL) to calculate the average salary of employees belonging to a specific department.

---

## Files

- Employee.java
- Department.java
- EmployeeRepository.java
- EmployeeService.java
- OrmLearnApplication.java

---

## HQL Query

```java
SELECT AVG(e.salary)
FROM Employee e
WHERE e.department.id = :id
```

---

## Concepts Used

- HQL Aggregate Function
- AVG()
- @Query Annotation
- @Param Annotation
- Spring Data JPA

---

## Expected Output

```
Average Salary : 65000.0
```

---

## Conclusion

This exercise demonstrates how aggregate functions such as `AVG()` can be used with HQL to calculate summary values from entity data while filtering by department.