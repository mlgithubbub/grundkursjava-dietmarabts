package de.javagrundlagen.Kapitel02.Aufgaben;

/*Schreiben Sie ein Programm, das den Buchwert in Höhe von 15000 Geldeinheiten
mit einem Abschreibungssatz von 40% und einem Restwert von 100 Geldeinheiten
geometrisch degressiv abschreibt.
* */

public class Aufgabe09 {

    public static void main(String[] args) {

        double restwert = 15000;

        while (restwert >= 100) {
            System.out.println(restwert);
            double abschreibung = restwert * .40;
            restwert -= abschreibung;
        }

    }

}


