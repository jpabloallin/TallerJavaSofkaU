package com.ejercicio1;

public class Exercise {
    public void biggerNumber() {

        int x = 10;
        int y = 25;

        if (x > y) {
            System.out.println("El número x: " + x + " es mayor al número y: " + y);
        }
        else if (x < y) {
            System.out.println("El número y: " + y + " es mayor al número x: " + x);
        }
        else {
            System.out.println("El número y: " + y + " es igual al número x: " + x);
        }
    }
}
