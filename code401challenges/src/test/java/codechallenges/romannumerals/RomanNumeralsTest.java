package codechallenges.romannumerals;

import org.junit.*;

import static org.junit.Assert.*;

public class RomanNumeralsTest {

    @Test
    public void convertToRomanNumerals() {
        String expected = "V";
        assertEquals(expected,RomanNumerals.convertToRomanNumerals(5));
    }
    @Test
    public void convertToRomanNumeralsTwo() {
        String expected = "L";
        assertEquals(expected,RomanNumerals.convertToRomanNumerals(50));
    }
    @Test
    public void convertToRomanNumeralsThree() {
        String expected = "MCMLXXXIX";
        assertEquals(expected,RomanNumerals.convertToRomanNumerals(1989));
    }
    @Test
    public void convertToRomanNumeralsFour() {
        String expected = "MM";
        assertEquals(expected,RomanNumerals.convertToRomanNumerals(2000));
    }
}