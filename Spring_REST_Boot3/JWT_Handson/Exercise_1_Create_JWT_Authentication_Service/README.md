# Exercise 1 - Create Authentication Service that Returns JWT

## Objective

Create a Spring Boot REST service that returns a JWT token as the authentication response.

---

## Endpoint

**Method**

```
GET
```

**URL**

```
http://localhost:8090/authenticate
```

---

## Sample Response

```json
{
  "token": "eyJhbGciOiJIUzI1NiJ9.demo.jwt.token"
}
```

---

## Files

- AuthenticationController.java
- AuthenticationResponse.java
- SecurityConfig.java
- SpringLearnApplication.java
- application.properties
- pom.xml

---

## Technologies Used

- Spring Boot
- Spring Security
- JWT (JJWT library)
- Maven

---

## Conclusion

This exercise demonstrates the creation of a basic authentication endpoint that returns a JWT response object. It serves as the foundation for implementing complete JWT-based authentication and authorization in subsequent exercises.