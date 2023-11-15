package de.javagrundlagen.Kapitel06.Aufgaben.Aufgabe04.Book;

public class Sparbuch {

    private int kontonummer;
    private double kapital;
    private double zinssatz;

    public Sparbuch(int kontonummer, double kapital, double zinssatz) {
        this.kontonummer = kontonummer;
        this.kapital = kapital;
        this.zinssatz = zinssatz;
    }

    public void zahleEin(double betrag) {
        this.kapital += betrag;
    }

    public void hebeAb(double betrag) {
        this.kapital -= betrag;
    }

    public double getErtrag(int laufzeit) {
        double p = 1.0 + this.zinssatz / 100.0;
        double q = 1.0;

        for(int i = 0; i < laufzeit; ++i) {
            q *= p;
        }

        return this.kapital * q;
    }

    public void verzinse() {
        this.kapital *= 1.0 + this.zinssatz / 100.0;
    }

    public int getKontonummer() {
        return this.kontonummer;
    }

    public double getKapital() {
        return this.kapital;
    }

    public double getZinssatz() {
        return this.zinssatz;
    }
}
