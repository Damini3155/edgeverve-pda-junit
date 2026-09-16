import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListTest {

    List<String> fruits;

    @BeforeEach
    void setup() {
        fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
    }

    @Test
    void testListSize() {
        assertEquals(3, fruits.size());
    }
}