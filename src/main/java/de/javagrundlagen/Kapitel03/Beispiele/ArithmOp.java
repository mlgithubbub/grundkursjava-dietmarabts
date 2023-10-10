package de.javagrundlagen.Kapitel03.Beispiele;

public class ArithmOp {
    public static void main(String[] args) {
        System.out.println(13/5);
        System.out.println(13%5);
        System.out.println();

        System.out.println(12./2.5);
        System.out.println(12.%2.5);
        System.out.println();

        int a = 1;
        System.out.println(++a + "\t" + a);
        System.out.println(a++ + "\t" + a);
        System.out.println();

        int b = 2;
        System.out.println(--b + "\t" + b);
        System.out.println(b-- + "\t" + b);
        System.out.println();

        double x = .7 + .1;
        double y = .9 - .1;
        System.out.println(y - x);
    }
}
