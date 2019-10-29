package com.battlecodes.kata.kyu8;

import java.util.Arrays;
import java.util.Collections;

/**
 * A wolf in sheep's clothing
 * I would like to be able to pass an array with two elements to my
 * swapValues function to swap the values. However it appears that the values aren't changing.
 * Can you figure out what's wrong here?
 */

class SwapperValues {

    public Object[] arguments;

    public SwapperValues(final Object[] args){
        this.arguments=args;
    }

    public void swapValues() {
        Object temp = arguments[0];
        arguments[0] = arguments[1];
        arguments[1] = temp;
    }

    public void swapValuesClever() {
        Collections.reverse(Arrays.asList(arguments));
    }
}