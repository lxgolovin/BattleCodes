package com.battlecodes.kata.kyu8;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests to check work of {@link StringToNumber} class
 */
class StringToNumberTest {

    /**
     * output values
     */
    private final int[] output = {1234, 605, 1405, -7};

    /**
     * input values
     */
    private final String[] input = {"1234", "605", "1405", "-7"};

    /**
     * Converts string to integer by parseInt
     */
    @Test
    void stringToNumberConverting() {
        for (int i = 0; i < output.length; i++) {
            assertEquals(output[i], StringToNumber.stringToNumber(input[i]));
        }
    }

    /**
     * Converts string to integer by valueOf
     */
    @Test
    void stringToNumberOtherConverting() {
        for (int i = 0; i < output.length; i++) {
            assertEquals(output[i], StringToNumber.stringToNumberOther(input[i]));
        }
    }
}