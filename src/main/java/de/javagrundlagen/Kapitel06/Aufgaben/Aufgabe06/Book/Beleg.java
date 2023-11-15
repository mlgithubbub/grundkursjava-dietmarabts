package de.javagrundlagen.Kapitel06.Aufgaben.Aufgabe06.Book;

public class Beleg {
    private static int next = 10000;
    private int belegNummer;

    public Beleg() {
        this.belegNummer = next++;
    }

    public int getBelegNummer() {
        return this.belegNummer;
    }
}
