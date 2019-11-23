package com.battlecodes.kata.kyu8;

import java.util.Arrays;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Your task is to sum the differences between consecutive pairs in the array in descending order.
 *
 * For example: sumOfDifferences([2, 1, 10]) Returns 9
 *
 * Descending order: [10, 2, 1]
 *
 * Sum: (10 - 2) + (2 - 1) = 8 + 1 = 9
 *
 * If the array is empty or the array has only one element the result should be 0 (Nothing in Haskell).
 */
final class SumOfDifferences {


    private SumOfDifferences() {
    }

    static int sumOfDifferences(int[] arr) {
        List<Integer> localArr = Arrays.stream(arr)
                .boxed()
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());
        if (localArr.size() < 2) {
            return 0;
        }

        return IntStream.range(0, localArr.size() - 1)
                .map(i -> localArr.get(i) - localArr.get(i + 1))
                .sum();
    }

    static int sumOfDifferencesEasy(int[] arr) {
        Arrays.sort(arr);
        return arr.length <= 1 ? 0 : arr[arr.length-1] - arr[0];
    }

    static int sumOfDifferencesSummaryStatistics(int[] arr) {
        IntSummaryStatistics stat = Arrays.stream(arr).summaryStatistics();
        return arr.length > 1 ? stat.getMax() - stat.getMin() : 0;
    }
}
