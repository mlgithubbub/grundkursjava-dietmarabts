package de.javagrundlagen.Kapitel06.Aufgaben.Aufgabe08.Me;

//Aufgabe 8: Erstellen Sie die Klassen Artikel und Auftrag. In Artikel sollen Nummer (int id) und Preis (double
// preis) des Artikels gespeichert werden. In Auftrag ist eine Referenz auf den jeweils bestellten Artikel
// aufzunehmen sowie die bestellte Menge (int menge) dieses Artikels.
// Entwickeln Sie für beide Klassen geeignete Konstruktoren und Methoden (get-/set-Methoden). Die Klasse Auftrag soll
// die folgende Klassenmethode enthalten:
// public static double getGesamtwert(Auftrag...auftraege)
//Diese soll die Summe aller einzelnen Auftragswerte (Menge x Artikelpreis) liefern.
public class Aufgabe08 {

    public static void main(String[] args) {
        Artikel orange = new Artikel(11111, 1.99);
        Artikel apple = new Artikel(22222, 1.50);
        Artikel banana = new Artikel(33333, .99);

        Auftrag oranges = new Auftrag(orange, 3);
        Auftrag apples = new Auftrag(apple, 1);
        Auftrag bananas = new Auftrag(banana, 5);

        double total = Auftrag.getGesamtwert(oranges,apples,bananas);
        System.out.println(total);
    }
}
