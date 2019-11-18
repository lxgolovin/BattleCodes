package com.battlecodes.kata.kyu5;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Move the first letter of each word to the end of it, then add "ay" to the end of the word.
 * Leave punctuation marks untouched.
 *
 * Examples
 * pigIt('Pig latin is cool'); // igPay atinlay siay oolcay
 * pigIt('Hello world !');     // elloHay orldway !
 */
public final class SimplePigLatin {

    private static final String NOT_ALPHA = "[!:,./?;]";

    private SimplePigLatin() {
    }

    static String pigIt(String str) {
        return Arrays.stream(str.split(" "))
                .map(s -> (s.matches(NOT_ALPHA)) ? s : ((s.substring(1) + s.substring(0, 1)) + "ay"))
                .collect(Collectors.joining(" "));
    }

    static String pigItCrazy(String str) {
        return str.replaceAll("(\\w)(\\w*)", "$2$1ay");
    }
}