package com.battlecodes.kata.kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Write a function called repeatStr which repeats the given string string exactly n times.
 *
 * repeatStr(6, "I") // "IIIIII"
 * repeatStr(5, "Hello") // "HelloHelloHelloHelloHello"
 */
class RepeatStringTest {

    /**
     * Test repeating in several ways
     */
    @Test
    void repeatStr() {
        String str1 = "II";
        String str2 = "Hello";

        assertEquals("IIIIIIII", RepeatString.repeatStr(4, str1));
        assertEquals("IIIIIIII", RepeatString.repeatStrBuilder(4, str1));
        assertEquals("IIIIIIII", RepeatString.repeatStrStream(4, str1));
        assertEquals("HelloHelloHelloHelloHello", RepeatString.repeatStr(5, str2));
        assertEquals("HelloHelloHelloHelloHello", RepeatString.repeatStrBuilder(5, str2));
        assertEquals("HelloHelloHelloHelloHello", RepeatString.repeatStrStream(5, str2));
    }
}