# EdgeVerve PDA Training — JUnit 5 & Mockito

> **Training Program:** EdgeVerve PDA (Professional Development & Advancement)  
> **Topic:** Java Unit Testing with JUnit 5 and Mockito  
> **Trainee:** Damini | **Year:** 2026

---

## 📁 Repository Structure

```
JUnit (PDA)/
├── 01-JUnit5-Core-Basics/                        ← Annotations, lifecycle, assertions reference
├── 02-Parameterized-and-Data-Driven-Testing/
│   └── 01-Parameterized-and-Assertion-Tests/     ← @CsvSource, @ValueSource, @MethodSource, assertThrows
├── 03-Test-Suites-and-Categories/
│   ├── 01-Shopping-Flow-TestSuite/               ← @Suite, login/order/payment flow
│   └── 02-Bank-Account-TestSuite/                ← BankAccount + TransactionService test suite
├── 04-Mockito-Mocking-Framework/
│   ├── 01-Product-Service-Mocking/               ← @Mock, @InjectMocks, Calculator, Student, ProductService
│   └── 02-Order-Service-Mocking/                 ← when().thenReturn(), verify(), OrderService
├── 05-Spring-Boot-Web-and-REST-Testing/
│   ├── 01-Student-WebMvcTest/                    ← @WebMvcTest, MockMvc, StudentController
│   └── 02-Rest-Test-Demo-Gradle/                 ← REST API testing (Gradle project)
├── 06-Domain-Case-Studies/
│   ├── 01-Employee-Payroll-System/               ← Full payroll system with JUnit 5 suite
│   └── 02-Shopping-Cart-System/                  ← Shopping cart with add/remove/total tests
└── _archive/                                     ← Maven archetype templates & empty projects
```

---

## 🧪 Module Overview

### Module 01 — JUnit 5 Core Basics
Reference module covering JUnit 5 architecture (Platform + Jupiter + Vintage), all core annotations, assertions API, and test lifecycle. See [`01-JUnit5-Core-Basics/README.md`](01-JUnit5-Core-Basics/README.md).

### Module 02 — Parameterized & Data-Driven Testing
**Project:** `01-Parameterized-and-Assertion-Tests`
- Parameterized tests using `@CsvSource`, `@ValueSource`
- Exception testing with `assertThrows`
- Custom assertion messages and grouping with `assertAll`

**Key files:**
| File | What it demonstrates |
|---|---|
| `CsvTest.java` | `@ParameterizedTest` + `@CsvSource` |
| `ExceptionTest.java` | `assertThrows`, expected exception types |
| `NumberTest.java` | Boundary value testing |
| `JunitAssignment.java` | Combined parameterized test assignment |

### Module 03 — Test Suites & Categories
**Projects:** `01-Shopping-Flow-TestSuite`, `02-Bank-Account-TestSuite`
- `@Suite`, `@SelectClasses`, `@SelectPackages` for grouping tests
- Business flow testing (Login → Order → Payment)
- Domain model testing with suites

**Key files:**
| File | What it demonstrates |
|---|---|
| `ShoppingTestSuite.java` | `@Suite` aggregating LoginTest, OrderTest, PaymentTest |
| `testSuite.java` | Suite grouping BankAccount tests |
| `BankAccount.java` | Domain model with deposit/withdraw logic |
| `TransactionService.java` | Service tested via suite |

### Module 04 — Mockito Mocking Framework
**Projects:** `01-Product-Service-Mocking`, `02-Order-Service-Mocking`
- Mock creation with `@Mock`, `@ExtendWith(MockitoExtension.class)`
- Stubbing with `when().thenReturn()`
- Behavior verification with `verify()`
- ArgumentCaptor usage

**Key files:**
| File | What it demonstrates |
|---|---|
| `ProductServiceTest.java` | Full Mockito: `@Mock`, `when()`, `verify()` |
| `CalculatorTest.java` | JUnit 5 core basics (`@BeforeEach`, `@AfterEach`) |
| `StudentTest.java` | Lifecycle annotations, `@DisplayName` |
| `ListTest.java` | Mockito with Java Collections |
| `OrderTest.java` | `when().thenReturn()` with order service |

### Module 05 — Spring Boot Web & REST Testing
**Projects:** `01-Student-WebMvcTest` (Maven), `02-Rest-Test-Demo-Gradle` (Gradle)
- `@WebMvcTest` for controller layer testing without full context
- `MockMvc` for HTTP request simulation
- `@SpringBootTest` for integration testing
- REST endpoint testing (GET, POST, etc.)

**Key files:**
| File | What it demonstrates |
|---|---|
| `StudentControllerTest.java` | `@WebMvcTest`, `MockMvc.perform()`, `andExpect()` |
| `StudentController.java` | REST controller under test |
| `RestTestDemoApplication.java` | Gradle-based Spring Boot REST app |

### Module 06 — Domain Case Studies
**Projects:** `01-Employee-Payroll-System`, `02-Shopping-Cart-System`
- End-to-end business logic testing
- Test suites for full domain coverage
- Multiple assertion strategies

**Key files:**
| File | What it demonstrates |
|---|---|
| `EmployeePayrollTest.java` | Payroll computation tests |
| `EmployeePayrollTestSuite.java` | `@Suite` aggregating payroll tests |
| `ShoppingCartTest.java` | Add item, remove item, calculate total |
| `ShoppingCartTestSuite.java` | Suite for shopping cart tests |

---

## 🔑 Quick Reference

### JUnit 5 Annotations

| Annotation | Purpose |
|---|---|
| `@Test` | Marks a test method |
| `@BeforeEach` | Setup before each test |
| `@AfterEach` | Teardown after each test |
| `@BeforeAll` | One-time setup (static) |
| `@AfterAll` | One-time teardown (static) |
| `@DisplayName` | Human-readable test name |
| `@Disabled` | Skip test or class |
| `@ParameterizedTest` | Data-driven test |
| `@CsvSource` | Inline CSV data for parameterized test |
| `@ValueSource` | Single-type values for parameterized test |
| `@RepeatedTest` | Run test N times |
| `@Nested` | Nested test class |
| `@Tag` | Tag for filtering |
| `@Suite` | JUnit 5 test suite aggregator |
| `@SelectClasses` | Specify classes in a suite |

### JUnit 5 Assertions

```java
assertEquals(expected, actual)
assertNotEquals(unexpected, actual)
assertTrue(condition)
assertFalse(condition)
assertNull(object)
assertNotNull(object)
assertThrows(ExceptionType.class, () -> { /* code */ })
assertAll(() -> ..., () -> ...)
```

### Mockito Quick Reference

| Operation | Code |
|---|---|
| Create mock | `@Mock MyService svc;` |
| Inject mocks | `@InjectMocks MyClass target;` |
| Enable Mockito | `@ExtendWith(MockitoExtension.class)` |
| Stub method | `when(svc.method(arg)).thenReturn(value);` |
| Stub void | `doNothing().when(svc).method(arg);` |
| Verify called | `verify(svc).method(arg);` |
| Verify N times | `verify(svc, times(2)).method(arg);` |
| Verify never | `verify(svc, never()).method(arg);` |
| Capture arg | `ArgumentCaptor<T> captor = ArgumentCaptor.forClass(T.class);` |

---

## ▶️ How to Run Tests

### Maven Projects
```bash
# Run all tests
mvn test

# Run a specific test class
mvn test -Dtest=CalculatorTest

# Run with verbose output
mvn test -Dsurefire.useFile=false
```

### Gradle Projects (Module 05 — Rest-Test-Demo-Gradle)
```bash
# Windows
gradlew.bat test

# Show results in console
gradlew.bat test --info
```

---

## 🛠️ Tech Stack

| Technology | Version | Role |
|---|---|---|
| Java | 17+ | Language |
| JUnit 5 (Jupiter) | 5.x | Unit testing framework |
| Mockito | 5.x | Mocking framework |
| Spring Boot | 3.x | Web/REST context (Module 05) |
| Maven | 3.x | Build tool (Modules 01–04, 06) |
| Gradle | 8.x | Build tool (Module 05 REST demo) |

---

## 📌 Key Concepts Covered

- ✅ JUnit 5 lifecycle and annotation model
- ✅ Parameterized and data-driven testing
- ✅ Test suite aggregation with `@Suite`
- ✅ Mockito: mocking, stubbing, verification
- ✅ Spring Boot controller testing with `@WebMvcTest`
- ✅ REST API integration testing
- ✅ Domain-driven test design (Payroll, Shopping Cart)

---

*Part of the [EdgeVerve PDA Spring Boot Training](https://github.com/Damini3155/edgeverve-pda-spring-boot) series.*
