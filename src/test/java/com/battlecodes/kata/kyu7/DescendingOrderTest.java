package com.battlecodes.kata.kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests to check work of {@link DescendingOrder} class
 */
class DescendingOrderTest {

    private final int[] inputArray = {21445, 145263, 125485723};

    private final int[] outputArray = {54421, 654321, 875543221};

    @Test
    void sortDescArray() {
        for (int i = 0; i < inputArray.length; i++) {
            assertEquals(outputArray[i], DescendingOrder.sortDescArray(inputArray[i]));
        }
    }

    @Test
    void sortDescStream() {
        for (int i = 0; i < inputArray.length; i++) {
            assertEquals(outputArray[i], DescendingOrder.sortDescStream(inputArray[i]));
        }
    }
}