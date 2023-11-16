package de.javagrundlagen.Kapitel06.Aufgaben.Aufgabe09.Book;

public class Aufgabe09A {

    public Aufgabe09A() {
    }

    public static void main(String[] args) {
        System.out.println(zinsen(1000.0, 0.015, 2));
    }

    public static double zinsen(double kapital, double zinssatz, int jahre) {
        for(int i = 0; i < jahre; ++i) {
            kapital *= 1.0 + zinssatz;
        }

        return kapital;
    }
}
