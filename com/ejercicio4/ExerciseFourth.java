package com.ejercicio4;

import java.util.Scanner;

public class ExerciseFourth {

    public void finalPrice() {
        Scanner entry = new Scanner(System.in);
        final double IVA = 0.21;
        System.out.print("Ingresa el precio del producto: ");
        double price = entry.nextDouble();

        price = price + (price * IVA);
        System.out.println("El precio final con IVA del producto es: " + price);
    }

}
