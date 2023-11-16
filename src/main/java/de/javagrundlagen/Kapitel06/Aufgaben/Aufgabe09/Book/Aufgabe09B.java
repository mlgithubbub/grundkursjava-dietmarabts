package de.javagrundlagen.Kapitel06.Aufgaben.Aufgabe09.Book;

public class Aufgabe09B {

    public Aufgabe09B() {
    }

    public static void main(String[] args) {
        System.out.println(zinsen(1000.0, 0.015, 1));
    }

    public static double zinsen(double kapital, double zinssatz, int jahre) {
        return jahre == 0 ? kapital : zinsen(kapital, zinssatz, jahre - 1) * (1.0 + zinssatz);
    }
}
