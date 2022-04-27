package com.ejercicio11;
import java.util.Scanner;
public class EleventhExercise {
    public void vowelCount() {
        Scanner entry = new Scanner(System.in);
        System.out.print("Ingresa tu frase: ");
        String phrase = entry.nextLine();
        System.out.println("Longitud de la frase: " + phrase.length());
        int totalVowels = phrase.replaceAll("[^AEIOUaeiouÁÉÍÓÚáéíóú]","").length();
        System.out.println("Número de vocales: " + totalVowels);
    }
}
