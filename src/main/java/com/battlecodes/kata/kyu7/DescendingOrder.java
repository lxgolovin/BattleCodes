package com.battlecodes.kata.kyu7;

import java.util.Arrays;
import java.util.Comparator;

import static com.battlecodes.kata.kyu8.StringToNumber.stringToNumber;
import static java.util.stream.Collectors.joining;

/**
 * Your task is to make a function that can take any non-negative integer as
 * a argument and return it with its digits in descending order.
 * Essentially, rearrange the digits to create the highest possible number.
 *
 * Examples:
 * Input: 21445 Output: 54421
 * Input: 145263 Output: 654321
 * Input: 1254859723 Output: 9875543221
 */
public class DescendingOrder {

    /**
     * Array based implementation
     * @param num integer number to be converted
     * @return rearranged num with its digits in descending order (the highest possible number)
     */
    public static int sortDescArray(int num) {
        String numStr = ""+num;

        String[] splited = numStr.split("");
        Arrays.sort(splited, Comparator.reverseOrder());
        String joined = String.join("",splited);

        return stringToNumber(joined);
    }

    /**
     * Stream based implementation
     * @param num integer number to be converted
     * @return rearranged num with its digits in descending order (the highest possible number)
     */
    public static int sortDescStream(int num) {
        String numStr = ""+num;

        return stringToNumber(
                Arrays.stream(numStr.split(""))
                        .sorted(Comparator.reverseOrder())
                        .collect(joining()));
    }
}