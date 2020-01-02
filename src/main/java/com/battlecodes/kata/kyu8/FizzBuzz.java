package com.battlecodes.kata.kyu8;

import java.util.Optional;

/**
 * Problem : For a given natural number greater than zero return:
 *     “Fizz” if the number is dividable by 3
 *     “Buzz” if the number is dividable by 5
 *     “FizzBuzz” if the number is dividable by 15
 *     the same number if number is neither divisible by 3 nor 5.
 */
final class FizzBuzz {

    private FizzBuzz() {
    }

    static String fizzBuzz(int number) {
        String result = Optional.of(number)
                .map(n -> (n % 3 == 0 ? "Fizz" : "") + (n % 5 == 0 ? "Buzz" : ""))
                .get();
        return result.isEmpty() ? Integer.toString(number) : result;
    }

    public static String fizzBuzzClassic(int number) {
        if (number % 15 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        }
        return Integer.toString(number);
    }
}
