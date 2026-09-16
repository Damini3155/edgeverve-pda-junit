package com.infosys;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class JunitAssignment {

    // 1. assertAll
    @Test
    void testAssertAll() {
        assertAll(
                () -> assertEquals(4, 2 + 2),
                () -> assertTrue(10 > 5),
                () -> assertFalse("".equals("Java"))
        );
    }

    // 2. Vowel
    @ParameterizedTest
    @ValueSource(chars = {'a','e','i','o','u'})
    void testVowel(char ch) {
        assertTrue("aeiou".contains(String.valueOf(ch)));
    }

    // 3. String Palindrome using ValueSource
    @ParameterizedTest
    @ValueSource(strings = {"madam","level","noon"})
    void testPalindrome(String word) {
        assertEquals(word,
                new StringBuilder(word).reverse().toString());
    }

    // 4. Title Case
    @ParameterizedTest
    @CsvSource({
            "java,Java",
            "python,Python",
            "spring,Spring"
    })
    void testTitleCase(String input,String expected) {

        String actual =
                input.substring(0,1).toUpperCase()
                        + input.substring(1).toLowerCase();

        assertEquals(expected,actual);
    }

    // 5. List of palindrome (true/false)
    @ParameterizedTest
    @CsvSource({
            "madam,true",
            "level,true",
            "racecar,true",
            "hello,false",
            "java,false"
    })
    void testPalindromeList(String word,boolean expected) {

        boolean actual = word.equals(
                new StringBuilder(word).reverse().toString());

        assertEquals(expected,actual);
    }

    // 6. External CSV
//    @ParameterizedTest
//    @CsvFileSource(resources="/testdata.csv", numLinesToSkip=1)
//    void testPalindromeFile(String word,boolean expected) {
//
//        boolean actual = word.equals(
//                new StringBuilder(word).reverse().toString());
//
//        assertEquals(expected,actual);
//    }
}