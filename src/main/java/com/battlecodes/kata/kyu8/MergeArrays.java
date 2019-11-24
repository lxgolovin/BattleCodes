package com.battlecodes.kata.kyu8;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Write a function that merges two sorted arrays into a single one.
 * The arrays only contain integers.
 * Also, the final outcome must be sorted and not have any duplicate.
 */
final class MergeArrays {

    private MergeArrays() {
    }

    static int[] mergeArrays(int[] first, int[] second) {
        return Stream.concat(Stream.of(Arrays.stream(first)), Stream.of(Arrays.stream(second)))
                .flatMapToInt(x -> x)
                .sorted()
                .distinct()
                .toArray();
    }

    static int[] mergeArraysInt(int[] first, int[] second) {
        return IntStream
                .concat(IntStream.of(first), IntStream.of(second))
                .sorted()
                .distinct()
                .toArray();
    }
}