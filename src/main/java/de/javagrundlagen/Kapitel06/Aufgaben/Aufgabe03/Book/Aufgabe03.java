package de.javagrundlagen.Kapitel06.Aufgaben.Aufgabe03.Book;


public class Aufgabe03 {

    private int x = 1;

    public Aufgabe03() {
    }

    public void test() {
        int x = 0;
        System.out.println(x);
        System.out.println(this.x);
        x = 2;
        int y = 3;
        System.out.println(x + y);
        System.out.println(x);
    }

    public static void main(String[] args) {
        Aufgabe03 a = new Aufgabe03();
        a.test();
    }
}


