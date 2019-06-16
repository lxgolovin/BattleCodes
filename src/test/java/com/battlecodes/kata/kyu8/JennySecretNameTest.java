package com.battlecodes.kata.kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Jenny has written a function that returns a greeting for a user.
 * However, she's in love with Johnny, and would like to greet him slightly different.
 * She added a special case to her function, but she made a mistake.
 *
 * Can you help her?
 */
class JennySecretNameTest {

    /**
     * Say hello
     */
    @Test
    void greet() {
        assertEquals("Hello, my love!", JennySecretName.greet("Johnny"));
        assertEquals("Hello, Mike!", JennySecretName.greet("Mike"));
    }
}