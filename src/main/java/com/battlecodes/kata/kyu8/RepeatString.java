package com.battlecodes.kata.kyu8;

/**
 * Write a function called repeatStr which repeats the given string string exactly n times.
 *
 * repeatStr(6, "I") // "IIIIII"
 * repeatStr(5, "Hello") // "HelloHelloHelloHelloHello"
 */
final class RepeatString {

    private RepeatString() {
    }

    static String repeatStr(int repeat, String string) {
        String res = "";

        for (int i = 0; i < repeat; i++) {
            res += string;
        }
        return res;
    }

    static String repeatStrBuilder(int repeat, String string) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < repeat; i++) {
            sb.append(string);
        }

        return sb.toString();
    }

    static String repeatStrStream(int repeat, String string) {
        return java.util.stream.IntStream.range(0, repeat).mapToObj(i -> string)
                .collect(java.util.stream.Collectors.joining());
    }
}