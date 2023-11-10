package de.javagrundlagen.Kapitel03.Übungen;

public class ArithmetischeOperatoren {

    public static void main(String[] args) {

        int x = 10;
        int y = 2;

        int sum = x + y;
        int difference = x - y;
        int product = x * y;
        int quotient = x / y;
        int rest = x % y;
        int negative = -x;
        int positive = +x;

        System.out.println(x + " + " + y + " = " + sum);
        System.out.println(x + " - " + y + " = " + difference);
        System.out.println(x + " * " + y + " = " + product);
        System.out.println(x + " / " + y + " = " + quotient);
        System.out.println(x + " % " + y + " = " + rest);
        System.out.println(" - " + x + " = " + negative);
        System.out.println(" + " + x + " = " + positive);



        System.out.println("x++ = " + x++);
        System.out.println("x = " + x);
        System.out.println("x-- = " + x--);
        System.out.println("x = " + x);
        System.out.println("++x = " + ++x);
        System.out.println("x = " + x);
        System.out.println("--x = " + --x);
        System.out.println("x = " + x);
    }


}
