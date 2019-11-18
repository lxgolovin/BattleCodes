package com.battlecodes.kata.kyu8;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Character recognition software is widely used to digitise printed texts. Thus the texts can be edited, searched and stored on a computer.
 *
 * When documents (especially pretty old ones written with a typewriter), are digitised character recognition softwares often make mistakes.
 *
 * Your task is correct the errors in the digitised text. You only have to handle the following mistakes:
 *
 * S is misinterpreted as 5
 * O is misinterpreted as 0
 * I is misinterpreted as 1
 * The test cases contain numbers only by mistake.
 */
final class CorrectMisprintDigits {

    private CorrectMisprintDigits() {
    }

    static String correctClassic(String string) {
        return string
                .replace("5", "S")
                .replace("0", "O")
                .replace("1", "I");
    }

    static String correctStream(String string) {
        return Arrays.stream(string.split(""))
                .map(x -> x.equals("5") ? "S" : x.equals("1") ? "I" : x.equals("0") ? "O" : x)
                .collect(Collectors.joining());
    }
}
