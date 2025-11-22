# Java Practice Workspace (jv)

A Java workspace for practicing Java programming concepts, algorithms, and data structures.

## Project Structure

```
jv/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/
│   │           └── practice/
│   │               └── HelloWorld.java      # Example Java program
│   └── test/
│       └── java/
│           └── com/
│               └── practice/
│                   └── HelloWorldTest.java   # Example JUnit test
├── pom.xml                                    # Maven configuration
└── README.md                                  # This file
```

## Prerequisites

- Java 17 or higher
- Maven 3.6 or higher

## Getting Started

### 1. Clone the repository

```bash
git clone https://github.com/Khaled-b-2002/jv.git
cd jv
```

### 2. Build the project

```bash
mvn clean compile
```

### 3. Run the example program

```bash
mvn exec:java -Dexec.mainClass="com.practice.HelloWorld"
```

Or compile and run directly:

```bash
javac -d target/classes src/main/java/com/practice/HelloWorld.java
java -cp target/classes com.practice.HelloWorld
```

### 4. Run tests

```bash
mvn test
```

## How to Practice

1. **Create new Java classes**: Add new `.java` files in `src/main/java/com/practice/`
2. **Write tests**: Add corresponding test files in `src/test/java/com/practice/`
3. **Practice topics**:
   - Basic syntax and data types
   - Object-Oriented Programming (OOP)
   - Collections Framework
   - Algorithms and Data Structures
   - Exception Handling
   - File I/O
   - Streams and Lambdas
   - Multithreading
   - And more!

## Example Usage

The workspace includes a simple `HelloWorld` example to get you started:

```java
package com.practice;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, Java World!");
    }
    
    public static String greet(String name) {
        return "Hello, " + name + "!";
    }
}
```

With a corresponding test:

```java
@Test
void testGreet() {
    String result = HelloWorld.greet("Java");
    assertEquals("Hello, Java!", result);
}
```

## Maven Commands

- `mvn clean` - Clean build artifacts
- `mvn compile` - Compile the source code
- `mvn test` - Run tests
- `mvn package` - Package the compiled code
- `mvn clean install` - Clean, compile, test, and install

## Contributing

Feel free to add your own practice exercises and solutions!

## License

This is a personal practice workspace.
