package com.battlecodes.kata.kyu8;

import java.util.Arrays;

/**
 * Description:
 * You get an array of numbers, return the sum of all of the positives ones.
 * Example [1,-4,7,12] => 1 + 7 + 12 = 20
 * Note: if there is nothing to sum, the sum is default to 0
 */
final class Positive {

    private Positive() {
    }

    static int sumPositivesStream(int[] arr){
        return Arrays.stream(arr).filter(v -> v > 0).sum();
    }

    static int sumPositives(int[] arr) {
        int res = 0;

        if (arr.length <= 0 ) {
            return res;
        }

        for (int i : arr) {
            if ( i > 0 ) {
                res += i;
            }
        }

        return res;
    }

    private static int random(int min, int max) {
        return min+(int)(Math.random()*(max-min));
    }

    static int[] randomArray () {
        int randomSize = random(10, 5000);
        int[] arr = new int[randomSize];

        for (int i =0; i<randomSize; i++) {
            arr[i] = random(-100, 100);
        }

        return arr;
    }
}