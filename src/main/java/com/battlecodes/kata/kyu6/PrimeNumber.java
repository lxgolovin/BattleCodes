package com.battlecodes.kata.kyu6;

import java.util.stream.IntStream;

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
class PrimeNumber {

    /**
     * Value of certainty a measure of the uncertainty that the caller is
     * willing to tolerate: if the call returns {@code true}
     * the probability that this BigInteger is prime exceeds
     * (1 - 1/2<sup>{@code certainty}</sup>).  The execution time of
     * this method is proportional to the value of this parameter.
     */
    private final static int certainty = 20;

    /**
     * Is the number prime or not. Classic implementation
     * @param num incoming number
     * @return true if the number is prime, else false
     */
    static boolean isPrimeClassic(int num) {
        if (num == 2) {
            return true;
        }

        if ((num < 2) || (num%2==0)) {
            return false;
        }

        for (int i=3; i < (Math.sqrt(num) + 1); i++) {
            if (num%i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Is the number prime or not. Stream implementation
     * @param num incoming number
     * @return true if the number is prime, else false
     */
    static boolean isPrimeStream(int num) {
        if (num == 2) return true;
        if ((num < 2) || (num%2==0)) return false;

        return !IntStream.rangeClosed(3, (int) Math.sqrt(num) + 1).filter(x -> (num%x == 0)).findAny().isPresent();
    }

    /**
     * Is the number prime or not. BigInteger implementation
     * @param num incoming number
     * @return true if the number is prime, else false
     */
    static boolean isPrimeBig(int num) {
        return num > 1 && java.math.BigInteger.valueOf(num).isProbablePrime(certainty);
    }
}
