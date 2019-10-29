package com.battlecodes.kata.kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SwapperValuesTest {

    @Test
    void swapperValues() {
        Integer[] args = {1,2};

        SwapperValues r= new SwapperValues(args);
        r.swapValues();
        assertEquals(2,r.arguments[0] );
        assertEquals(1,r.arguments[1] );
    }

    @Test
    void swapperValuesClever() {
        Integer[] args = {1,2};

        SwapperValues r= new SwapperValues(args);
        r.swapValuesClever();
        assertEquals(2,r.arguments[0] );
        assertEquals(1,r.arguments[1] );
    }
}