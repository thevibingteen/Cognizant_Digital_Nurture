# Exercise 2 - Country REST Web Service

## Objective

Create a REST endpoint that returns the details of India by loading a bean from a Spring XML configuration file.

---

## Endpoint

**Method**

```
GET
```

**URL**

```
http://localhost:8083/country
```

---

## Files

- Country.java
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

## Spring Concepts Used

- @RestController
- @RequestMapping
- ApplicationContext
- ClassPathXmlApplicationContext
- XML Bean Configuration

---

## Conclusion

This exercise demonstrates how Spring loads a bean from an XML configuration file and automatically converts the Java object into a JSON response for a REST endpoint.