package com.battlecodes.kata.kyu8;

import java.util.Arrays;
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

    static int[] takeNDigitsClever(int[] array, int n) {
        return n > array.length ? array : Arrays.copyOf(array, n);
    }

    static int[] takeNDigitsSuperClever(int[] array, int n) {
        return Arrays.stream(array).limit(n).toArray();
    }
}