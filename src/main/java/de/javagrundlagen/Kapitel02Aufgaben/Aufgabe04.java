package de.javagrundlagen.Kapitel02Aufgaben;

public class Aufgabe04 {
    /*Speichern Sie die hexidezimale Zahl AA00 und die binäre Zahl 10101010 in zwei int-Variablen
    und geben Sie die Werte aus.
     */

    public static void main(String[] args) {
        int hexZahl = 0xAA00;
        int hexZahl2 = 0XAA00;
        int binZahl = 0b10101010;
        int binZahl2 = 0B10101010;

        System.out.println(hexZahl);
        System.out.println(hexZahl2);
        System.out.println(binZahl);
        System.out.println(binZahl2);
    }
}
