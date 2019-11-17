package com.battlecodes.kata.kyu8;

/**
 * Given a set of numbers, return the additive inverse of each. Each positive becomes negatives, and the negatives become positives.
 *
 * invert([1,2,3,4,5]) == [-1,-2,-3,-4,-5]
 * invert([1,-2,3,-4,5]) == [-1,2,-3,4,-5]
 * invert([]) == []
 */
final class InvertInt {

    private InvertInt() {
    }

    static int[] invert(int[] arr) {
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = -arr[i];
        }
        return res;
    }

    static int[] invertStream(int[] arr) {
        return java.util.Arrays.stream(arr).map(i -> -i).toArray();
    }
}
