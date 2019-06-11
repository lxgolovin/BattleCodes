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

public class IntegerToString {
    public IntegerToString() {
        int i = 1234;

        System.out.println("Start with " + this.getClass());

        System.out.println(integerToString(i));
        System.out.println(integerToStringOther(i));
        System.out.println(integerToStringOneMore(i));

        System.out.println("FINISH with " + this.getClass());
    }

    public static String integerToString(int i) {
        return ""+i;
    }

    public static String integerToStringOther(int i) {
        return Integer.toString(i);
    }

    public static String integerToStringOneMore(int i) {
        return String.valueOf(i);
    }
}
