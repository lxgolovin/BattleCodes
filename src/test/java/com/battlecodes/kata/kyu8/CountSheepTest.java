package com.battlecodes.kata.kyu8;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test work of the class {@link CountSheep}
 */
class CountSheepTest {

    /**
     * Count sheep in 3 ways
     */
    @Test
    void countSheepSuperPuper() {
        Boolean[] sheep = {true, true, true, false,
                true, true, true, true,
                true, false, true, false,
                true, false, false, true,
                true, true, true, true,
                false, false, true, true};

        assertEquals(17, CountSheep.countSheep(sheep));
        assertEquals(17, CountSheep.countSheepStream(sheep));
        assertEquals(17, CountSheep.countSheepStreamVer2(sheep));
    }
}