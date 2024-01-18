package de.javagrundlagen.Kapitel06.Aufgaben.Aufgabe10.Me;

//Implementieren Sie mit Hilfe eines Arrays einen Ringpuffer, in den ganzen Zahlen geschrieben werden können. Der
// Ringpuffer hat eine feste Länge. Ist der Puffer voll, so soll der jeweils älteste Eintrag überschrieben werden.
// Ein Index gibt die Position im Array an, an der die nächste Schreiboperation stattfindet. Nach jedem Schreiben
// wird der Index um 1 erhöht und auf 0 gesetzt, wenn die obere Grenze des Arrays überschritten wurde. Es soll auch
// eine Methode geben, die den gesamten Inhalt des Puffers ausgibt.
public class Aufgabe10 {

    public static void main(String[] args) {
        Ringpuffer myrp1 = new Ringpuffer(5);
        myrp1.addToRingpuffer(1);
        myrp1.addToRingpuffer(2);
        myrp1.addToRingpuffer(3);
        myrp1.addToRingpuffer(4);
        myrp1.addToRingpuffer(5);
        myrp1.addToRingpuffer(6);
        myrp1.addToRingpuffer(7);
        myrp1.addToRingpuffer(8);
        myrp1.printRingPuffer();
    }
}
