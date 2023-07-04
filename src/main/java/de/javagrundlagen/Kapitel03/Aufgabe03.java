package de.javagrundlagen.Kapitel03;

public class Aufgabe03 {

    /* Jetzt ist es x Uhr (volle Stundenzahl). Wie viel Uhr ist es in n Stunden? Schreiben Sie hierzu ein Programm.
     */

    public static void main(String[] args) {

        int currentTime = 10;
        int passedHours = 3;
        int weirdTime = currentTime + passedHours;
        int futureTime = weirdTime > 24 ? weirdTime - 24 : weirdTime;

        System.out.println("It is now: " + currentTime + ". In " + passedHours + " hours, it will be: " + futureTime);
    }
}
