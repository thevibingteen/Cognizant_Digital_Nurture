# Hands-on 4 – Difference between JPA, Hibernate and Spring Data JPA

## Objective

Understand the relationship between JPA, Hibernate, and Spring Data JPA and compare their roles in Java enterprise application development.

---

## What is JPA?

Java Persistence API (JPA) is a Java specification that defines how Java objects can be mapped to relational database tables.

### Features

- Standard persistence specification
- Uses annotations like `@Entity` and `@Table`
- Provides interfaces such as `EntityManager`
- Does not provide its own implementation

---

## What is Hibernate?

Hibernate is a popular Object Relational Mapping (ORM) framework that implements the JPA specification.

### Features

- Complete implementation of JPA
- Maps Java objects to database tables
- Supports HQL (Hibernate Query Language)
- Handles caching and lazy loading
- Reduces SQL writing

---

## What is Spring Data JPA?

Spring Data JPA is a Spring module built on top of JPA.

It simplifies database operations by reducing boilerplate code.

### Features

- Uses existing JPA implementations such as Hibernate
- Automatically generates CRUD methods
- Supports pagination and sorting
- Manages transactions through Spring
- Reduces repository implementation code

---

## Comparison

| Feature | JPA | Hibernate | Spring Data JPA |
|----------|-----|-----------|-----------------|
| Type | Specification | Framework | Spring Module |
| Database Mapping | Yes | Yes | Uses JPA |
| Implementation | No | Yes | No |
| CRUD Support | Manual | Manual | Automatic |
| Transaction Support | Limited | Yes | Spring Managed |
| Boilerplate Code | High | Medium | Low |

---

## Hibernate Example

```java
Session session = factory.openSession();
Transaction transaction = session.beginTransaction();

session.save(employee);

transaction.commit();
session.close();
```

---

## Spring Data JPA Example

```java
@Repository
public interface EmployeeRepository
        extends JpaRepository<Employee, Integer> {

}
```

```java
@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    @Transactional
    public void addEmployee(Employee employee) {
        repository.save(employee);
    }

}
```

---

## Conclusion

JPA defines the persistence standard.

Hibernate is one of the most widely used implementations of JPA.

Spring Data JPA builds on top of JPA and Hibernate to simplify repository development by minimizing boilerplate code and providing ready-to-use CRUD operations.

---

## Outcome

This hands-on explains how JPA, Hibernate, and Spring Data JPA are related and demonstrates how Spring Data JPA makes persistence code simpler compared to using Hibernate directly.