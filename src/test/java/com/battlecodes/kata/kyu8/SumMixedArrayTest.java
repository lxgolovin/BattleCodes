package com.battlecodes.kata.kyu8;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Given an array of integers as strings and numbers, return the sum of the array values as if all were numbers.
 *
 * Return your answer as a number.
 */
class SumMixedArrayTest {

    @Test
    void test_1() {
        assertEquals(10, SumMixedArray.sumClassic(Arrays.asList(5,"5")));
        assertEquals(10, SumMixedArray.sumStream(Arrays.asList(5,"5")));
    }

    @Test
    void test_2() {
        assertEquals(22, SumMixedArray.sumClassic(Arrays.asList(9, 3, "7", "3")));
        assertEquals(22, SumMixedArray.sumStream(Arrays.asList(9, 3, "7", "3")));
    }

    @Test
    void test_3() {
        assertEquals(42, SumMixedArray.sumClassic(Arrays.asList("5", "0", 9, 3, 2, 1, "9", 6, 7)));
        assertEquals(42, SumMixedArray.sumStream(Arrays.asList("5", "0", 9, 3, 2, 1, "9", 6, 7)));
    }

    @Test
    void test_4() {
        assertEquals(41, SumMixedArray.sumClassic(Arrays.asList("3", 6, 6, 0, "5", 8, 5, "6", 2, "0")));
        assertEquals(41, SumMixedArray.sumStream(Arrays.asList("3", 6, 6, 0, "5", 8, 5, "6", 2, "0")));
    }

    @Test
    void test_5() {
        assertEquals(45, SumMixedArray.sumClassic(Arrays.asList("1", "5", "8", 8, 9, 9, 2, "3")));
        assertEquals(45, SumMixedArray.sumStream(Arrays.asList("1", "5", "8", 8, 9, 9, 2, "3")));
    }

    @Test
    void test_6() {
        assertEquals(41, SumMixedArray.sumClassic(Arrays.asList("3", 6, 6, 0, "5", 8, 5, "6", 2, "0")));
        assertEquals(41, SumMixedArray.sumStream(Arrays.asList("3", 6, 6, 0, "5", 8, 5, "6", 2, "0")));
    }

    @Test
    void test_7() {
        assertEquals(61, SumMixedArray.sumClassic(Arrays.asList(8, 0, 0, 8, 5, 7, 2, 3, 7, 8, 6, 7)));
        assertEquals(61, SumMixedArray.sumStream(Arrays.asList(8, 0, 0, 8, 5, 7, 2, 3, 7, 8, 6, 7)));
    }
}