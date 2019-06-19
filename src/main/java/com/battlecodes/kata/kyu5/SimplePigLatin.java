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
public class SimplePigLatin {

    /**
     * Punctuation symbols
     */
    private static final String notAlpha = "[!:,./?;]";

    /**
     * Main method. Stream edition
     * @param str incoming string
     * @return returns pig latin string with not touched punctuation symbols
     */
    static String pigIt(String str) {
        return Arrays.stream(str.split(" "))
                .map(s -> (s.matches(notAlpha)) ? s : (s.substring(1).concat(s.substring(0, 1)).concat("ay")))
                .collect(Collectors.joining(" "));
    }

    /**
     * Main method. Crazy edition! Really clever!
     * @param str incoming string
     * @return returns pig latin string with not touched punctuation symbols
     */
    static String pigItCrazy(String str) {
        return str.replaceAll("(\\w)(\\w*)", "$2$1ay");
        //return  = str.replaceAll("([a-zA-Z])([a-zA-Z]*)","$2$1ay");
    }
}