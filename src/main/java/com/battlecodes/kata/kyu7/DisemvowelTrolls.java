package com.battlecodes.kata.kyu7;

import java.util.regex.Pattern;

/**
 * Trolls are attacking your comment section!
 *
 * A common way to deal with this situation is to remove all of the vowels from the trolls' comments, neutralizing the threat.
 *
 * Your task is to write a function that takes a string and return a new string with all vowels removed.
 *
 * For example, the string "This website is for losers LOL!" would become "Ths wbst s fr lsrs LL!".
 *
 * Note: for this kata y isn't considered a vowel.
 */
final class DisemvowelTrolls {

    private static final Pattern DISEMVOWEL_PATTERN = Pattern.compile("(?i)[aeiou]");

    private DisemvowelTrolls() {
    }

    public static String disemvowelMatcher(String str) {
        return DISEMVOWEL_PATTERN.matcher(str).replaceAll("");
    }

    static String disemvowel(String str) {
        return str.replaceAll("([AEIOUaeiou])", "");
    }
}
