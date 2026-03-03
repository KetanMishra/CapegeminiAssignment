# Mockito Testing Module

This module demonstrates the usage of Mockito framework for creating mock objects in unit tests.

## Features

- **Calculator Service**: Demonstrates mocking of MathService dependency
- **Stubbing**: Configure mock objects to return specific values
- **Verification**: Verify method invocations on mock objects
- **Dependency Injection**: Test classes with external dependencies

## Project Structure

```
src/
├── main/java/com/capgemini/mockito/
│   ├── Calculator.java      # Service class with dependencies
│   └── MathService.java     # Interface to be mocked
└── test/java/com/capgemini/mockito/test/
    └── CalculatorTest.java  # Mockito test cases
```

## Key Concepts Covered

1. Creating mock objects with `@Mock`
2. Injecting mocks with `@InjectMocks`
3. Stubbing method calls with `when().thenReturn()`
4. Verifying interactions with `verify()`

## Running Tests

```bash
mvn test
```

## Dependencies

- Mockito Core 3.x
- JUnit 5
