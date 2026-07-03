# Exercise 6 - Criteria Query

## Objective

Understand the concept of Criteria Query in Spring Data JPA.

---

## Scenario

An online shopping website allows users to search products using multiple filters such as:

- RAM
- Price
- Category
- Brand

The search conditions are different for every user.

---

## Why Criteria Query?

Criteria Query helps in creating SQL queries dynamically instead of writing fixed HQL statements.

It is useful when filters change at runtime.

---

## Advantages

- Dynamic query generation
- Easy to maintain
- Type-safe API
- Suitable for multiple search conditions

---

## Example

Search laptops where

- RAM >= 16 GB
- Price < ₹70000
- Category = Electronics

---

## Output

```

Available Products

Laptop A | RAM : 16 GB

Laptop B | RAM : 32 GB

```

---

## Conclusion

Criteria Query provides a flexible way to build queries programmatically. It is commonly used in applications where users can apply multiple search filters.