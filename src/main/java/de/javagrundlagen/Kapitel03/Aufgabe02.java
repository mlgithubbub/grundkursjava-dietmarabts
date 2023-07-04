package de.javagrundlagen.Kapitel03;

public class Aufgabe02 {

    /* Zu vorgegebenen Zahlen x und y soll festgestellt werden, ob x durch y teilbar ist.
    Schreiben Sie hierzu ein Programm.
     */

    public static void main(String[] args) {

        int x = 12;
        int y = 2;

        boolean isDivisable = x % y == 0 ? true : false;

        System.out.println("Is " + x + " divisable by " + y + "? " + isDivisable);
    }


}
