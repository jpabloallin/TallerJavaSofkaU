package com.ejercicio7;

import java.util.Scanner;

public class SeventhExercise {

    public void Cycle() {
        Scanner entry = new Scanner(System.in);
        int number;
        do {
            number = entry.nextInt();
        } while (number < 0);
        System.out.println("\nNumber: "+number);
    }

}
