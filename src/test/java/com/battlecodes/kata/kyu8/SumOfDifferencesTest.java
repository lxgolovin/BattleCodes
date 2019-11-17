package com.battlecodes.kata.kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfDifferencesTest {

    @Test
    void basicTests() {
        assertEquals(9, SumOfDifferences.sumOfDifferences(new int[]{1, 2, 10}));
        assertEquals(2, SumOfDifferences.sumOfDifferences(new int[]{-3, -2, -1}));
        assertEquals(0, SumOfDifferences.sumOfDifferences(new int[]{1, 1, 1, 1, 1}));
        assertEquals(34, SumOfDifferences.sumOfDifferences(new int[]{-17, 17}));
        assertEquals(0, SumOfDifferences.sumOfDifferences(new int[0]));
        assertEquals(0, SumOfDifferences.sumOfDifferences(new int[]{0}));
        assertEquals(0, SumOfDifferences.sumOfDifferences(new int[]{-1}));
        assertEquals(0, SumOfDifferences.sumOfDifferences(new int[]{1}));
    }

    @Test
    void sumOfDifferencesEasyTest() {
        assertEquals(9, SumOfDifferences.sumOfDifferencesEasy(new int[]{1, 2, 10}));
        assertEquals(2, SumOfDifferences.sumOfDifferencesEasy(new int[]{-3, -2, -1}));
        assertEquals(0, SumOfDifferences.sumOfDifferencesEasy(new int[]{1, 1, 1, 1, 1}));
        assertEquals(34, SumOfDifferences.sumOfDifferencesEasy(new int[]{-17, 17}));
        assertEquals(0, SumOfDifferences.sumOfDifferencesEasy(new int[0]));
        assertEquals(0, SumOfDifferences.sumOfDifferencesEasy(new int[]{0}));
        assertEquals(0, SumOfDifferences.sumOfDifferencesEasy(new int[]{-1}));
        assertEquals(0, SumOfDifferences.sumOfDifferencesEasy(new int[]{1}));
    }

    @Test
    void sumOfDifferencesSummaryStatisticsTest() {
        assertEquals(9, SumOfDifferences.sumOfDifferencesSummaryStatistics(new int[]{1, 2, 10}));
        assertEquals(2, SumOfDifferences.sumOfDifferencesSummaryStatistics(new int[]{-3, -2, -1}));
        assertEquals(0, SumOfDifferences.sumOfDifferencesSummaryStatistics(new int[]{1, 1, 1, 1, 1}));
        assertEquals(34, SumOfDifferences.sumOfDifferencesSummaryStatistics(new int[]{-17, 17}));
        assertEquals(0, SumOfDifferences.sumOfDifferencesSummaryStatistics(new int[0]));
        assertEquals(0, SumOfDifferences.sumOfDifferencesSummaryStatistics(new int[]{0}));
        assertEquals(0, SumOfDifferences.sumOfDifferencesSummaryStatistics(new int[]{-1}));
        assertEquals(0, SumOfDifferences.sumOfDifferencesSummaryStatistics(new int[]{1}));
    }
}