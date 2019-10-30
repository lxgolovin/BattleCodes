package com.battlecodes.kata.kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Nathan loves cycling.
 * Because Nathan knows it is important to stay hydrated, he drinks 0.5 litres of water per hour of cycling.
 * You get given the time in hours and you need to return the number of litres Nathan will drink, rounded to the smallest value.
 * For example:
 * time = 3 ----> litres = 1
 * time = 6.7---> litres = 3
 * time = 11.8--> litres = 5
 */
final class KeepHydratedTest {

    private KeepHydratedTest() {}

    @Test
    void checkLitersToDrink() {
        assertEquals(1, KeepHydrated.getDrunkLiters(2));
        assertEquals(0, KeepHydrated.getDrunkLiters(0.97));
        assertEquals(7, KeepHydrated.getDrunkLiters(14.64));
        assertEquals(800, KeepHydrated.getDrunkLiters(1600.20));
        assertEquals(40, KeepHydrated.getDrunkLiters(80));
    }
}