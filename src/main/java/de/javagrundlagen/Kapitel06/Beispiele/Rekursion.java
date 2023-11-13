package de.javagrundlagen.Kapitel06.Beispiele;

public class Rekursion {
    public static long sum(int n) {
        if (n == 1) {
            System.out.println("sum(1) returns 1");
            return 1;
        }

        System.out.println("sum(" + n + ") returns sum(" + (n - 1) + ") + " + n);
        return sum(n-1)+n;
    }

    public static void main(String[] args) {
        System.out.println(sum(3));
    }
}
