package com.battlecodes.kata.kyu8;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Complete the square sum function so that it squares each number passed into it and then sums the results together.
 *
 * For example, for [1, 2, 2] it should return 9 because 1^2 + 2^2 + 2^2 = 9.
 */
class SquareNSumTest {

    /**
     * Testing squareSum both implementations
     */
    @Test
    void squareAndSum() {
        assertEquals(9, SquareNSum.squareSum(new int[]{1, 2, 2}));
        assertEquals(5, SquareNSum.squareSum(new int[]{1, 2}));
        assertEquals(50, SquareNSum.squareSum(new int[]{5, -3, 4}));
        assertEquals(9, SquareNSum.squareSumStream(new int[]{1, 2, 2}));
        assertEquals(5, SquareNSum.squareSumStream(new int[]{1, 2}));
        assertEquals(50, SquareNSum.squareSumStream(new int[]{5, -3, 4}));
    }

}