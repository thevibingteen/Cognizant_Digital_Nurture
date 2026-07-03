# Exercise 4 - Find Country by Code

## Objective

Retrieve a country record from the database using its country code.

## Files

- Country.java
- CountryRepository.java
- CountryService.java
- CountryNotFoundException.java
- OrmLearnApplication.java
- application.properties

## Features

- Uses Spring Data JPA's `findById()` method.
- Throws a custom exception if the country is not found.
- Demonstrates the use of the `@Transactional` annotation.
- Tests the functionality from the main application.

## Result

The application successfully retrieves a country using its code and displays its details. If the code does not exist, a custom exception is generated.