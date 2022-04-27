package com.ejercicio9;

import java.util.Scanner;

public class NinethExercise {

    public void replaceString() {
        Scanner entry = new Scanner(System.in);
        System.out.print("Escibe el texto que quiere concatenar: ");
        String text = entry.nextLine();
        String oldPhrase = "La sonrisa sera la mejor arma contra la tristeza ";
        String newPhrase = oldPhrase.replace("a", "e");
        System.out.println(newPhrase + text);
    }
}
