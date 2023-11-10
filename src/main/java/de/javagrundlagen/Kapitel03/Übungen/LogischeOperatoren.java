package de.javagrundlagen.Kapitel03.Übungen;

import java.util.Scanner;

public class LogischeOperatoren {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter an integer x");
        int x = myScanner.nextInt();
        System.out.println("Enter another integer y");
        int y = myScanner.nextInt();
        System.out.println("Enter another integer a");
        int a = myScanner.nextInt();
        System.out.println("Enter another integer b");
        int b = myScanner.nextInt();

        boolean and = x < y & a > b;
        boolean or = x < y | a > b;
        boolean xor = x < y ^ a > b;
        boolean shortCircuitAnd = x < y && a > b;
        boolean shortCircuitOr = x < y || a > b;

        System.out.println(x + " < " + y + ": " + (x < y) + " & " + a + " > " + b + ": " + (a > b) + " ==> " + and);
        System.out.println(x + " < " + y + ": " + (x < y) + " | " + a + " > " + b + ": " + (a > b) + " ==> " + or);
        System.out.println(x + " < " + y + ": " + (x < y) + " ^ " + a + " > " + b + ": " + (a > b) + " ==> " + xor);
        System.out.println(x + " < " + y + ": " + (x < y) + " && " + a + " > " + b + ": " + (a > b) + " ==> " + shortCircuitAnd);
        System.out.println(x + " < " + y + ": " + (x < y) + " || " + a + " > " + b + ": " + (a > b) + " ==> " + shortCircuitOr);

    }
}
