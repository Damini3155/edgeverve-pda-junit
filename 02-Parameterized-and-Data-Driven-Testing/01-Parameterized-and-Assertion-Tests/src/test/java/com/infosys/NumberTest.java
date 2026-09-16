package com.infosys;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class NumberTest {
//    boolean isEven(int number)
//    {
//        return number%2==0;
//    }
//    @ParameterizedTest
//    @ValueSource(ints = {2,4,6})
//    void tetsIsEven(int numbers)
//    {
//        assertTrue(isEven(numbers));
//    }

    boolean isVowel(char ch)
    {
        switch (ch)
        {
            case 'a':
                return true;
            case 'e':
                return true;
            case 'i':
                return true;
            case 'o':
                return true;
            case 'u':
                return true;
            default:
                return false;
        }
    }
    @ParameterizedTest
    @ValueSource(chars = {'a','e','i','o'})
    void testisVowel(char args)
    {
        assertTrue(isVowel(args));
    }
//    @ParameterizedTest
//    @ValueSource(ints = {1,2,3,4,5,6})
//    void testWithValueSource(int arg)
//    {
//        assertTrue(arg>0,"the argument should be greater than 0");
//    }
}
