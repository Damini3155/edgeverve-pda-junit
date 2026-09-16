import com.infosys.Student;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    Student student;

    @BeforeEach
    void setUp() {
        student = new Student(101, "Damini");
    }

    @Test
    void testId() {
        assertEquals(101, student.getId());
    }

    @Test
    void testName() {
        assertEquals("Damini", student.getName());
    }


}