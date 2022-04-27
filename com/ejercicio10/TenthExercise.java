package com.ejercicio10;

import java.util.Scanner;

public class TenthExercise {

    public void phraseWithoutSpaces() {
        Scanner entry = new Scanner(System.in);
        System.out.print("Ingresa tu frase: ");
        String oldPhrase = entry.nextLine();
        System.out.println(oldPhrase.replaceAll("\\s+",""));
    }
}
