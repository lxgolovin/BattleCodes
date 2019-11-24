package com.battlecodes.kata.kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegerToStringTest {

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