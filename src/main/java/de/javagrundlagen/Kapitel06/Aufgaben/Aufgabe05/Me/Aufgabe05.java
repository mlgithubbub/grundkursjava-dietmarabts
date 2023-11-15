package de.javagrundlagen.Kapitel06.Aufgaben.Aufgabe05.Me;

public class Aufgabe05 {

    public static void main(String[] args) {
        Abschreibung myLinearAbschreibung = new Abschreibung(1000,5);
        myLinearAbschreibung.abschreibenLinear();
        Abschreibung myGeoDegAbschreibung = new Abschreibung(15000,5,.4);
        myGeoDegAbschreibung.abschreibenGeometrischDegressive();
    }
}
