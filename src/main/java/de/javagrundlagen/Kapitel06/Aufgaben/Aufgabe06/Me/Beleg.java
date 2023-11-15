package de.javagrundlagen.Kapitel06.Aufgaben.Aufgabe06.Me;

public class Beleg {

    //My program didn't work before because "static" was missing
    private static int belegNummer = 9999;


    Beleg(){
        this.belegNummer++;
    }

    public int getBelegNummer() {
        return this.belegNummer;
    }
}
