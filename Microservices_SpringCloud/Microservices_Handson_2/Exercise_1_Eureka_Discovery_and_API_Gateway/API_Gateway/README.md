# API Gateway

## Objective

Create an API Gateway that routes requests to registered microservices using Eureka Discovery Server.

---

## Port

```
8082
```

---

## Features

- Eureka Client
- Automatic Service Discovery
- Dynamic Routing
- Global Request Logging

---

## Technologies

- Spring Boot 3
- Spring Cloud Gateway
- Eureka Client
- Maven

---

## Gateway URLs

Account Service

```
http://localhost:8082/account-service/accounts/00987987973432
```

Loan Service

```
http://localhost:8082/loan-service/loans/H00987987972342
```

---

## Result

Successfully created an API Gateway that discovers registered services through Eureka and routes incoming requests dynamically while logging every request using a Global Filter.