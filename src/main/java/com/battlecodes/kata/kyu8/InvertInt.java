package com.battlecodes.kata.kyu8;

/**
 * Given a set of numbers, return the additive inverse of each. Each positive becomes negatives, and the negatives become positives.
 *
 * invert([1,2,3,4,5]) == [-1,-2,-3,-4,-5]
 * invert([1,-2,3,-4,5]) == [-1,2,-3,4,-5]
 * invert([]) == []
 */
class InvertInt {

    /**
     * Old school invert
     * @param arr array of integers to be inverted
     * @return inverted array
     */
    static int[] invert(int[] arr) {
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = -arr[i];
        }
        return res;
    }

    /**
     * Stream version of invertion
     * @param arr array of integers to be inverted
     * @return inverted array
     */
    static int[] invertStream(int[] arr) {
        return java.util.Arrays.stream(arr).map(i -> -i).toArray();
    }
}
