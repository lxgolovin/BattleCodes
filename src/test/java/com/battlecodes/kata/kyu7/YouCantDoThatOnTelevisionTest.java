package com.battlecodes.kata.kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * There are just some things you can't do on television. In this case, you've just come back from having a "delicious" Barth burger and you're set to give an interview. The Barth burger has made you queezy, and you've forgotten some of the import rules of the "You Can't Do That on Television" set.
 *
 * If you say any of the following words a large bucket of "water" will be dumped on you: "water", "wet", "wash" This is true for any form of those words, like "washing", "watered", etc.
 *
 * If you say any of the following phrases you will be doused in "slime": "I don't know", "slime"
 *
 * If you say both in one sentence, a combination of water and slime, "sludge", will be dumped on you.
 *
 * Write a function, bucketOf(str), that takes a string and determines what will be dumped on your head. If you haven't said anything you shouldn't have, the bucket should be filled with "air". The words should be tested regardless of case.
 *
 * Examples:
 *
 * bucketOf("What is that, WATER?!?") -> "water"
 * bucketOf("I don't know if I'm doing this right.") -> "slime"
 * bucketOf("You won't get me!") -> "air"
 */
class YouCantDoThatOnTelevisionTest {

    /**
     * Testing of water condition
     */
    @Test
    void waterTest() {
        assertEquals("water", YouCantDoThatOnTelevision.bucketOf("water"));
        assertEquals("water", YouCantDoThatOnTelevision.bucketOf("wet"));
        assertEquals("water", YouCantDoThatOnTelevision.bucketOf("I got washed"));

        assertEquals("water", YouCantDoThatOnTelevision.bucketOfShort("water"));
        assertEquals("water", YouCantDoThatOnTelevision.bucketOfShort("wet"));
        assertEquals("water", YouCantDoThatOnTelevision.bucketOfShort("I got washed"));

        assertEquals("water", YouCantDoThatOnTelevision.bucketOfClassic("water"));
        assertEquals("water", YouCantDoThatOnTelevision.bucketOfClassic("wet"));
        assertEquals("water", YouCantDoThatOnTelevision.bucketOfClassic("I got washed"));
    }

    /**
     * Testing for slime
     */
    @Test
    void slimeTest() {
        assertEquals("slime", YouCantDoThatOnTelevision.bucketOf("slime"));
        assertEquals("slime", YouCantDoThatOnTelevision.bucketOf("I don't know me"));
        assertEquals("slime", YouCantDoThatOnTelevision.bucketOf("If I don't know me"));

        assertEquals("slime", YouCantDoThatOnTelevision.bucketOfShort("slime"));
        assertEquals("slime", YouCantDoThatOnTelevision.bucketOfShort("I don't know me"));
        assertEquals("slime", YouCantDoThatOnTelevision.bucketOfShort("If I don't know me"));

        assertEquals("slime", YouCantDoThatOnTelevision.bucketOfClassic("slime"));
        assertEquals("slime", YouCantDoThatOnTelevision.bucketOfClassic("I don't know me"));
        assertEquals("slime", YouCantDoThatOnTelevision.bucketOfClassic("If I don't know me"));
    }

    /**
     * Testing sludge
     */
    @Test
    void sludgeTest() {
        assertEquals("sludge", YouCantDoThatOnTelevision.bucketOf("Will I get wet? I don't know."));
        assertEquals("sludge", YouCantDoThatOnTelevision.bucketOfShort("Will I get wet? I don't know."));
        assertEquals("sludge", YouCantDoThatOnTelevision.bucketOfClassic("Will I get wet? I don't know."));
    }

    /**
     * Testing the rest
     */
    @Test
    void airTest() {
        assertEquals("air", YouCantDoThatOnTelevision.bucketOf("This should be safe."));
        assertEquals("air", YouCantDoThatOnTelevision.bucketOfShort("This should be safe."));
        assertEquals("air", YouCantDoThatOnTelevision.bucketOfClassic("This should be safe."));
    }
}