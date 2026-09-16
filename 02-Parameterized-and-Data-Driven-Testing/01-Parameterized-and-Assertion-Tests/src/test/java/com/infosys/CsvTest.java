package com.infosys;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CsvSourceTest {

    @ParameterizedTest
    @CsvSource({
            "java,4",
            "Python,6",
            "c++,3",
            "Spring Boot,11",
            "JUnit,6"
    })
    void testCsvSource(String course, int len) {
        assertEquals(len, course.length(), "The length is not valid");
    }
}