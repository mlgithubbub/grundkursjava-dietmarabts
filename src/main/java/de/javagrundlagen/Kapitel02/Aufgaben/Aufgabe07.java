package de.javagrundlagen.Kapitel02.Aufgaben;

public class Aufgabe07 {

    public static void main(String[] args) {

        for (int x = 1; x <= 21; x++){
            int spaces = (21 - x)/2;
            for(int p = 1; p <= spaces; p++){
                System.out.print(" ");
            }
            for (int y = 1; y <= x; y++){
                System.out.print("*");
            }
            System.out.println();
            x = x +1;
        }

    }
}
