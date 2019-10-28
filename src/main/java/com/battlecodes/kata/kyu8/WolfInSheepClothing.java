package com.battlecodes.kata.kyu8;

import java.util.Arrays;
import java.util.Collections;

/**
 * A wolf in sheep's clothing
 *
 * Wolves have been reintroduced to Great Britain. You are a sheep farmer, and are now
 * plagued by wolves which pretend to be sheep. Fortunately, you are good at spotting them.
 *
 * Warn the sheep in front of the wolf that it is about to be eaten. Remember that you are
 * standing at the front of the queue which is at the end of the array:
 *
 * [sheep, sheep, sheep, sheep, sheep, wolf, sheep, sheep]      (YOU ARE HERE AT THE FRONT OF THE QUEUE)
 *    7      6      5      4      3            2      1
 *
 * If the wolf is the closest animal to you, return "Pls go away and stop eating my sheep".
 * Otherwise, return "Oi! Sheep number N! You are about to be eaten by a wolf!" where
 * N is the sheep's position in the queue.
 *
 * Note: there will always be exactly one wolf in the array.
 * Examples
 *
 * warnTheSheep(["sheep", "sheep", "sheep", "wolf", "sheep"]) === "Oi! Sheep number 1!
 * You are about to be eaten by a wolf!"
 *
 * warnTheSheep(["sheep", "sheep", "wolf"]) === "Pls go away and stop eating my sheep"
 */

public final class WolfInSheepClothing {

    private WolfInSheepClothing() {
    }

    static String warnTheSheep(String[] sheep) {
        int sheepNum = sheep.length - 1;

        if ("wolf".equals(sheep[sheepNum])) {
            return "Pls go away and stop eating my sheep";
        }

        int sheepCount = sheepNum;
        while (sheepCount > 0) {
            if ("wolf".equals(sheep[sheepCount])) {
                break;
            }
            sheepCount--;
        }
        return "Oi! Sheep number " + (sheepNum - sheepCount) + "! You are about to be eaten by a wolf!";
    }

    public static String warnTheSheepStream(String[] array) {
        Collections.reverse(Arrays.asList(array));
        int pos = Arrays.asList(array).indexOf("wolf");
        return pos == 0 ? "Pls go away and stop eating my sheep" : "Oi! Sheep number " + pos + "! You are about to be eaten by a wolf!";
    }
}
