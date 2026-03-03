# Collections and Streams Module

Java 8+ Streams API and Collections framework demonstration with Employee Management System.

## Features

### Employee Management
- Employee entity with comprehensive attributes
- Department-wise employee organization
- Salary and experience tracking

### Stream Operations Demonstrated

1. **Filtering**: Filter employees by department, salary, experience
2. **Mapping**: Transform employee data
3. **Sorting**: Sort by various criteria
4. **Grouping**: Group employees by department/job
5. **Aggregation**: Calculate average salary, count employees
6. **Collectors**: Various collection operations

## Classes

- `Employee.java` - Employee entity with getters/setters
- `EmployeeManagement.java` - Service class with stream operations
- `JavaApplication.java` - Main class demonstrating all operations

## Sample Operations

```java
// Filter employees by department
List<Employee> techEmployees = employees.stream()
    .filter(e -> e.getDepartmentName().equals("Technical"))
    .collect(Collectors.toList());

// Calculate average salary
double avgSalary = employees.stream()
    .mapToDouble(Employee::getSalary)
    .average()
    .orElse(0.0);
```

## Running the Application

```bash
mvn clean compile exec:java
```

## Learning Outcomes

- Master Java 8+ Stream API
- Understand functional programming concepts
- Efficient collection processing
- Lambda expressions and method references
