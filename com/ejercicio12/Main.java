package com.ejercicio12;

public class Main {
    public static void main(String[] args) {
        String string1 = "mayoazuls";
        String string2 = "juanmayo";
        char panel[] = new char[string2.length()];
        for (int i = 0; i < string2.length(); i++) {
            panel[i] = '-';
        }

        for (int i = 0; i < string2.length(); i++) {
            for (int j = 0; j < string1.length(); j++) {
                if (string1.toLowerCase().charAt(j) == string2.toLowerCase().charAt(i)) {
                    panel[i] = string2.charAt(i);
                }
            }
        }
        for (int i = 0; i < panel.length; i++) {
            System.out.print(panel[i]);
        }
    }
}
