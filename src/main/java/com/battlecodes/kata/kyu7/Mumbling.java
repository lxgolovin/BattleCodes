package com.battlecodes.kata.kyu7;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * This time no story, no theory. The examples below show you how to write function accum:
 *
 * Examples:
 *
 * accum("abcd") -> "A-Bb-Ccc-Dddd"
 * accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
 * accum("cwAt") -> "C-Ww-Aaa-Tttt"
 * The parameter of accum is a string which includes only letters from a..z and A..Z.
 */
public final class Mumbling {

    private Mumbling() {
    }

    private static String repeat(int count, String with) {
        StringBuilder sb = new StringBuilder(with.toUpperCase());
        for(int j=0; j<count; j++) {
            sb.append(with.toLowerCase());
        }
        return sb.toString();
    }

    static String accum(final String str) {
        String[] result = str.split("");

        for (int i = 0; i < result.length; i++) {
            result[i] = repeat(i, result[i]);
        }

        return String.join("-", result);
    }

    static String accumStream(String s) {
        return IntStream.range(0, s.length())
                .mapToObj(i -> IntStream.range(0, i + 1)
                        .mapToObj(i1 -> i1 == 0 ? String.valueOf(s.charAt(i)).toUpperCase() : String.valueOf(s.charAt(i)).toLowerCase())
                        .collect(Collectors.joining())
                ).collect(Collectors.joining("-"));
    }
}
