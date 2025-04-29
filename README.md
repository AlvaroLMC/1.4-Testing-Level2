# Level 2: AssertJ - Java Testing

## Description

This repository contains the solution to **Level 2 AssertJ Testing**, where several unit test exercises are developed using the AssertJ library to validate the behavior of objects, lists, maps, and exceptions in Java.

Each exercise is designed to demonstrate a specific case of assertions provided by AssertJ. The exercises are written using JUnit 5 and follow good Java testing practices.

### Exercise Statement:

The following exercises are implemented:

- **Exercise 1:**  
  An assertion that demonstrates two integer objects have the same value, and another that shows they do not.

- **Exercise 2:**  
  An assertion that demonstrates one object reference is the same as another, and another that it is different.

- **Exercise 3:**  
  An assertion that two integer arrays are identical.

- **Exercise 4:**  
  Create an `ArrayList` that contains different types of objects. Assertions are written to:
  - Verify the order of objects as they were inserted.
  - Verify the list contains the objects in any order.
  - Verify that one object was added only once.
  - Verify that one object was not added to the list.

- **Exercise 5:**  
  Create a `Map` and verify it contains one of the added keys.

- **Exercise 6:**  
  Trigger an `ArrayIndexOutOfBoundsException` in any class and create an assertion to validate the exception is properly thrown.

- **Exercise 7:**  
  Create an empty `Optional` object and write the correct assertion to verify it is indeed empty.

---

## Technologies Used

- 🧑‍💻 **Java 24** – Main programming language.
- ✅ **JUnit 5** – Framework for running unit tests.
- 🔍 **AssertJ 3.24.2** – Fluent and powerful assertion library for testing.
- 📦 **Maven** – Dependency and build automation tool.
- 💡 **IntelliJ IDEA** – Development environment used.

---

## Project Structure

src ├── main │ └── java │ └── Exercises1to7 │ └── Course.java ├── test │ └── java │ └── Exercises1to7 │ └── CourseTest.java


---

## How to Run the Tests

1. Clone this repository.
2. Open the project in your favorite IDE (e.g., IntelliJ).
3. Ensure Maven and Java are configured.
4. Run the tests from the IDE's test panel or with the following command:

    ```bash
     mvn test

## Author

💻 Developed by [Your Name Here]
📅 April 2025
