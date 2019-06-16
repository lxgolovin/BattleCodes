package ru.codewars.kata.kyu8;


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

public class CountSheep {
    public CountSheep() {

        Boolean[] sheep = {true,  true,  true,  false,
                true,  true,  true,  true ,
                true,  false, true,  false,
                true,  false, false, true ,
                true,  true,  true,  true ,
                false, false, true,  true};
        System.out.println("Start with " + this.getClass());
        System.out.println(countSheep(sheep));
        System.out.println(countSheepSuper(sheep));
        System.out.println(countSheepSuperPuper(sheep));

        System.out.println("FINISHED with " + this.getClass());
    }

//    private static int countSheep2(Boolean[] sheep) {
//        Arrays.stream(sheep).
//    }

    private static int countSheep(Boolean[] sheep) {
        int count = 0;
        for (int i=0; i < sheep.length; i++ ) {
            try {
                if (sheep[i]) count++;
            }
            catch (java.lang.NullPointerException e) {
                continue;
            }
        }
        return count;
    }


    private static int countSheepSuper(Boolean[] arrayOfSheeps) {
        return (int) Arrays.stream(arrayOfSheeps)
                .filter(Objects::nonNull)
                .filter(Boolean::booleanValue).count();
    }

    public static int countSheepSuperPuper(Boolean[] arrayOfSheeps) {
        return (int) Arrays.stream(arrayOfSheeps).filter(b -> Boolean.TRUE.equals(b)).count();
    }
}
