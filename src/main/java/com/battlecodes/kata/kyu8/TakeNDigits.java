package com.battlecodes.kata.kyu8;

import java.util.stream.IntStream;

/**
 * Create a method take that accepts a list/array and a number n,
 * and returns a list/array array of the first n elements from the list/array.
 */
final class TakeNDigits {
    private TakeNDigits() {}

    static int[] takeNDigits(int[] array, int n) {
        return IntStream
                .range(0, Math.min(n, array.length))
                .map(i -> array[i])
                .toArray();
    }
}