package com.battlecodes.kata.kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplyAllTest {

    @Test
    void testMultiply() {
        assertEquals(6, MultiplyAll.grow(new int[]{1,2,3}));
        assertEquals(16, MultiplyAll.grow(new int[]{4,1,1,1,4}));
        assertEquals(64, MultiplyAll.grow(new int[]{2,2,2,2,2,2}));
        assertEquals(6, MultiplyAll.growStream(new int[]{1,2,3}));
        assertEquals(16, MultiplyAll.growStream(new int[]{4,1,1,1,4}));
        assertEquals(64, MultiplyAll.growStream(new int[]{2,2,2,2,2,2}));
    }
}