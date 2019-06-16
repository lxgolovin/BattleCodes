package com.battlecodes.kata.kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Testing kyu {@link BasicOperations}
 */
class BasicOperationsTest {

    /**
     * Tests
     * basicOp('+', 4, 7)         // Output: 11
     * basicOp('-', 15, 18)       // Output: -3
     * basicOp('*', 5, 5)         // Output: 25
     * basicOp('/', 49, 7)        // Output: 7
     */
    @Test
    void basicMathChecks() {
        assertEquals(11, BasicOperations.basicMath("+", 4, 7));
        assertEquals(-3, BasicOperations.basicMath("-", 15, 18));
        assertEquals(25, BasicOperations.basicMath("*", 5, 5));
        assertEquals(7, BasicOperations.basicMath("/", 49, 7));
        assertThrows(IllegalArgumentException.class,
                () -> BasicOperations.basicMath("w", 3,3));
        assertThrows(IllegalArgumentException.class,
                () -> BasicOperations.basicMath("/", 3,0));
    }
}