package de.javagrundlagen.Kapitel06.Aufgaben.Aufgabe10.Book;

public class Aufgabe10 {

    public Aufgabe10() {
    }

    public static void main(String[] args) {
        Ringpuffer puffer = new Ringpuffer(5);

        for(int i = 1; i <= 11; ++i) {
            puffer.schreibe(100 + i);
        }

        puffer.lies();
    }
}
