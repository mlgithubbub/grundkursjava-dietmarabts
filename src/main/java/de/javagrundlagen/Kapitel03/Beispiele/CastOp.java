package de.javagrundlagen.Kapitel03.Beispiele;

public class CastOp {

    public static void main(String[] args) {
        int x = 5, y = 3;
        double z = x / y;
        System.out.println(z);

        z = (double) x/y;
        System.out.println(z);

        long a = 9123456789123456789L;
        System.out.println(a);

        double b = a;
        long c = (long)b;
        System.out.println(c);
    }
}
