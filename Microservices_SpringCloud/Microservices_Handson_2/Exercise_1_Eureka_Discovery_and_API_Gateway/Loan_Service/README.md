# Loan Service

## Objective

Register the Loan Microservice with the Eureka Discovery Server.

---

## Port

```
8081
```

---

## Endpoint

```
GET /loans/{number}
```

Example

```
http://localhost:8081/loans/H00987987972342
```

---

## Eureka Registration

```
http://localhost:8761
```

After the Eureka server starts, this service automatically registers itself with the discovery server.

---

## Technologies

- Java 17
- Spring Boot 3
- Spring Cloud Netflix Eureka Client
- Spring Web
- Maven

---

## Sample Response

```json
{
  "number": "H00987987972342",
  "type": "Car",
  "loan": 400000,
  "emi": 3258,
  "tenure": 18
}
```

---

## Result

Successfully registered the Loan Service with the Eureka Discovery Server and exposed a REST endpoint for retrieving loan details.