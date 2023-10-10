package de.javagrundlagen.Kapitel03.Beispiele;

public class LogOp {

    public static void main(String[] args) {
        int a = 2, b = 3;

        System.out.println(a == 2 && b < 8);
        System.out.println(a != 2 || !(b < 2));
        System.out.println(a == 2 ^ b > 0);

        System.out.println(a == 0 && b++ == 3);
        System.out.println(b);

        System.out.println(a == 0 & b++ == 3);
        System.out.println(b);

        System.out.println(a == 2 || b++ == 3);
        System.out.println(b);

        System.out.println(a == 2 | b++ == 3);
        System.out.println(b);
    }
}
