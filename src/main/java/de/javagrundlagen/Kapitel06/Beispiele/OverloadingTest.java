package de.javagrundlagen.Kapitel06.Beispiele;

public class OverloadingTest {
    public int max (int a, int b){
        System.out.println("Signatur: max int int");
        return a < b ? b : a;
    }

    public double max (double a, double b){
        System.out.println("Signatur: max double double");
        return a < b ? b : a;
    }

    public int max (int a, int b, int c){
        System.out.println("Signatur: max int int int");
        return max(max(a,b),c);
    }

    public static void main(String[] args) {
        OverloadingTest ot = new OverloadingTest();
        System.out.println("max(1, 3): " + ot.max(1,3));
        System.out.println();
        System.out.println("max(1, 2, 3): " + ot.max(1,3,2));
        System.out.println();
        System.out.println("max(1., 3.): " + ot.max(1., 3.));
        System.out.println();
        System.out.println("max(1., 3): " + ot.max(1., 3));
    }


}
