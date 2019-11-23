package com.battlecodes.kata.kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeArraysTest {

    @Test
    void mergeArrays() {
        assertArrayEquals(new int[] { 1, 2, 3, 4, 5, 6 },
                MergeArrays.mergeArrays(new int[] { 1, 3, 5 }, new int[] { 2, 4, 6 }));
        assertArrayEquals(new int[] { 2, 4, 6, 8 },
                MergeArrays.mergeArrays(new int[] { 2, 4, 8 }, new int[] { 2, 4, 6 }));
    }

    @Test
    void mergeArraysInt() {
        assertArrayEquals(new int[] { 1, 2, 3, 4, 5, 6 },
                MergeArrays.mergeArraysInt(new int[] { 1, 3, 5 }, new int[] { 2, 4, 6 }));
        assertArrayEquals(new int[] { 2, 4, 6, 8 },
                MergeArrays.mergeArraysInt(new int[] { 2, 4, 8 }, new int[] { 2, 4, 6 }));
    }
}