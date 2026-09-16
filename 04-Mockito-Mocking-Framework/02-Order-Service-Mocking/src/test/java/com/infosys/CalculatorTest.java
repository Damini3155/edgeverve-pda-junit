package com.infosys;

import com.infosys.calculator.Calculator;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTest {
    Calculator cal ;

   @BeforeEach
   void setup()
   {
       cal = new Calculator();
       System.out.println("object created");
   }
    @Test
    void testadd()
    {
        assertEquals(30,cal.add(10,20));
    }
    @Test
    void testSub()
    {
        assertEquals(10,cal.substract(20,10));
    }
    @AfterAll
    static void done()
    {
        System.out.println("All test are complited");
    }
}
