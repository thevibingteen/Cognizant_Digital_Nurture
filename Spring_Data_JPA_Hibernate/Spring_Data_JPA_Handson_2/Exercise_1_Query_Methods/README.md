# Exercise 1 - Query Methods

## Objective

Demonstrate the use of Spring Data JPA query methods to retrieve data without writing SQL queries manually.

## Files

- pom.xml
- application.properties
- schema.sql
- data.sql
- Country.java
- CountryRepository.java
- CountryService.java
- OrmLearnApplication.java

## Query Methods Used

- findByNameContainingIgnoreCase()
- findByNameStartingWithIgnoreCase()
- findAllByOrderByNameAsc()

## Expected Output

```
Countries containing 'an'
Japan
Germany

Countries in alphabetical order
Australia
France
Germany
India
Japan
United States

Countries starting with 'A'
Australia
```