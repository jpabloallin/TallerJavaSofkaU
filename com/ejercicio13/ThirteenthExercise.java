package com.ejercicio13;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ThirteenthExercise {

    public void currentDate() {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.print("La fecha y hora actual es: " + dtf.format(LocalDateTime.now()));

    }

}
