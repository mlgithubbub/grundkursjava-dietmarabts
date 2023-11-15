package de.javagrundlagen.Kapitel06.Aufgaben.Aufgabe07.Book;

public class Aufgabe07 {
    public Aufgabe07() {
    }

    public static void main(String[] args) {
        Stapel stapel = new Stapel();

        int i;
        for(i = 0; i < 20; ++i) {
            stapel.push(100 + i);
        }

        for(i = 0; i < 20; ++i) {
            System.out.println(stapel.pop());
        }

    }
}
