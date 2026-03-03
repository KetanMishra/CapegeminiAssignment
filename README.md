# Capgemini Java Advanced Assignment

This repository contains a comprehensive collection of Java advanced practice projects covering various technologies including JPA/Hibernate, Spring Framework, Spring Boot, Spring MVC, REST APIs, JUnit, Mockito, and Java Collections & Streams.

## 📚 Repository Structure

### 🔐 Authentication & Security
- **Authentication** - User authentication implementation with security features

### 🗄️ JPA & Hibernate Projects
- **Book_Publisher_Management_System** - Book and publisher relationship management using JPA
- **Employee_Nest** - Employee hierarchy and nested entity relationships
- **Employee_and_Locker** - One-to-one relationship implementation between Employee and Locker
- **Employee_and_Project** - Many-to-many relationship between Employees and Projects
- **Entity_Relations** - Various JPA entity relationship examples
- **Library_Book_Inventry_Management_System** - Library inventory management with book tracking
- **hibernatedemo2_crud** - Hibernate CRUD operations demonstration

### 🌸 Spring Framework Projects
- **SpringCore** - Spring Core concepts and dependency injection
- **SpringMVC** - Spring MVC web application framework
- **SpringRESTapi** - RESTful web services using Spring Boot
- **UserManagementRESTAPI** - Complete user management REST API with CRUD operations

### 🖥️ Spring Boot Applications
- **Customer_Management_System** - Customer data management with Spring Boot and Thymeleaf
- **demo_SpringMVC** - Employee management demo using Spring MVC and Thymeleaf
- **demoApp** - Spring Boot starter application
- **testapp** - Spring Boot testing application

### 🧪 Testing Frameworks
- **JUnit** - JUnit testing examples and best practices
- **Mockito** - Mock testing with Mockito framework

### 📊 Java Core Concepts
- **collections_and_streams** - Java Collections API and Stream operations

## 🛠️ Technologies Used

- **Java** (JDK 8+)
- **Spring Boot** 2.x/3.x
- **Spring Framework** (Core, MVC, Data JPA)
- **Hibernate** / JPA
- **Maven** - Build and dependency management
- **Thymeleaf** - Server-side template engine
- **JUnit** - Unit testing
- **Mockito** - Mocking framework
- **MySQL** / H2 Database
- **REST API** development

## 📋 Prerequisites

- Java Development Kit (JDK) 8 or higher
- Maven 3.6+
- MySQL Server (for projects using MySQL)
- IDE (IntelliJ IDEA, Eclipse, or VS Code with Java extensions)

## 🚀 Getting Started

### Clone the Repository
```bash
git clone https://github.com/KetanMishra/CapegeminiAssignment.git
cd CapegeminiAssignment/java_advanced_assignment-master
```

### Running Spring Boot Projects
```bash
cd <project-name>
mvnw spring-boot:run
# OR
./mvnw spring-boot:run  # On Linux/Mac
```

### Running Hibernate/JPA Projects
1. Configure database connection in `persistence.xml` or `application.properties`
2. Update database credentials
3. Run the main class from your IDE or use Maven:
```bash
mvn clean install
mvn exec:java -Dexec.mainClass="com.example.MainClass"
```

### Building Projects
```bash
mvn clean install
```

### Running Tests
```bash
mvn test
```

## 📁 Project-Specific Information

### Customer Management System
- **Tech Stack**: Spring Boot, Spring Data JPA, Thymeleaf, H2/MySQL
- **Features**: Add, view, update, and delete customer records
- **URL**: `http://localhost:8080/`

### Employee Management (demo_SpringMVC)
- **Tech Stack**: Spring Boot, Spring MVC, Thymeleaf
- **Features**: Employee CRUD operations with web interface
- **URL**: `http://localhost:8080/employees`

### User Management REST API
- **Tech Stack**: Spring Boot, Spring Data JPA, REST
- **Features**: RESTful endpoints for user management
- **Endpoints**: 
  - GET `/api/users` - List all users
  - POST `/api/users` - Create user
  - GET `/api/users/{id}` - Get user by ID
  - PUT `/api/users/{id}` - Update user
  - DELETE `/api/users/{id}` - Delete user

## ⚙️ Configuration

Most Spring Boot projects use `application.properties` for configuration. Update the following properties as needed:

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

For Hibernate projects, update `persistence.xml` located in `src/main/resources/META-INF/`.

## 🔒 Security Note

Ensure you **never commit sensitive information** such as:
- Database passwords
- API keys
- Secret tokens

Use environment variables or configuration files that are ignored by Git.

## 📝 Best Practices Implemented

- ✅ Proper project structure and package organization
- ✅ Separation of concerns (Controller, Service, Repository layers)
- ✅ Exception handling
- ✅ Input validation
- ✅ Unit testing with JUnit and Mockito
- ✅ RESTful API design principles
- ✅ Database relationship modeling

## 🤝 Contributing

This is a learning repository. Feel free to:
- Report issues
- Suggest improvements
- Submit pull requests

## 👤 Author

**Ketan Mishra**
- GitHub: [@KetanMishra](https://github.com/KetanMishra)

## 📜 License

This project is created for educational purposes as part of Capgemini training assignments.

## 📞 Support

For questions or issues, please create an issue in the GitHub repository.

---

**Note**: Each project may have its own specific setup instructions. Please refer to individual project directories for detailed information.

Last Updated: March 2026
