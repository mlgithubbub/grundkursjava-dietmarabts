package de.javagrundlagen.Kapitel02;

public class Aufgabe05 {

    //Codieren Sie die Lösung zu Aufgabe 4 mit Hilfe des Typ-Platzhalters var.

    public static void main(String[] args) {
        //Funktioniert:
        var hexZahl = 0xAA00;
        var hexZahl2 = 0XAA00;
        var binZahl = 0b10101010;
        var binZahl2 = 0B10101010;

        System.out.println(hexZahl);
        System.out.println(hexZahl2);
        System.out.println(binZahl);
        System.out.println(binZahl2);

       /* //Funktioniert nicht:
        var hexZahl3 = AA00;
        var hexZahl4 = AA00;
        var binZahl3 = 10101010;
        var binZahl4 = 10101010;

        System.out.println(hexZahl3);
        System.out.println(hexZahl4);
        System.out.println(binZahl3);
        System.out.println(binZahl4);*/
    }
}
