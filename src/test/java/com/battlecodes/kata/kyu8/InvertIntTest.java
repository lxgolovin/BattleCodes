package com.battlecodes.kata.kyu8;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

 /**
 * Given a set of numbers, return the additive inverse of each. Each positive becomes negatives, and the negatives become positives.
 *
 * invert([1,2,3,4,5]) == [-1,-2,-3,-4,-5]
 * invert([1,-2,3,-4,5]) == [-1,2,-3,4,-5]
 * invert([]) == []
 */
class InvertIntTest {

     /**
      * Check inverting in several ways
      */
    @Test
    void invertInt() {
            int[] ar = {1,2,3,4,5,6};
            int[] result = {-1,-2,-3,-4,-5,-6};

            assertArrayEquals(result, InvertInt.invert(ar));
            assertArrayEquals(result, InvertInt.invertStream(ar));
    }
}