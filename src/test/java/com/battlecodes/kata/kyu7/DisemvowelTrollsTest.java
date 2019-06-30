package com.battlecodes.kata.kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

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
class DisemvowelTrollsTest {

    @Test
    void disemvowel() {
        assertEquals("Ths wbst s fr lsrs LL!",
                DisemvowelTrolls.disemvowel("This website is for losers LOL!"));
        assertEquals("N ffns bt,\nYr wrtng s mng th wrst 'v vr rd",
                DisemvowelTrolls.disemvowel("No offense but,\nYour writing is among the worst I've ever read"));
        assertEquals( "Wht r y,  cmmnst?",
                DisemvowelTrolls.disemvowel("What are you, a communist?"));
    }

    @Test
    void disemvowelMatcher() {
        assertEquals("Ths wbst s fr lsrs LL!",
                DisemvowelTrolls.disemvowelMatcher("This website is for losers LOL!"));
        assertEquals("N ffns bt,\nYr wrtng s mng th wrst 'v vr rd",
                DisemvowelTrolls.disemvowelMatcher("No offense but,\nYour writing is among the worst I've ever read"));
        assertEquals( "Wht r y,  cmmnst?",
                DisemvowelTrolls.disemvowelMatcher("What are you, a communist?"));
    }
}