package de.javagrundlagen.Kapitel06.Aufgaben.Aufgabe04.Book;

public class Aufgabe04 {
    public Aufgabe04() {
    }

    public static void main(String[] args) {
        Sparbuch sb = new Sparbuch(4711, 1000.0, 1.5);
        sb.zahleEin(60000.0);
        System.out.println("Kapital: " + sb.getKapital());
        System.out.println("Ertrag nach 6 Jahr: " + sb.getErtrag(6));
        sb.verzinse();
        System.out.println("Kapital: " + sb.getKapital());
    }
}
