# Account Service

## Objective

Register the Account Microservice with the Eureka Discovery Server.

---

## Port

```
8080
```

---

## Endpoint

```
GET /accounts/{number}
```

Example

```
http://localhost:8080/accounts/00987987973432
```

---

## Eureka Registration

```
http://localhost:8761
```

After the Eureka server starts, this service automatically registers itself.

---

## Technologies

- Spring Boot 3
- Spring Web
- Spring Cloud Netflix Eureka Client
- Maven

---

## Result

Successfully registered the Account Service with the Eureka Discovery Server and exposed a REST endpoint for retrieving account information.