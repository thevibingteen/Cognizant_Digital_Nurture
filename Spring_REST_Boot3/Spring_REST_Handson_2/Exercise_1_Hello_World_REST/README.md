# Exercise 1 - Hello World RESTful Web Service

## Objective

Create a simple REST API using Spring Boot that returns a Hello World message.

---

## Endpoint

**Method**

```
GET
```

**URL**

```
http://localhost:8083/hello
```

---

## Files

- SpringLearnApplication.java
- HelloController.java
- application.properties
- pom.xml

---

## Expected Response

```
Hello World!!
```

---

## Logging

The controller logs the start and end of the request execution using SLF4J.

---

## Conclusion

This exercise demonstrates creating a basic REST endpoint using Spring Boot with the `@RestController` and `@GetMapping` annotations.