package infosys;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
        EmployeePayrollTest.class
})
public class EmployeePayrollTestSuite {
}