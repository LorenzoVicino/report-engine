# Report Engine
Report Engine is a Spring Boot application designed to create reports dynamically based on user-defined columns. It provides a REST API for creating reports and is built with Java and Maven.

## ✨ Features

- Dynamic report generation based on selected columns
- RESTful API endpoints for creating and retrieving reports
- Support for multiple output formats (e.g., JSON, CSV, EXCEL, PDF)
- Modular and extensible architecture

## 🧱 Tech Stack

- Java
- Spring Boot  
- Spring Web / Spring Data JPA  
- Maven  
- PostgreSQL / H2 (dev mode)  
- Lombok  
- MapStruct (optional, if used for DTO mapping)

## 🚀 Getting Started

### Prerequisites

- Java 17+
- Maven 3.6+
- A running PostgreSQL database (or use H2 for dev/testing)

### Clone and Run

```bash
git clone https://github.com/lorenzovicino/report-engine.git
cd report-engine
./mvnw spring-boot:run
```

### Configuration

Modify the `application.yaml` file to configure the database and other settings:

```yaml
spring:
  datasource:
    url: jdbc:postgresql://localhost:5432/reportdb
    username: youruser
    password: yourpassword
```

Or switch to H2 for local development:

```yaml
spring:
  datasource:
    url: jdbc:h2:mem:reportdb;DB_CLOSE_DELAY=-1
    driver-class-name: org.h2.Driver
```

## 🛠 API Usage

### Create a Report

`POST /api/reports`

**Request Body:**
```json
{
  "columns": ["name", "email", "registrationDate"],
  "filters": {
    "active": true
  }
}
```

**Response:**
```json
{
  "reportId": "abc123",
  "status": "READY",
  "downloadUrl": "/api/reports/abc123/download"
}
```

### Download Report

`GET /api/reports/{reportId}/download`

## ✅ TODO

- Add security (JWT / OAuth2)
- Add export to PDF
- Add scheduling for automatic report generation
- Add Swagger/OpenAPI documentation

## 📦 Build

```bash
./mvnw clean package
```

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
