package com.infosys;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ExceptionTest {
    @Test
    void testException()
    {
        assertThrows(NumberFormatException.class,()->
        {
            Integer.parseInt("1");
        },"NumberFormatException was failed");
    }
}
