package com.battlecodes.kata.kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Given an array of integers.
 *
 * Return an array, where the first element is the count of positives numbers and the second element is sum of negative numbers.
 *
 * If the input array is empty or null, return an empty array.
 * Example
 *
 * For input [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15], you should return [10, -65].
 */
class CountPositivesSumNegativesTest {

    @Test
    void countPositivesSumNegatives() {
        assertArrayEquals(new int[] {10, -65},
                CountPositivesSumNegatives.countPositivesSumNegatives(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15}));
    }
}