package de.javagrundlagen.Kapitel04.Beispiele;

public class Bonbons2 {

    public static void main(String[] args) {
        int budget = 100;
        int anzahl = 0;

        for (int preis = 10; budget >= preis; preis += 10){
            budget -= preis;
            anzahl++;
        }
        System.out.println(anzahl + " Bonbons gekauft.");
        System.out.println("Restgeld: " + budget);
    }
}
