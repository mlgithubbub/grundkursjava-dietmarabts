package de.javagrundlagen.Kapitel03.Übungen;

import java.util.Scanner;

public class RelationaleOperatoren {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter an integer");
        int x = myScanner.nextInt();
        System.out.println("Enter another integer");
        int y = myScanner.nextInt();

        boolean lessThan = x < y;
        boolean lessThanOrEqualTo = x <= y;
        boolean greaterThan = x > y;
        boolean greaterThanOrEqualTo = x >= y;
        boolean equals = x == y;
        boolean notEqualTo = x != y;

        System.out.println("Is " + x + " < " + y + " ? " + lessThan);
        System.out.println("Is " + x + " <= " + y + " ? " + lessThanOrEqualTo);
        System.out.println("Is " + x + " > " + y + " ? " + greaterThan);
        System.out.println("Is " + x + " >= " + y + " ? " + greaterThanOrEqualTo);
        System.out.println("Is " + x + " = " + y + " ? " + equals);
        System.out.println("Is " + x + " != " + y + " ? " + notEqualTo);

    }
}
