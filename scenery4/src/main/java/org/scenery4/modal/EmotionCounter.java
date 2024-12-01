package org.scenery4.modal;

public class EmotionCounter {
    public static String countEmotions(String name) {
        int funnyCount = 0;
        int upsetCount = 0;

        if (name.contains(":-)")) {
            funnyCount++;
        }

        if (name.contains(":-(")) {
            upsetCount++;
        }

        if (funnyCount > upsetCount) {
            return "divertido";
        } else if (funnyCount < upsetCount) {
            return "chateado";
        } else {
            return "neutro";
        }
    }
}
