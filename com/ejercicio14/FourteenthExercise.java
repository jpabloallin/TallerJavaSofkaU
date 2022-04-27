package com.ejercicio14;

import java.util.Scanner;
public class FourteenthExercise {
    public void displayNumbers() {
        Scanner entry = new Scanner(System.in);
        int number;
        System.out.print("Ingresa el número: ");
        number = entry.nextInt();
        for (int i = number; i <=1000 ; i+=2) {
            System.out.println(i);
        }
    }
}
