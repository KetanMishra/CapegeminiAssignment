# Capgemini Java Advanced Assignment 🚀

A comprehensive collection of Java advanced concepts and practical implementations covering JPA/Hibernate, Spring Framework, Spring Boot, Spring MVC, REST APIs, JUnit testing, Mockito, Collections & Streams, and various design patterns.

## 📋 Table of Contents

- [Projects Overview](#projects-overview)
- [Technologies Used](#technologies-used)
- [Getting Started](#getting-started)
- [Project Structure](#project-structure)
- [How to Run](#how-to-run)
- [Configuration](#configuration)
- [Contributing](#contributing)
- [Author](#author)

## 🎯 Projects Overview

### 🔐 Authentication & Security
**Authentication** - Implementation of authentication system with bank account services
- Features: Login validation, Bank account operations
- Testing: JUnit test cases for authentication and banking services

### 🧪 Testing Frameworks

**JUnit** - Comprehensive JUnit 5 test suite demonstrating various testing techniques
- Calculator operations testing
- Student service testing
- Parameterized tests with CSV data source

**Mockito** - Demonstrates mocking frameworks for unit testing
- Calculator service with mocked dependencies
- MathService interface mocking
- Verification and stubbing examples

### 📊 Java Core Concepts

**collections_and_streams** - Java 8+ Stream API and Collections framework implementation
- Employee management system
- Stream operations (filter, map, reduce, collect)
- Advanced collection operations

### 🗄️ JPA & Hibernate Projects

**Entity_Relations** - One-to-One Relationship
- Customer-Account relationship
- Unidirectional one-to-one mapping

**Employee_and_Locker** - One-to-One Bidirectional Mapping
- Employee-Locker relationship
- Bidirectional one-to-one mapping

**Employee_Nest** - One-to-Many Relationship
- Department-Employee relationship
- Unidirectional one-to-many mapping

**Employee_and_Project** - Many-to-Many Relationship
- Employees and Projects relationship
- Bidirectional many-to-many mapping

**Book_Publisher_Management_System** - Many-to-One Relationship
- Book-Publisher relationship
- Bidirectional many-to-one mapping

**Library_Book_Inventry_Management_System** - Complete Library Management
- Complete CRUD operations
- JPA entity management
- Book inventory tracking

**hibernatedemo2_crud** - Hibernate CRUD Operations
- Basic Hibernate CRUD operations demonstration
- Entity lifecycle management

### 🌸 Spring Framework & Spring Boot Projects

**SpringCore** - Spring Core and Dependency Injection
- Spring Core concepts implementation
- Dependency injection patterns
- Bean lifecycle management

**SpringMVC** - Spring MVC Web Application
- Spring MVC framework implementation
- Model-View-Controller pattern
- Request mapping and handling

**demo_SpringMVC** - Employee Management Demo
- Employee management using Spring MVC and Thymeleaf
- Web interface for CRUD operations
- URL: `http://localhost:8080/employees`

**Customer_Management_System** - Customer Data Management
- Customer data management with Spring Boot and Thymeleaf
- Complete CRUD operations
- URL: `http://localhost:8080/`

**demoApp** - Spring Boot Starter Application
- Basic Spring Boot application setup
- Auto-configuration demonstration

**testapp** - Spring Boot Testing Application
- Spring Boot testing examples
- Integration testing patterns

### 🌐 REST API Projects

**SpringRESTapi** - RESTful Web Services
- RESTful web services using Spring Boot
- REST API design and implementation
- JSON request/response handling

**UserManagementRESTAPI** - Complete User Management REST API
- Full-featured user management REST API
- CRUD operations via REST endpoints
- Endpoints:
  - `GET /api/users` - List all users
  - `POST /api/users` - Create user
  - `GET /api/users/{id}` - Get user by ID
  - `PUT /api/users/{id}` - Update user
  - `DELETE /api/users/{id}` - Delete user

## 🛠️ Technologies Used

- **Java**: 8+
- **Spring Boot**: 2.x/3.x
- **Spring Framework**: Core, MVC, Data JPA
- **Build Tool**: Maven 3.6+
- **Testing Frameworks**: 
  - JUnit 5
  - Mockito 3.x
- **ORM**: 
  - JPA 2.1
  - Hibernate 5.x
- **Template Engine**: Thymeleaf
- **Database**: MySQL / H2 (embedded)
- **REST API**: Spring REST

## 🚀 Getting Started

### Prerequisites

```bash
# Java Development Kit
java -version  # Should be 8 or higher

# Maven
mvn -version   # Should be 3.6 or higher

# MySQL (for JPA projects)
mysql --version
```

### Installation

```bash
# Clone the repository
git clone https://github.com/KetanMishra/CapegeminiAssignment.git

# Navigate to project directory
cd CapegeminiAssignment/java_advanced_assignment-master
```

## 📁 Project Structure

```
CapegeminiAssignment/
└── java_advanced_assignment-master/
    ├── Authentication/                              # Authentication System
    ├── JUnit/                                       # JUnit Testing Examples
    ├── Mockito/                                     # Mockito Framework
    ├── collections_and_streams/                     # Java Streams & Collections
    ├── Entity_Relations/                            # One-to-One Relationship
    ├── Employee_and_Locker/                         # One-to-One Bidirectional
    ├── Employee_Nest/                               # One-to-Many Relationship
    ├── Employee_and_Project/                        # Many-to-Many Relationship
    ├── Book_Publisher_Management_System/            # Many-to-One Relationship
    ├── Library_Book_Inventry_Management_System/     # Complete CRUD
    ├── hibernatedemo2_crud/                         # Hibernate CRUD Demo
    ├── SpringCore/                                  # Spring Core Concepts
    ├── SpringMVC/                                   # Spring MVC Framework
    ├── demo_SpringMVC/                              # Employee Management Demo
    ├── Customer_Management_System/                  # Customer Management
    ├── demoApp/                                     # Spring Boot Starter
    ├── testapp/                                     # Spring Boot Testing
    ├── SpringRESTapi/                               # REST API Implementation
    ├── UserManagementRESTAPI/                       # User Management REST API
    ├── .gitignore                                   # Git ignore rules
    └── README.md                                    # This file
```

## ▶️ How to Run

### Running Spring Boot Projects

```bash
cd <project-name>
# Windows
mvnw.cmd spring-boot:run

# Linux/Mac
./mvnw spring-boot:run
```

### Running JUnit Tests

```bash
cd JUnit
mvn test
```

### Running Mockito Tests

```bash
cd Mockito
mvn test
```

### Running JPA/Hibernate Applications

```bash
# Update database configuration in persistence.xml first
cd Entity_Relations
mvn clean compile
mvn exec:java -Dexec.mainClass="com.capgemini.onetoone.relation.App"
```

### Running Collections Demo

```bash
cd collections_and_streams
mvn clean compile exec:java
```

### Building All Projects

```bash
mvn clean install
```

## ⚙️ Configuration

### Spring Boot Projects (`application.properties`)

```properties
# Database Configuration
spring.datasource.url=jdbc:mysql://localhost:3306/your_database
spring.datasource.username=your_username
spring.datasource.password=your_password

# JPA/Hibernate
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

# Server Port
server.port=8080
```

### JPA/Hibernate Projects (`persistence.xml`)

**Important:** For JPA/Hibernate projects, configure database credentials in `persistence.xml` under `src/main/resources/META-INF/`:

```xml
<property name="jakarta.persistence.jdbc.password" value="YOUR_PASSWORD_HERE"/>
```

**Security Note:** Never commit real passwords to version control. Use environment variables or configuration files that are ignored by Git.

Projects requiring database configuration:
- Entity_Relations
- Employee_and_Locker
- Employee_Nest
- Employee_and_Project
- Book_Publisher_Management_System
- Library_Book_Inventry_Management_System
- hibernatedemo2_crud

## 📊 Key Learning Outcomes

- ✅ Unit Testing with JUnit 5 and Mockito
- ✅ JPA/Hibernate ORM concepts and all types of relationships
- ✅ Java 8+ Streams and functional programming
- ✅ Spring Framework (Core, MVC, Data JPA)
- ✅ Spring Boot application development
- ✅ RESTful API design and implementation
- ✅ Thymeleaf template engine
- ✅ Maven project structure and dependency management
- ✅ Best practices for enterprise Java applications

## 🤝 Contributing

This is a learning repository. Feel free to:
- Fork and create your own versions
- Report issues
- Suggest improvements
- Submit pull requests

## 📝 License

This project is created for educational purposes as part of Capgemini training program.

## 👤 Author

**Ketan Mishra**
- GitHub: [@KetanMishra](https://github.com/KetanMishra)
- Repository: [CapegeminiAssignment](https://github.com/KetanMishra/CapegeminiAssignment)

## 📞 Support

For questions or issues, please create an issue in the GitHub repository.

---

**Last Updated**: March 2026

*This repository demonstrates comprehensive Java enterprise application development skills including Spring ecosystem, JPA/Hibernate, testing frameworks, and modern Java features.*
