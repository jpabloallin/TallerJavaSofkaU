package com.ejercicio8;

import java.util.Scanner;

public class LaboralDay {

    public void weekDay() {
        Scanner entry = new Scanner(System.in);
        int option;
        System.out.println("\nElije el día para saber si trabajas o descansas: \n"
        + "1. Lunes\n" + "2. Martes\n" + "3. Miércoles\n" + "4. Jueves\n" + "5. Viernes \n" + "6. Sábado\n" + "7. Domingo\n" );
        option = entry.nextInt();

        switch (option) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("¡Tienes que trabajar!");
                weekDay();
                break;
            case 6:
            case 7:
                System.out.println("¡Día de descanso!");
                weekDay();
                break;
        }
    }

}
