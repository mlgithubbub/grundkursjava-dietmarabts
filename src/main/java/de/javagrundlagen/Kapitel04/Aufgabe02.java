package de.javagrundlagen.Kapitel04;

public class Aufgabe02 {

    /*
    Schreiben Sie ein Programm, das ermittelt, wie hoch ein Guthaben von 5000 Geldeinheiten bei 1,5% Verzinsung nach
    Ablauf eines Jahres ist.
     */

    public static void main(String[] args) {

        double verzinsung = .015;
        double geldEinheiten = 5000;

        double endGuthaben = geldEinheiten + (geldEinheiten * verzinsung);

        System.out.println(endGuthaben);
    }
    // BUCHLÖSUNG:
/*    public static void main(String[] args) {
        double kapital = 5000., zinsen = 1.5;

        kapital += kapital * zinsen / 100.;
        System.out.println("Guthaben nach einem Jahr: " + kapital);
    }*/
}
