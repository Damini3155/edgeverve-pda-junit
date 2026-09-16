# Module 01 — JUnit 5 Core Basics

> **Note:** The core JUnit 5 basics exercises (Calculator, Student lifecycle tests) are demonstrated inside **[Module 04 — Mockito Mocking Framework](../04-Mockito-Mocking-Framework/01-Product-Service-Mocking/)** as part of the `junit5` project.
> This module serves as the conceptual reference for JUnit 5 fundamentals.

---

## 📚 JUnit 5 Architecture

JUnit 5 = **JUnit Platform** + **JUnit Jupiter** + **JUnit Vintage**

| Layer | Purpose |
|---|---|
| **JUnit Platform** | Foundation for launching testing frameworks on JVM |
| **JUnit Jupiter** | New programming & extension model (JUnit 5 API) |
| **JUnit Vintage** | Backward-compatibility with JUnit 3 & 4 |

---

## 🔑 Core Annotations Reference

| Annotation | Description |
|---|---|
| `@Test` | Marks a method as a test method |
| `@BeforeEach` | Runs before **each** test method (setup) |
| `@AfterEach` | Runs after **each** test method (teardown) |
| `@BeforeAll` | Runs **once** before all tests in the class (must be `static`) |
| `@AfterAll` | Runs **once** after all tests in the class (must be `static`) |
| `@DisplayName` | Assigns a human-readable name to a test |
| `@Disabled` | Skips/ignores a test or entire test class |
| `@Nested` | Groups related tests in a nested inner class |
| `@Tag` | Categorizes tests for filtering |
| `@RepeatedTest(n)` | Runs a test method `n` times |
| `@Timeout` | Fails a test if it exceeds a specified time |

---

## ✅ Assertions Reference

```java
import static org.junit.jupiter.api.Assertions.*;

assertEquals(expected, actual);           // Assert equality
assertNotEquals(unexpected, actual);       // Assert inequality
assertTrue(condition);                     // Assert condition is true
assertFalse(condition);                    // Assert condition is false
assertNull(object);                        // Assert object is null
assertNotNull(object);                     // Assert object is NOT null
assertThrows(Exception.class, () -> { }); // Assert exception is thrown
assertAll(                                 // Group multiple assertions
    () -> assertEquals(1, result),
    () -> assertNotNull(name)
);
```

---

## 🔄 Test Lifecycle

```
@BeforeAll (once)
    └── @BeforeEach → @Test → @AfterEach   (for each test)
    └── @BeforeEach → @Test → @AfterEach
    └── ...
@AfterAll (once)
```

---

## 📁 See Also

- **[04-Mockito-Mocking-Framework/01-Product-Service-Mocking](../04-Mockito-Mocking-Framework/01-Product-Service-Mocking/)** — Contains `CalculatorTest.java`, `StudentTest.java`, and `ListTest.java` demonstrating core JUnit 5 basics
- **[02-Parameterized-and-Data-Driven-Testing](../02-Parameterized-and-Data-Driven-Testing/)** — Parameterized tests with `@CsvSource`, `@ValueSource`
