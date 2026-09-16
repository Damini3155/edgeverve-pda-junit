package infosys;

import com.infosys.EmployeePayroll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.*;
public class EmployeePayrollTest {

    private EmployeePayroll payroll;

    @BeforeEach
    void setUp() {
        payroll = new EmployeePayroll(
                "EMP101",
                "Damini",
                50000
        );
    }

    @Test
    void testCalculateBonus() {

        double bonus = payroll.calculateBonus(10);

        assertEquals(5000, bonus);
    }

    @Test
    void testCalculateNetSalary() {

        double netSalary = payroll.calculateNetSalary(5000);

        assertEquals(55000, netSalary);
    }

    @Test
    void testValidSalaryDeduction() {

        boolean result = payroll.deductAmount(10000);

        assertTrue(result);
        assertEquals(40000, payroll.getBasicSalary());
    }

    @Test
    void testDeductionGreaterThanSalary() {

        boolean result = payroll.deductAmount(70000);

        assertFalse(result);
        assertEquals(50000, payroll.getBasicSalary());
    }

    @Test
    void testNegativeDeduction() {

        boolean result = payroll.deductAmount(-500);

        assertFalse(result);
        assertEquals(50000, payroll.getBasicSalary());
    }

}