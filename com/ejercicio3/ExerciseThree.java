package com.ejercicio3;

import java.util.Scanner;

public class ExerciseThree {
    public void circleArea() {
        Scanner entry = new Scanner(System.in);
        final double PI = 3.14;
        System.out.print("Ingresa el radio: ");
        double radio = entry.nextDouble();
        System.out.println("El area del circulo es: " + PI * Math.pow(radio,2));
    }
}
