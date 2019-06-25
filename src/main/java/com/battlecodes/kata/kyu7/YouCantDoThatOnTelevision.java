package com.battlecodes.kata.kyu7;

/**
 * There are just some things you can't do on television. In this case, you've just come back from having a "delicious" Barth burger and you're set to give an interview. The Barth burger has made you queezy, and you've forgotten some of the import rules of the "You Can't Do That on Television" set.
 *
 * If you say any of the following words a large bucket of "water" will be dumped on you: "water", "wet", "wash" This is true for any form of those words, like "washing", "watered", etc.
 *
 * If you say any of the following phrases you will be doused in "slime": "I don't know", "slime"
 *
 * If you say both in one sentence, a combination of water and slime, "sludge", will be dumped on you.
 *
 * Write a function, bucketOf(str), that takes a string and determines what will be dumped on your head. If you haven't said anything you shouldn't have, the bucket should be filled with "air". The words should be tested regardless of case.
 *
 * Examples:
 *
 * bucketOf("What is that, WATER?!?") -> "water"
 * bucketOf("I don't know if I'm doing this right.") -> "slime"
 * bucketOf("You won't get me!") -> "air"
 */
class YouCantDoThatOnTelevision {

    /**
     * Some static const
     */
    private static final String SLIME = "slime";
    private static final String WATER = "water";
    private static final String AIR = "air";
    private static final String SLUDGE = "sludge";

    /**
     * My version of the slime
     * @param said what is said
     * @return work according to task
     */
    static String bucketOf(String said) {
        String slime = ".*((slime)|(i\\sdon't\\sknow)).*";
        String water = ".*\\b((water)|(wash)|(wet)).*";
        String strToLower = said.toLowerCase();

        if (strToLower.matches(slime) && strToLower.matches(water)) {
            return SLUDGE;
        } else if ((said.toLowerCase().matches(slime))) {
            return SLIME;
        } else if (said.toLowerCase().matches(water)) {
            return WATER;
        } else {
            return AIR;
        }
    }

    /**
     * Clever version of the slime
     * @param said what is said
     * @return work according to task
     */
    static String bucketOfShort(String said) {
        boolean water = said.toLowerCase().matches(".*(water|wet|wash)+.*");
        boolean slime = said.toLowerCase().matches(".*(i don't know|slime)+.*");
        return water && slime ? SLUDGE : water ? WATER : slime ? SLIME : AIR;
    }

    /**
     * Classic version of the slime
     * @param said what is said
     * @return work according to task
     */
    static String bucketOfClassic(String said) {
        String text = said.toLowerCase();
        boolean water = text.contains("wet") || text.contains("water") || text.contains("wash");
        boolean slime = text.contains("slime") || text.contains("i don't know");
        if (water && slime) return SLUDGE;
        if (water) return WATER;
        if (slime) return SLIME;
        return AIR;
    }
}
