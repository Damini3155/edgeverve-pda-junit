import com.infosys.Calculator;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @BeforeAll
    static void beforeAll() {
        System.out.println("Runs before all tests");
    }

    @BeforeEach
    void setup() {
        calculator = new Calculator();
        System.out.println("Object Created");
    }

    @Test
    void testAdd() {
        assertEquals(30, calculator.add(10, 20));
    }

    @Test
    void testSubtract() {
        assertEquals(10, calculator.sub(20, 10));
    }

    @AfterEach
    void cleanup() {
        System.out.println("Executed After Each Test");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("Runs after all tests");
    }
}