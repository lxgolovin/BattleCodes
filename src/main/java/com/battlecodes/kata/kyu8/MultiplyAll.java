package com.battlecodes.kata.kyu8;

import java.util.stream.IntStream;

/**
 * Given a non-empty array of integers, return the result of multiplying the values together in order. Example:
 *
 * [1, 2, 3, 4] => 1 * 2 * 3 * 4 = 24
 */
final class MultiplyAll {

    private MultiplyAll() {
    }

    static int grow(int[] x) {
        int finalValue = 1;
        for (int value : x) {
            finalValue *= value;
        }
        return finalValue;
    }

    static int growStream(int[] x) {
        return IntStream.of(x).reduce(1, (a, b) -> a * b);
    }
}
