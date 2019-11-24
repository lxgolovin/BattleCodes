package com.battlecodes.kata.kyu8;

import java.util.Arrays;

/**
 * Complete the function which takes two arguments and returns all numbers
 * which are divisible by the given divisor. First argument is an array of
 * numbers and the second is the divisor.
 * Example
 *
 * divisibleBy([1, 2, 3, 4, 5, 6], 2) == [2, 4, 6]
 */
final class DivisibleBy {

    private DivisibleBy() {
    }

    static int[] divisibleBy(int[] numbers, int divider) {
        return (divider == 0) ? numbers : Arrays.stream(numbers).filter(x -> x % divider == 0).toArray();
    }
}
