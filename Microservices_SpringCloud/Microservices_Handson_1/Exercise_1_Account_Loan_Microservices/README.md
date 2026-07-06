# Exercise 1 - Account and Loan Microservices

## Objective

Develop two independent Spring Boot microservices for a banking system.

- **Account Microservice** – Provides account information.
- **Loan Microservice** – Provides loan information.

Both services are standalone Spring Boot REST applications with separate Maven configurations and run on different ports.

---

## Project Structure

```text
Exercise_1_Account_Loan_Microservices
│
├── account
│   ├── Account.java
│   ├── AccountController.java
│   ├── AccountApplication.java
│   ├── application.properties
│   ├── pom.xml
│   └── README.md
│
├── loan
│   ├── Loan.java
│   ├── LoanController.java
│   ├── LoanApplication.java
│   ├── application.properties
│   ├── pom.xml
│   └── README.md
│
└── README.md
```

---

## REST Endpoints

### Account Service

**GET**

```
/accounts/{number}
```

Sample Response

```json
{
  "number": "00987987973432",
  "type": "Savings",
  "balance": 234343
}
```

---

### Loan Service

**GET**

```
/loans/{number}
```

Sample Response

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

## Key Concepts

- Microservices Architecture
- RESTful Web Services
- Independent Spring Boot Applications
- Maven Project Structure
- Port Configuration

---

## Result

Successfully developed two independent microservices for managing account and loan information, each running on its own server port and responding with sample REST API data.