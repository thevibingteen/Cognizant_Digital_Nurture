# Exercise 2 - Employee REST Service

## Objective

Develop a REST API to return the employee list stored in the Spring XML configuration.

---

## Endpoint

**GET**

```
http://localhost:8083/employees
```

---

## Files

- Employee.java
- Department.java
- Skill.java
- EmployeeDao.java
- EmployeeService.java
- EmployeeController.java
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

## Expected Response

The API returns a JSON array containing employee details loaded from the XML configuration.

---

## Concepts Used

- Spring REST Controller
- @Service
- @Repository
- XML Bean Configuration
- JSON Response

---

## Result

Successfully created a REST endpoint that returns the employee list from the Spring XML configuration.