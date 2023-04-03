package de.javagrundlagen.Kapitel02.Aufgaben;

/*Schreiben Sie ein Programm, das ermittelt, wie hoch ein Sparguthaben von 5.000 Geldeinheiten
bei 7,5% Verzinsung nach Ablauf eines Jahres ist.*/
public class Aufgabe05 {

    public static void main(String[] args) {
        double sparguthaben;
        double euros = 5000;
        double interestRate = .075;

        sparguthaben = euros * interestRate;
        System.out.println(sparguthaben);
    }
}
