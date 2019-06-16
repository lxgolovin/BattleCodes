package ru.codewars.kata.kyu8;

/**
 * Description:
 * You get an array of numbers, return the sum of all of the positives ones.
 * Example [1,-4,7,12] => 1 + 7 + 12 = 20
 * Note: if there is nothing to sum, the sum is default to 0
 */

import java.util.Arrays;

public class Positive {
    public Positive(Boolean printIt) {
        int[] justArray;

        System.out.println("Start with " + this.getClass());

        justArray = randomArray();
        if (printIt) {
            for (int i: justArray ) {
                System.out.println(i);
           }
        }

        System.out.println(sum(justArray));
        System.out.println(sumSuper(justArray));

        System.out.println("FINISH with " + this.getClass());
    }

    public static int sumSuper(int[] arr){
        return Arrays.stream(arr).filter(v -> v > 0).sum();
    }

    public static int sum(int[] arr) {
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

    private static int[] randomArray () {
        int randomSize = random(10, 5000);
        int[] arr = new int[randomSize];

        for (int i =0; i<randomSize; i++) {
            arr[i] = random(-100, 100);
        }

        return arr;
    }
}
