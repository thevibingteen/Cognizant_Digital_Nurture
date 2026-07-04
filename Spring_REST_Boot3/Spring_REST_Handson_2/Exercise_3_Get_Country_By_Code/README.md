# Exercise 3 - Get Country by Country Code

## Objective

Create a REST endpoint that returns a country's details based on its ISO code.

---

## Endpoint

**Method**

```
GET
```

**URL**

```
http://localhost:8083/countries/{code}
```

Example:

```
http://localhost:8083/countries/in
```

---

## Features

- Uses `@GetMapping`
- Uses `@PathVariable`
- Loads country data from `country.xml`
- Performs a case-insensitive search using Java Stream API
- Returns the matching country as a JSON response

---

## Files

- Country.java
- CountryService.java
- CountryController.java
- SpringLearnApplication.java
- country.xml
- application.properties
- pom.xml

---

## Sample Response

```json
{
  "code": "IN",
  "name": "India"
}
```

---

## Conclusion

This exercise demonstrates how Spring Boot can use path variables and a service layer to fetch and return data dynamically based on user input.