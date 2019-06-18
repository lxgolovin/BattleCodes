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
     * TODO: implement classic version
     * @param input incoming string
     * @return returns pig latin string with not touched punctuation symbols
     */
    static String pigIt(String input) {
        return Arrays.stream(input.split(" "))
                .map(s -> (s.matches(notAlpha)) ? s : (s.substring(1) + s.substring(0, 1) + "ay"))
                .collect(Collectors.joining(" "));
    }
}