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

    /**
     * Tests basics for the prime number
     */
    @Test
    public void testBasic() {
        assertFalse(PrimeNumber.isPrime(0), "0  is not prime");
        assertFalse(PrimeNumber.isPrime(1), "1  is not prime");
        assertTrue (PrimeNumber.isPrime(2), "2  is prime");
        assertTrue (PrimeNumber.isPrime(73), "73 is prime");
        assertFalse(PrimeNumber.isPrime(75), "75 is not prime");
        assertFalse(PrimeNumber.isPrime(-1), "-1 is not prime");
    }

    /**
     * All the numbers are prime. Check this out
     */
    @Test
    public void testPrime() {
        assertTrue(PrimeNumber.isPrime(3), "3 is prime");
        assertTrue(PrimeNumber.isPrime(5), "5 is prime");
        assertTrue(PrimeNumber.isPrime(7), "7 is prime");
        assertTrue(PrimeNumber.isPrime(41), "41 is prime");
        assertTrue(PrimeNumber.isPrime(5099), "5099 is prime");
    }

    /**
     * All the numbers are not prime. Check this out
     */
    @Test
    public void testNotPrime() {
        assertFalse(PrimeNumber.isPrime(4), "4 is not prime");
        assertFalse(PrimeNumber.isPrime(6), "6 is not prime");
        assertFalse(PrimeNumber.isPrime(8), "8 is not prime");
        assertFalse(PrimeNumber.isPrime(9), "9 is not prime");
        assertFalse( PrimeNumber.isPrime(45),"45 is not prime");
        assertFalse( PrimeNumber.isPrime(-5),"-5 is not prime");
        assertFalse( PrimeNumber.isPrime(-8),"-8 is not prime");
        assertFalse( PrimeNumber.isPrime(-41),"-41 is not prime");
    }
}