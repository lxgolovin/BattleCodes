package com.battlecodes.kata.kyu8;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests to check work of {@link StringToNumber} class
 */
class StringToNumberTest {

    private final int[] output = {1234, 605, 1405, -7};

    private final String[] input = {"1234", "605", "1405", "-7"};

    @Test
    void stringToNumberConverting() {
        for (int i = 0; i < output.length; i++) {
            assertEquals(output[i], StringToNumber.stringToNumber(input[i]));
        }
    }

    @Test
    void stringToNumberOtherConverting() {
        for (int i = 0; i < output.length; i++) {
            assertEquals(output[i], StringToNumber.stringToNumberOther(input[i]));
        }
    }
}