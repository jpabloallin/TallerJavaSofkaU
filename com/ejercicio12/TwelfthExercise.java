package com.ejercicio12;

import java.util.Scanner;

public class TwelfthExercise {

    public void Coincidence() {
        Scanner entry = new Scanner(System.in);
        System.out.print("Ingresa la primera palabra: ");
        String firstWord = entry.nextLine();
        System.out.print("Ingresa la segunda palabra: ");
        String secondWord = entry.nextLine();
        char panel[] = new char[secondWord.length()];
        for (int i = 0; i < secondWord.length(); i++) {
            panel[i] = '-';
        }

        for (int i = 0; i < secondWord.length(); i++) {
            for (int j = 0; j < firstWord.length(); j++) {
                if (firstWord.toLowerCase().charAt(j) == secondWord.toLowerCase().charAt(i)) {
                    panel[i] = secondWord.charAt(i);
                }
            }
        }
        for (int i = 0; i < panel.length; i++) {
            System.out.print(panel[i]);
        }
    }
}
