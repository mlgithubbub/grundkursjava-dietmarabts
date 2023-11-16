package de.javagrundlagen.Kapitel06.Aufgaben.Aufgabe09.Me;

//Aufgabe 9:

// A) Realisieren Sie eine Klassenmethode, die die Verzinsung eines Anfangskapitals nach einer bestimmten
// Anzahl Jahre iterativ berechnet:
// public static double zinsen(double kapital, double zinssatz, int jahre)
public class Aufgabe09A {

    public static void main(String[] args) {
        zinsen(1000, 1.5, 10);
    }

    public static double zinsen(double kapital, double zinssatz, int jahre){
        for (int i = 0; i <= jahre; i++){
            System.out.print("Year " +  i + " capital " + kapital + " interest " + kapital * (zinssatz/100) + ": ");
            kapital += kapital * zinssatz/100;
            System.out.println(kapital);
        }
        return kapital;
    }
}
