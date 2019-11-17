package com.battlecodes.kata.kyu8;

import java.util.Arrays;

/**
 * Complete the square sum function so that it squares each number passed into it and then sums the results together.
 *
 * For example, for [1, 2, 2] it should return 9 because 1^2 + 2^2 + 2^2 = 9.
 */
final class SquareNSum {

    private SquareNSum() {
    }

    static int squareSumStream(int[] arr) {
        return Arrays.stream(arr).map(x -> x*x).sum();
    }

    static int squareSum(int[] arr) {
        int result = 0;
        for (int i:arr) {
            result += i * i;
        }
        return result;
    }
}
