package ru.codewars.kata.kyu8;

import java.util.ArrayList;
import java.util.TreeMap;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Given a set of numbers, return the additive inverse of each. Each positive becomes negatives, and the negatives become positives.
 *
 * invert([1,2,3,4,5]) == [-1,-2,-3,-4,-5]
 * invert([1,-2,3,-4,5]) == [-1,2,-3,4,-5]
 * invert([]) == []
 */

public class InvertInt {
    public InvertInt() {
        System.out.println("Start with " + this.getClass());
        int[] ar = {1,2,3,4,5,6};
        int[] ar2 = new int[ar.length];
        int[] ar3 = new int[ar.length];


        ar3 = invertSuper(ar);
//        ar2 = invert(ar);
        ar2 = invertOld(ar);



        for (int i = 0; i < ar2.length; i++) {
            System.out.println(ar[i] + " => " + ar2[i] + " => " + ar3[i]);
        }
        System.out.println("FINISHED with " + this.getClass());


    }
/*
    public static int[] invert(int[] arr) {
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = -arr[i];
        }
        return res;
    }
*/
    public static int[] invertOld(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (-1)*arr[i];
        }
        return arr;
    }


    public static int[] invertSuper(int[] arr) {
        return java.util.Arrays.stream(arr).map(i -> -i).toArray();
    }
}
