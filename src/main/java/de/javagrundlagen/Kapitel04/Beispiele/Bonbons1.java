package de.javagrundlagen.Kapitel04.Beispiele;

public class Bonbons1 {

    public static void main(String[] args) {
        double budget = 1.;
        int anzahl = 0;

        for(double preis = 0.1; budget >= preis; preis += 0.1){
            budget -= preis;
            anzahl++;
        }
        System.out.println(anzahl + " Bonbons gekauft.");
        System.out.println("Restgeld: " + budget);
    }

}
