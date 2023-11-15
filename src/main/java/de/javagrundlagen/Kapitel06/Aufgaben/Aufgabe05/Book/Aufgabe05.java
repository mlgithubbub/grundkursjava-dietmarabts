package de.javagrundlagen.Kapitel06.Aufgaben.Aufgabe05.Book;

public class Aufgabe05 {

    public Aufgabe05() {
    }

    public static void main(String[] args) {
        Abschreibung ab = new Abschreibung(15000.0, 5);
        ab.schreibeLinear();
        System.out.println();
        ab = new Abschreibung(15000.0, 5, 40.0);
        ab.schreibeDegressiv();
    }
}
