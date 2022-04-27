package com.ejercicio5;

public class FifthExercise {
    public void evenOddNumber() {
        boolean condition = true;
        int x = 1;
        while (condition) {
            if (x % 2 == 0) {
                System.out.println(x + " Es número par");
            }
            if (x % 2 != 0) {
                System.out.println(x + " Es número impar");
            }
            x += 1;
            if (x == 101) {
                condition = false;
            }
        }
    }


}
