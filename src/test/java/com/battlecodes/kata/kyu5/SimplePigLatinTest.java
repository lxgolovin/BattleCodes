package com.battlecodes.kata.kyu5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Move the first letter of each word to the end of it, then add "ay" to the end of the word. Leave punctuation marks untouched.
 *
 * Examples
 * pigIt('Pig latin is cool'); // igPay atinlay siay oolcay
 * pigIt('Hello world !');     // elloHay orldway !
 */
class SimplePigLatinTest {

    /**
     * Testing for piggy style latin
     */
    @Test
    void simplePigLatin() {
        assertEquals("igPay atinlay siay oolcay", SimplePigLatin.pigIt("Pig latin is cool"));
        assertEquals("hisTay siay ymay tringsay", SimplePigLatin.pigIt("This is my string"));
        assertEquals("igPay atinlay siay oolcay", SimplePigLatin.pigIt("Pig latin is cool"));
        assertEquals("elloHay orldway !", SimplePigLatin.pigIt("Hello world !"));

        assertEquals("igPay atinlay siay oolcay", SimplePigLatin.pigItCrazy("Pig latin is cool"));
        assertEquals("hisTay siay ymay tringsay", SimplePigLatin.pigItCrazy("This is my string"));
        assertEquals("igPay atinlay siay oolcay", SimplePigLatin.pigItCrazy("Pig latin is cool"));
        assertEquals("elloHay orldway !", SimplePigLatin.pigItCrazy("Hello world !"));
    }
}