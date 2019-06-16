package com.battlecodes.kata.kyu8;

/**
 * We need a function that can transform a number into a string.
 *
 * What ways of achieving this do you know?
 *
 * Examples:
 * Kata.numberToString(123); // returns "123";
 * Kata.numberToString(999); // returns "999";
 */
class IntegerToString {

    /**
     * Old school name (slow one)
     * @param i integer to be converted
     * @return string converted from integer i
     */
    static String integerToString(int i) {
        return ""+i;
    }

    /**
     * Better type to convert
     * @param i integer to be converted
     * @return string converted from integer i
     */
    static String integerToStringOther(int i) {
        return Integer.toString(i);
    }

    /**
     * One more type to convert string to int
     * @param i integer to be converted
     * @return string converted from integer i
     */
    static String integerToStringOneMore(int i) {
        return String.valueOf(i);
    }
}