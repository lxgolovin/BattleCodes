package com.battlecodes.kata.kyu6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Define a function that takes an integer argument and returns logical value true or false
 * depending on if the integer is a prime.
 *
 * Per Wikipedia, a prime number (or a prime) is a natural number greater than 1 that has
 * no positive divisors other than 1 and itself.
 *
 * Example
 * is_prime(1) false
 * is_prime(2) true
 * is_prime(-1) false
 * Assumptions
 *      You can assume you will be given an integer input.
 *      You can not assume that the integer will be only positive.
 *      You may be given negative numbers as well(or 0).
 *      There are no fancy optimizations required,but still the most trivial solutions
 *      might time out.Try to find a solution which does not loop all the way up to n.
 */
class PrimeNumberTest {

    @Test
    void testBasic() {
        assertFalse(PrimeNumber.isPrimeClassic(0), "0  is not prime");
        assertFalse(PrimeNumber.isPrimeClassic(1), "1  is not prime");
        assertTrue (PrimeNumber.isPrimeClassic(2), "2  is prime");
        assertTrue (PrimeNumber.isPrimeClassic(73), "73 is prime");
        assertFalse(PrimeNumber.isPrimeClassic(75), "75 is not prime");
        assertFalse(PrimeNumber.isPrimeClassic(-1), "-1 is not prime");

        assertFalse(PrimeNumber.isPrimeStream(0), "0  is not prime");
        assertFalse(PrimeNumber.isPrimeStream(1), "1  is not prime");
        assertTrue (PrimeNumber.isPrimeStream(2), "2  is prime");
        assertTrue (PrimeNumber.isPrimeStream(73), "73 is prime");
        assertFalse(PrimeNumber.isPrimeStream(75), "75 is not prime");
        assertFalse(PrimeNumber.isPrimeStream(-1), "-1 is not prime");

        assertFalse(PrimeNumber.isPrimeBig(0), "0  is not prime");
        assertFalse(PrimeNumber.isPrimeBig(1), "1  is not prime");
        assertTrue (PrimeNumber.isPrimeBig(2), "2  is prime");
        assertTrue (PrimeNumber.isPrimeBig(73), "73 is prime");
        assertFalse(PrimeNumber.isPrimeBig(75), "75 is not prime");
        assertFalse(PrimeNumber.isPrimeBig(-1), "-1 is not prime");
    }

    @Test
    void testPrime() {
        assertTrue(PrimeNumber.isPrimeClassic(3), "3 is prime");
        assertTrue(PrimeNumber.isPrimeClassic(5), "5 is prime");
        assertTrue(PrimeNumber.isPrimeClassic(7), "7 is prime");
        assertTrue(PrimeNumber.isPrimeClassic(41), "41 is prime");
        assertTrue(PrimeNumber.isPrimeClassic(5099), "5099 is prime");

        assertTrue(PrimeNumber.isPrimeStream(3), "3 is prime");
        assertTrue(PrimeNumber.isPrimeStream(5), "5 is prime");
        assertTrue(PrimeNumber.isPrimeStream(7), "7 is prime");
        assertTrue(PrimeNumber.isPrimeStream(41), "41 is prime");
        assertTrue(PrimeNumber.isPrimeStream(5099), "5099 is prime");

        assertTrue(PrimeNumber.isPrimeBig(3), "3 is prime");
        assertTrue(PrimeNumber.isPrimeBig(5), "5 is prime");
        assertTrue(PrimeNumber.isPrimeBig(7), "7 is prime");
        assertTrue(PrimeNumber.isPrimeBig(41), "41 is prime");
        assertTrue(PrimeNumber.isPrimeBig(5099), "5099 is prime");
    }

    @Test
    void testNotPrime() {
        assertFalse(PrimeNumber.isPrimeClassic(4), "4 is not prime");
        assertFalse(PrimeNumber.isPrimeClassic(6), "6 is not prime");
        assertFalse(PrimeNumber.isPrimeClassic(8), "8 is not prime");
        assertFalse(PrimeNumber.isPrimeClassic(9), "9 is not prime");
        assertFalse( PrimeNumber.isPrimeClassic(45),"45 is not prime");
        assertFalse( PrimeNumber.isPrimeClassic(-5),"-5 is not prime");
        assertFalse( PrimeNumber.isPrimeClassic(-8),"-8 is not prime");
        assertFalse( PrimeNumber.isPrimeClassic(-41),"-41 is not prime");

        assertFalse(PrimeNumber.isPrimeStream(4), "4 is not prime");
        assertFalse(PrimeNumber.isPrimeStream(6), "6 is not prime");
        assertFalse(PrimeNumber.isPrimeStream(8), "8 is not prime");
        assertFalse(PrimeNumber.isPrimeStream(9), "9 is not prime");
        assertFalse( PrimeNumber.isPrimeStream(45),"45 is not prime");
        assertFalse( PrimeNumber.isPrimeStream(-5),"-5 is not prime");
        assertFalse( PrimeNumber.isPrimeStream(-8),"-8 is not prime");
        assertFalse( PrimeNumber.isPrimeStream(-41),"-41 is not prime");

        assertFalse(PrimeNumber.isPrimeBig(4), "4 is not prime");
        assertFalse(PrimeNumber.isPrimeBig(6), "6 is not prime");
        assertFalse(PrimeNumber.isPrimeBig(8), "8 is not prime");
        assertFalse(PrimeNumber.isPrimeBig(9), "9 is not prime");
        assertFalse( PrimeNumber.isPrimeBig(45),"45 is not prime");
        assertFalse( PrimeNumber.isPrimeBig(-5),"-5 is not prime");
        assertFalse( PrimeNumber.isPrimeBig(-8),"-8 is not prime");
        assertFalse( PrimeNumber.isPrimeBig(-41),"-41 is not prime");
    }
}