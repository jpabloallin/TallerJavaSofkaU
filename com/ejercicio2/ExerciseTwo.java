package com.ejercicio2;

import java.util.Scanner;

public class ExerciseTwo {
    Scanner entry = new Scanner(System.in);
    public void biggerNumber() {

        System.out.println("Ingresa el primer número: ");
        int x = entry.nextInt();
        System.out.println("Ingresa el segundo número: ");
        int y = entry.nextInt();

        if (x > y) {
            System.out.println("El primer número: " + x + " es mayor al segundo: " + y);
        }
        else if (x < y) {
            System.out.println("El segundo número: " + y + " es mayor al primero: " + x);
        }
        else {
            System.out.println("Los dos números son iguales" + x);
        }
    }
}
