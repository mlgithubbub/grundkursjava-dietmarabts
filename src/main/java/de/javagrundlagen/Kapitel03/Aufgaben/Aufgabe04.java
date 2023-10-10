package de.javagrundlagen.Kapitel03.Aufgaben;

public class Aufgabe04 {

    /*
    Schreiben Sie ein Programm, das die Anzahl von Sekunden im Monat Januar berechnet.
     */

    public static void main(String[] args) {

        int daysInJanuary = 31;

        int secondsInJanuary = daysInJanuary * 24 * 60 * 60;

        System.out.println("There are " + secondsInJanuary + " seconds in January.");
    }
}
