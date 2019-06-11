package com.battlecodes.kata.kyu8;


/**
 * Note: This kata is inspired by Convert a Number to a String!. Try that one too.
 *
 * Description
 * We need a function that can transform a string into a number. What ways of achieving this do you know?
 *
 * Note: Don't worry, all inputs will be strings, and every string is a perfectly valid representation of an integral number.
 *
 * Examples
 * stringToNumber("1234") == 1234
 * stringToNumber("605" ) == 605
 * stringToNumber("1405") == 1405
 * stringToNumber("-7"  ) == -7
 */
public class StringToNumber {
    public StringToNumber() {
        System.out.println("Start with " + this.getClass());
        System.out.println(stringToNumber("1234"));
        System.out.println(stringToNumberOther("1234"));

        System.out.println("FINISHED with " + this.getClass());
    }

    public static int stringToNumber(String str) {
        return Integer.parseInt(str);
    }

    public static int stringToNumberOther(String str) {
        return Integer.valueOf(str);
    }
}
