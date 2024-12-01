package org.scenery4;

import java.util.Scanner;

import static org.scenery4.modal.EmotionCounter.countEmotions;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrada: ");
        String name = scanner.nextLine();

        System.out.println("Saída: " + countEmotions(name));
    }
}