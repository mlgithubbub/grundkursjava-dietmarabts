package de.javagrundlagen.Kapitel06.Aufgaben.Aufgabe05.Book;

public class Abschreibung {
    private double preis;
    private int jahre;
    private double satz;

    public Abschreibung(double preis, int jahre) {
        this.preis = preis;
        this.jahre = jahre;
    }

    public Abschreibung(double preis, int jahre, double satz) {
        this.preis = preis;
        this.jahre = jahre;
        this.satz = satz;
    }

    public void schreibeLinear() {
        double x = this.preis / (double)this.jahre;
        System.out.println("Lineare Abschreibung:");

        for(int i = 1; i <= this.jahre; ++i) {
            this.preis -= x;
            System.out.println("" + i + "\t" + this.preis);
        }

    }

    public void schreibeDegressiv() {
        System.out.println("Geometrisch degressive Abschreibung:");

        for(int i = 1; i <= this.jahre; ++i) {
            this.preis *= 1.0 - this.satz / 100.0;
            System.out.println("" + i + "\t" + this.preis);
        }

    }
}
