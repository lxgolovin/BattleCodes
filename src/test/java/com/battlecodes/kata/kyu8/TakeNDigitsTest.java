package com.battlecodes.kata.kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TakeNDigitsTest {

    @Test
    void basicTests() {
        assertArrayEquals(new int[]{0, 1, 2}, TakeNDigits.takeNDigits(new int[]{0, 1, 2, 3, 5, 8, 13}, 3));
    }
}