package ru.codewars.kata.kyu8;

public class RepeatString {
    public RepeatString() {
        System.out.println("Start with " + this.getClass());
        System.out.println(repeatStr(6, "I"));
        System.out.println(repeatStrSuper(6, "I"));
        System.out.println(repeatStrClever(6, "I"));
        System.out.println("FINISHED with " + this.getClass());
    }


    public static String repeatStr(final int repeat, final String string) {
        String res = "";

        for (int i = 0; i < repeat; i++) {
            res += string;
        }
        return res;
    }

    public static String repeatStrSuper(final int repeat, final String string) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < repeat; i++) {
            sb.append(string);
        }

        return sb.toString();
    }

    public static String repeatStrClever(final int repeat, final String string) {
        return java.util.stream.IntStream.range(0, repeat).mapToObj(i -> string)
                .collect(java.util.stream.Collectors.joining()).toString();
    }
}
