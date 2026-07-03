# Exercise 1 - Introduction to HQL and JPQL

## Objective

Understand the basic concepts of Hibernate Query Language (HQL) and Java Persistence Query Language (JPQL).

---

## What is HQL?

Hibernate Query Language (HQL) is an object-oriented query language provided by Hibernate. It is used to retrieve and manipulate data using Java entity classes instead of database tables.

### Features

- Uses entity class names instead of table names.
- Supports SELECT, UPDATE, DELETE and INSERT operations.
- Database independent.
- Works directly with Hibernate entities.

---

## What is JPQL?

Java Persistence Query Language (JPQL) is the standard query language defined by the Java Persistence API (JPA).

### Features

- Queries Java entities instead of database tables.
- Supports SELECT, UPDATE and DELETE operations.
- Portable across different JPA implementations.
- Easier to maintain than SQL in JPA applications.

---

## Difference Between HQL and JPQL

| HQL | JPQL |
|-----|------|
| Developed by Hibernate | Defined by JPA Specification |
| Supports INSERT | Does not support INSERT |
| Hibernate specific | Works with all JPA providers |
| Superset of JPQL | Subset of HQL |

---

## Advantages

- Reduces dependency on database-specific SQL.
- Improves code readability.
- Works directly with entity objects.
- Easy to integrate with Spring Data JPA.

---

## Conclusion

HQL and JPQL simplify database interaction by allowing developers to query Java objects instead of writing SQL queries. HQL provides additional features specific to Hibernate, while JPQL offers portability across JPA implementations.