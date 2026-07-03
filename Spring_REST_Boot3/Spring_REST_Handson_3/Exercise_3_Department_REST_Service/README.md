# Exercise 3 - Department REST Service

## Objective

Create a REST API to return the list of departments configured in Spring XML.

---

## Endpoint

**GET**

```
http://localhost:8083/departments
```

---

## Files

- Department.java
- DepartmentDao.java
- DepartmentService.java
- DepartmentController.java
- employee.xml
- SpringLearnApplication.java

---

## Architecture

```
Controller
      ↓
Service
      ↓
DAO
      ↓
employee.xml
```

---

## Sample Response

```json
[
  {
    "id": 1,
    "name": "IT"
  },
  {
    "id": 2,
    "name": "Human Resources"
  },
  {
    "id": 3,
    "name": "Finance"
  }
]
```

---

## Technologies Used

- Spring Boot
- Spring REST
- Spring XML Configuration
- Maven

---

## Result

Successfully created a REST endpoint that returns department information loaded from the Spring XML configuration.