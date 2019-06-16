package com.battlecodes.kata.kyu8;

/**
 * Write a function called repeatStr which repeats the given string string exactly n times.
 *
 * repeatStr(6, "I") // "IIIIII"
 * repeatStr(5, "Hello") // "HelloHelloHelloHelloHello"
 */
class RepeatString {

    /**
     * Repeats string value several times
     * @param repeat number of times to repeat
     * @param string to repeat
     * @return repeated string
     */
    static String repeatStr(int repeat, String string) {
        String res = "";

        for (int i = 0; i < repeat; i++) {
            res += string;
        }
        return res;
    }

    /**
     * Repeats string value several times, builder solution
     * @param repeat number of times to repeat
     * @param string to repeat
     * @return repeated string
     */
    static String repeatStrBuilder(int repeat, String string) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < repeat; i++) {
            sb.append(string);
        }

        return sb.toString();
    }

    /**
     * Repeats string value several times, stream solution
     * @param repeat number of times to repeat
     * @param string to repeat
     * @return repeated string
     */
    static String repeatStrStream(int repeat, String string) {
        return java.util.stream.IntStream.range(0, repeat).mapToObj(i -> string)
                .collect(java.util.stream.Collectors.joining());
    }
}