package de.javagrundlagen.Kapitel02Aufgaben;

public class Aufgabe02 {

    /*

    FRAGE
    Warum führt der folgende Code bei der Übersetzung zu einem Fehler?

    int x = 0;
    long y = 1000;
    x = y;


    ANTWORT
    Weil ein Long muss erstmal in einem Integer gecastet.
     */

    public static void main(String[] args) {

       //Größerer Datentypen müssen gecastet:
        /*
        int x = 0;
        long y = 1000;
        x = y;

        int a = 0;
        float b = 1000;
        a = b;

        int c = 0;
        double d = 1000;
        c = d;
        */
        //This is called "narrowing casting" and must be done manually.

        //Manual narrowing casting:
        int x = 0;
        long y = 1000;
        x = (int) y;

        int a = 0;
        float b = 1000;
        a = (int) b;

        int c = 0;
        double d = 1000;
        c = (int) d;

       //Kleinere Datentypen müssen nicht gecastet:
        int e = 0;
        short f = 1000;
        e = f;

        int g = 0;
        byte h = 100;
        g = h;

        int i = 0;
        char j = 5;
        i = j;
        //This is called "widening casting" and is done automatically.
    }

}
