package com.battlecodes.kata.kyu8;


import java.util.Arrays;
import java.util.Objects;

/**
 * Consider an array of sheep where some sheep may be missing from their place.
 * We need a function that counts the number of sheep present in the array (true means present).
 *
 * For example,
 *
 * [true,  true,  true,  false,
 *   true,  true,  true,  true ,
 *   true,  false, true,  false,
 *   true,  false, false, true ,
 *   true,  true,  true,  true ,
 *   false, false, true,  true]
 * The correct answer would be 17.
 *
 * Hint: Don't forget to check for bad values like null/undefined
 */
final class CountSheep {

    private CountSheep() {
    }

    static int countSheep(Boolean[] sheep) {
        int count = 0;
        for (Boolean s: sheep) {
            try {
                if (s) count++;
            }
            catch (java.lang.NullPointerException e) {
                // do nothing
            }
        }
        return count;
    }


    static int countSheepStream(Boolean[] sheep) {
        return (int) Arrays.stream(sheep)
                .filter(Objects::nonNull)
                .filter(Boolean::booleanValue).count();
    }

    static int countSheepStreamVer2(Boolean[] sheep) {
        return (int) Arrays.stream(sheep).filter(Boolean.TRUE::equals).count();
    }
}
