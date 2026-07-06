# Account Microservice

## Objective

Develop a Spring Boot microservice that provides account details through a REST API.

---

## Endpoint

**GET**

```
/accounts/{number}
```

Example

```
http://localhost:8080/accounts/00987987973432
```

---

## Sample Response

```json
{
  "number": "00987987973432",
  "type": "Savings",
  "balance": 234343.0
}
```

---

## Technologies

- Java
- Spring Boot 3
- Spring Web
- Maven

---

## Result

Successfully implemented an independent Account Microservice that returns sample account information through a REST endpoint.