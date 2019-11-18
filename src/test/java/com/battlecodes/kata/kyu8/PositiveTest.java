package com.battlecodes.kata.kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Description:
 * You get an array of numbers, return the sum of all of the positives ones.
 * Example [1,-4,7,12] => 1 + 7 + 12 = 20
 * Note: if there is nothing to sum, the sum is default to 0
 */
class PositiveTest {

    @Test
    void sumAllPositives() {
        int[] justArray = Positive.randomArray();

        assertEquals(Positive.sumPositives(justArray), Positive.sumPositivesStream(justArray));
    }
}