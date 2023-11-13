package de.javagrundlagen.Kapitel06.Beispiele;

public class MaxTest {

    public static int max(int a, int b){
        return a < b ? b : a;
    }

    public static void main(String[] args) {
        System.out.println("Maximum: " + MaxTest.max(5,3));
    }
}
