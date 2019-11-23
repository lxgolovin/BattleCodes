package com.battlecodes.kata.kyu8;


import java.util.List;

/**
 * Given an array of integers as strings and numbers, return the sum of the array values as if all were numbers.
 *
 * Return your answer as a number.
 */
final class SumMixedArray {

    private SumMixedArray() {
    }

    static int sumClassic(List<?> mixed) {
        Integer result = 0;
        for (Object o : mixed) {
            if (o instanceof String) {
                result += Integer.parseInt(o.toString());
            } else if (o instanceof Integer) {
                result += (Integer) o;
            }
        }

        return result;
    }

    static int sumStream(List<?> mixed) {
        return mixed.stream()
                .mapToInt(x -> Integer.parseInt(x.toString())).sum();
    }
}
