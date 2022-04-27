package com.ejercicio6;

public class SixthExercise {

    public void evenOddNumber() {
        for (int i = 1; i < 101; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " Es número par");
            }
            if (i % 2 == 1) {
                System.out.println(i + " Es número impar");
            }
        }
    }
}
