# Exercise 3 - Fetch Quiz Attempt Details using HQL

## Objective

Retrieve quiz attempt details using Hibernate Query Language (HQL).

---

## Files

- User.java
- Attempt.java
- Question.java
- Option.java
- AttemptQuestion.java
- AttemptOption.java
- AttemptRepository.java
- AttemptService.java
- OrmLearnApplication.java

---

## Concepts Used

- Hibernate Query Language (HQL)
- JOIN FETCH
- Spring Data JPA
- Repository Pattern
- Service Layer

---

## HQL Query

```java
SELECT a
FROM Attempt a
JOIN FETCH a.user
JOIN FETCH a.questions aq
JOIN FETCH aq.question q
JOIN FETCH q.options
WHERE a.user.id = :userId
AND a.id = :attemptId
```

---

## Output

```
User : Rahul

Attempt Date : 2025-07-10

Question 1

- Java
- Python
- C++
- JavaScript

Question 2

- Spring
- Hibernate
- SQL
- HTML
```

---

## Conclusion

This exercise demonstrates how HQL with `JOIN FETCH` can retrieve related entities in a single query, reducing unnecessary database calls and improving performance.