#  Employee RESTful API by Kagiso Aphane

A simple and robust RESTful API for managing employee records, built using **Java** and **Spring Boot 3.5.6**. This project demonstrates full CRUD operations and is ideal for learning, testing, or integrating into larger systems.

##  Features

- Create, Read, Update, and Delete employee data
- RESTful endpoints with JSON responses
- Exception handling and validation
- Tested using Postman
- Built and run in IntelliJ IDEA

##  Tech Stack

| Layer        | Technology             |
|--------------|------------------------|
| Language     | Java                   |
| Framework    | Spring Boot 3.5.6      |
| Build Tool   | Maven                  |
| IDE          | IntelliJ IDEA          |
| Testing Tool | Postman                |

```

##  API Endpoints

| Method | Endpoint                | Description              |
|--------|-------------------------|--------------------------|
| GET    | /api/v1/employees       | Get all employees        |
| GET    | /api/v1/employees/{id}  | Get employee by ID       |
| POST   | /api/v1/employees`      | Create new employee      |
| PUT    | /api/v1/employees/{id}  | Update employee by ID    |
| DELETE | /api/v1/employees/{id}  | Delete employee by ID    |

##  Testing with Postman

1. Import the collection or manually test endpoints.
2. Use `Content-Type: application/json` for POST and PUT.
3. Sample JSON for creating an employee:

```json
{
  "empId: "1",
  "name": "Kagiso Aphane",
  "email": "Ghost@capser.com",
  "position": "Java Developer"
}
```

##  Setup Instructions

### Prerequisites

- Java 17+
- Maven
- IntelliJ IDEA
- Postman

### Steps

1. Clone the repository:
   ```bash
   git clone https://github.com/kagisogaphane/employee_api.git
   ```

2. Open in IntelliJ IDEA and let Maven resolve dependencies.

3. Run the application:
   ```bash
   mvn spring-boot:run
   ```

4. Access API at:
   ```
   http://localhost:8080/api/v1/employees
   ```

##  Learning Outcomes

- Understanding of RESTful architecture
- Spring Boot annotations and structure
- Exception handling and validation
- API testing with Postman

##  Contributing

Feel free to fork, improve, and submit pull requests. For major changes, open an issue first to discuss what you'd like to change.

##  License

This project is licensed under the MIT License.

---
