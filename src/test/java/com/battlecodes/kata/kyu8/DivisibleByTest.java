package com.battlecodes.kata.kyu8;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Complete the function which takes two arguments and returns all numbers
 * which are divisible by the given divisor. First argument is an array of
 * numbers and the second is the divisor.
 * Example
 *
 * divisibleBy([1, 2, 3, 4, 5, 6], 2) == [2, 4, 6]
 */
class DivisibleByTest {

    @Test
    void divisibleByTest() {
        assertTrue(Arrays.equals(new int[] {2,4,6}, DivisibleBy.divisibleBy(new int[] {1,2,3,4,5,6},2)));
        assertTrue(Arrays.equals(new int[] {3,6}, DivisibleBy.divisibleBy(new int[] {1,2,3,4,5,6},3)));
        assertTrue(Arrays.equals(new int[] {0,4}, DivisibleBy.divisibleBy(new int[] {0,1,2,3,4,5,6},4)));
    }
}