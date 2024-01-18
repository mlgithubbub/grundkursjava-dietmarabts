package de.javagrundlagen.Kapitel06.Aufgaben.Aufgabe12.Book;

import de.javagrundlagen.Kapitel06.Aufgaben.Aufgabe11.Book.Aufgabe11;

public class Datum {

    private int tag;
    private int monat;
    private int jahr;

    public Datum(int tag, int monat, int jahr) {
        this.tag = tag;
        this.monat = monat;
        this.jahr = jahr;
    }

    public String display() {
        int t = Aufgabe11.tage(this.jahr, this.monat);
        return t != 0 && this.tag >= 1 && this.tag <= t ? this.tag + "." + this.monat + "." + this.jahr : "Ungültiges Datum";
    }
}
