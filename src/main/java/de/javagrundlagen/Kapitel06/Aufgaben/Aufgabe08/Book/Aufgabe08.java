package de.javagrundlagen.Kapitel06.Aufgaben.Aufgabe08.Book;

public class Aufgabe08 {

    public Aufgabe08() {
    }

    public static void main(String[] args) {
        Artikel artikel1 = new Artikel(4711, 1.99);
        Artikel artikel2 = new Artikel(5000, 10.0);
        Auftrag auftrag1 = new Auftrag(artikel1, 100);
        Auftrag auftrag2 = new Auftrag(artikel2, 50);
        double gesamtwert = Auftrag.getGesamtwert(new Auftrag[]{auftrag1, auftrag2});
        System.out.println(gesamtwert);
    }
}
