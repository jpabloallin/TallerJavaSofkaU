package com.ejercicio15;

import java.util.InputMismatchException;
import java.util.Scanner;
public class FifteenthExercise {
    Scanner entry = new Scanner(System.in);
    public int Menu() {
        int option;
        System.out.print("****** GESTION CINEMATOGRÁFICA ********\n" +
                "1- Nuevo actor \n" +
                "2- Buscar actor\n" +
                "3- Eliminar actor\n" +
                "4- Modificar actor\n" +
                "5- Ver todos los actores\n" +
                "6- Ver peliculas de los actores\n" +
                "7- Ver categoria de las peliculas de los actores\n" +
                "8- Salir\n");
        option = entry.nextInt();
        return option;
    }
    public void chooseOption() {
        try {
            int option = Menu();
            switch (option) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    chooseOption();
                case 8:
                    break;
                default:
                    System.out.print("\nOpción incorrecta!\n");
                    chooseOption();
            }
        } catch (InputMismatchException e) {
            System.out.println("\nDebes ingresar un número entero! Corre de nuevo el programa\n");
            entry.nextLine();
        }
    }
}
