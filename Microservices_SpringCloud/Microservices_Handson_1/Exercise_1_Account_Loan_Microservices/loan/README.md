# Loan Microservice

## Objective

Develop a Spring Boot REST microservice that returns loan account information using a dummy response without database connectivity.

---

## Endpoint

**GET**

```
/loans/{number}
```

Example

```
http://localhost:8081/loans/H00987987972342
```

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

## Technologies Used

- Java
- Spring Boot 3
- Spring Web
- Maven

---

## Result

Successfully implemented an independent Loan Microservice that returns sample loan details through a REST endpoint running on port **8081**.