package com.battlecodes.kata.kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for {@link IntegerToString}
 */
class IntegerToStringTest {

    /**
     * Try all ways
     * Kata.numberToString(123); // returns "123";
     * Kata.numberToString(999); // returns "999";
     */
    @Test
    void integerToString() {
        assertEquals("123", IntegerToString.integerToString(123));
        assertEquals("123", IntegerToString.integerToStringOther(123));
        assertEquals("123", IntegerToString.integerToStringOneMore(123));
        assertEquals("999", IntegerToString.integerToString(999));
        assertEquals("999", IntegerToString.integerToStringOther(999));
        assertEquals("999", IntegerToString.integerToStringOneMore(999));
    }
}