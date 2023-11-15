package de.javagrundlagen.Kapitel06.Aufgaben.Aufgabe06.Book;

public class Aufgabe06 {
    public Aufgabe06() {
    }

    public static void main(String[] args) {
        Beleg b1 = new Beleg();
        Beleg b2 = new Beleg();
        Beleg b3 = new Beleg();
        System.out.println(b1.getBelegNummer());
        System.out.println(b2.getBelegNummer());
        System.out.println(b3.getBelegNummer());
    }
}
