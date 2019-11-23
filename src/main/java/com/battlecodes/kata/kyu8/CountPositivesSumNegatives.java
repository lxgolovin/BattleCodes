package com.battlecodes.kata.kyu8;

import java.util.Arrays;

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
class CountPositivesSumNegatives {

    private CountPositivesSumNegatives() {}

    public static int[] countPositivesSumNegatives(int[] input) {
        if (input == null || input.length == 0) {
            return new int[] {};
        }


        int positive = (int)Arrays.stream(input).filter(i -> i > 0).count();
        int negative = Arrays.stream(input).filter(i -> i < 0).sum();

        return new int[] {positive, negative};
    }
}
