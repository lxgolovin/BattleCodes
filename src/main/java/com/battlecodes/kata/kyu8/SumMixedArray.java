package com.battlecodes.kata.kyu8;


import java.util.List;

/**
 * Given an array of integers as strings and numbers, return the sum of the array values as if all were numbers.
 *
 * Return your answer as a number.
 */
public class SumMixedArray {
    /*
     * Assume input will be only of Integer o String type
     */

    public int sumClassic(List<?> mixed) {
        Integer result = 0;

        for (int i=0; i < mixed.size(); i++) {
            if (mixed.get(i) instanceof String) {
                result += Integer.parseInt((String) mixed.get(i));
            } else {
                result += (Integer) mixed.get(i);
            }
        }

        return result;
    }

    public int sum(List<?> mixed) {
        return mixed.stream()
//                .mapToInt(x -> ((x instanceof String) ? Integer.parseInt((String ) x) : (Integer) x)).sum();
                .map(x -> (((Object) x).toString()))
                .mapToInt(x -> Integer.valueOf(x)).sum();
    }
}
