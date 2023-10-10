package de.javagrundlagen.Kapitel04.Aufgaben;

public class Aufgabe03 {

    /*
    Schreiben Sie ein Programm, das den Buchwert in Höhe von 15000 Geldeinheiten mit einem
    Abschreibungssetz von 40% und einem Restwert von 100 Geldeinheiten geometrisch degressiv abschreibt.
     */

    public static void main(String[] args) {

        double buchwert = 15000;
        double abschreibungssatz = .40;
        double restwert = 100;

        for (double i = buchwert; i >= restwert; i = i - (i * abschreibungssatz)){
            System.out.println(i);
        }
    }

    //BUCHLÖSUNG
/*    public static void main(String[] args) {
        double buchwert = 15000.;
        double satz = 40.;
        double restwert = 100.;
        int jahr = 1;

        while (buchwert > restwert) {
            buchwert *= 1 - satz / 100;
            System.out.println("Buchwert nach " + jahr + " Jahren: " + buchwert);
            jahr++;
        }
    }*/
}
