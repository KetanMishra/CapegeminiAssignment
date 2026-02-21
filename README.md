# Capgemini Java Advanced Assignment 🚀

A comprehensive collection of Java advanced concepts and practical implementations, covering JPA/Hibernate, JUnit testing, Mockito, Collections & Streams, and various design patterns.

## 📋 Table of Contents

- [Projects Overview](#projects-overview)
- [Technologies Used](#technologies-used)
- [Getting Started](#getting-started)
- [Project Structure](#project-structure)
- [How to Run](#how-to-run)
- [Author](#author)

## 🎯 Projects Overview

### 1. **Authentication**
Implementation of authentication system with bank account services.
- Features: Login validation, Bank account operations
- Testing: JUnit test cases for authentication and banking services

### 2. **JUnit Testing**
Comprehensive JUnit 5 test suite demonstrating various testing techniques.
- Calculator operations testing
- Student service testing
- Parameterized tests with CSV data source

### 3. **Mockito**
Demonstrates mocking frameworks for unit testing.
- Calculator service with mocked dependencies
- MathService interface mocking
- Verification and stubbing examples

### 4. **Collections and Streams**
Java 8+ Stream API and Collections framework implementation.
- Employee management system
- Stream operations (filter, map, reduce, collect)
- Advanced collection operations

### 5. **JPA/Hibernate Entity Relations**

#### a. **Entity Relations (One-to-One)**
- Customer-Account relationship
- Unidirectional one-to-one mapping

#### b. **Employee and Locker (One-to-One)**
- Employee-Locker relationship
- Bidirectional one-to-one mapping

#### c. **Employee Nest (One-to-Many)**
- Department-Employee relationship
- Unidirectional one-to-many mapping

#### d. **Book Publisher Management (Many-to-One)**
- Book-Publisher relationship
- Bidirectional many-to-one mapping

#### e. **Library Book Inventory Management**
- Complete CRUD operations
- JPA entity management

## 🛠️ Technologies Used

- **Java**: 8+
- **Build Tool**: Maven 3.6+
- **Testing Frameworks**: 
  - JUnit 5
  - Mockito 3.x
- **ORM**: 
  - JPA 2.1
  - Hibernate 5.x
- **Database**: MySQL (configurable)

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
cd CapegeminiAssignment

# Build all projects
cd Authentication && mvn clean install
cd ../JUnit && mvn clean install
cd ../Mockito && mvn clean install
# ... and so on for other projects
```

### Database Configuration

**Important:** For JPA/Hibernate projects, you need to configure your database credentials.

1. Navigate to the `persistence.xml` file in each JPA project under `src/main/resources/META-INF/`
2. Update the database password:
   ```xml
   <property name="jakarta.persistence.jdbc.password" value="YOUR_PASSWORD_HERE"/>
   ```
3. Replace `YOUR_PASSWORD_HERE` with your actual MySQL root password
4. **Never commit real passwords to version control**

Projects requiring database configuration:
- Entity_Relations
- Employee_and_Locker
- Employee_Nest
- Book_Publisher_Management_System
- Library_Book_Inventry_Management_System

## 📁 Project Structure

```
CapegeminiAssignment/
├── Authentication/                    # Authentication & Banking System
├── JUnit/                            # JUnit Testing Examples
├── Mockito/                          # Mockito Testing Framework
├── collections_and_streams/          # Java Streams & Collections
├── Entity_Relations/                 # One-to-One Relationship
├── Employee_and_Locker/              # One-to-One Bidirectional
├── Employee_Nest/                    # One-to-Many Relationship
├── Book_Publisher_Management_System/ # Many-to-One Relationship
├── Library_Book_Inventry_Management_System/ # Complete CRUD
└── README.md                         # This file
```

## ▶️ How to Run

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

### Running JPA Applications

```bash
# Update database configuration in persistence.xml
cd Entity_Relations
mvn clean compile
mvn exec:java -Dexec.mainClass="com.capgemini.onetoone.relation.App"
```

### Running Collections Demo

```bash
cd collections_and_streams
mvn clean compile exec:java
```

## 📊 Key Learning Outcomes

- ✅ Unit Testing with JUnit 5 and Mockito
- ✅ JPA/Hibernate ORM concepts and relationships
- ✅ Java 8+ Streams and functional programming
- ✅ Maven project structure and dependency management
- ✅ Best practices for enterprise Java applications

## 🤝 Contributing

This is a personal learning repository. Feel free to fork and create your own versions!

## 📝 License

This project is created for educational purposes as part of Capgemini training program.

## 👤 Author

**Ketan Mishra**
- GitHub: [@KetanMishra](https://github.com/KetanMishra)

---

⭐ **Star this repository if you find it helpful!**
