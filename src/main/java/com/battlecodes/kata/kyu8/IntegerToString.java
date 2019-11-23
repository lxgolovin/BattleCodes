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
final class IntegerToString {

    private IntegerToString() {
    }

    static String integerToString(int i) {
        return ""+i;
    }

    static String integerToStringOther(int i) {
        return Integer.toString(i);
    }

    static String integerToStringOneMore(int i) {
        return String.valueOf(i);
    }
}