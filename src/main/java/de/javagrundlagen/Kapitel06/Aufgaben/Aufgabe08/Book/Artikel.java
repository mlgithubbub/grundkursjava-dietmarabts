package de.javagrundlagen.Kapitel06.Aufgaben.Aufgabe08.Book;

public class Artikel {

    private int id;
    private double preis;

    public Artikel(int id, double preis) {
        this.id = id;
        this.preis = preis;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPreis() {
        return this.preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }
}
