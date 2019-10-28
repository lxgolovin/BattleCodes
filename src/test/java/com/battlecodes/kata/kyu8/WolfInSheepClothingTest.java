package com.battlecodes.kata.kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WolfInSheepClothingTest {

    @Test
    void warnTheSheep() {
        assertEquals("Oi! Sheep number 2! You are about to be eaten by a wolf!",
                WolfInSheepClothing.warnTheSheep(new String[]{"sheep", "sheep", "sheep", "sheep", "sheep", "wolf", "sheep", "sheep"}));
        assertEquals("Oi! Sheep number 5! You are about to be eaten by a wolf!",
                WolfInSheepClothing.warnTheSheep(new String[]{"sheep", "wolf", "sheep", "sheep", "sheep", "sheep", "sheep"}));
        assertEquals("Oi! Sheep number 6! You are about to be eaten by a wolf!",
                WolfInSheepClothing.warnTheSheep(new String[]{"wolf", "sheep", "sheep", "sheep", "sheep", "sheep", "sheep"}));
        assertEquals("Oi! Sheep number 1! You are about to be eaten by a wolf!",
                WolfInSheepClothing.warnTheSheep(new String[]{"sheep", "wolf", "sheep"}));
        assertEquals("Pls go away and stop eating my sheep",
                WolfInSheepClothing.warnTheSheep(new String[]{"sheep", "sheep", "wolf"}));
    }

    @Test
    void warnTheSheepStream() {
        assertEquals("Oi! Sheep number 2! You are about to be eaten by a wolf!",
                WolfInSheepClothing.warnTheSheepStream(new String[]{"sheep", "sheep", "sheep", "sheep", "sheep", "wolf", "sheep", "sheep"}));
        assertEquals("Oi! Sheep number 5! You are about to be eaten by a wolf!",
                WolfInSheepClothing.warnTheSheepStream(new String[]{"sheep", "wolf", "sheep", "sheep", "sheep", "sheep", "sheep"}));
        assertEquals("Oi! Sheep number 6! You are about to be eaten by a wolf!",
                WolfInSheepClothing.warnTheSheepStream(new String[]{"wolf", "sheep", "sheep", "sheep", "sheep", "sheep", "sheep"}));
        assertEquals("Oi! Sheep number 1! You are about to be eaten by a wolf!",
                WolfInSheepClothing.warnTheSheepStream(new String[]{"sheep", "wolf", "sheep"}));
        assertEquals("Pls go away and stop eating my sheep",
                WolfInSheepClothing.warnTheSheepStream(new String[]{"sheep", "sheep", "wolf"}));
    }
}