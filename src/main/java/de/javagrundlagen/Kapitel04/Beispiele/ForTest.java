package de.javagrundlagen.Kapitel04.Beispiele;

public class ForTest {

    public static void main(String[] args) {
        int n = 100, summe = 0;

        for (int i = 1; i <= n; i++){
            summe += i;
            System.out.println("Summe 1 bis " + n + ": " + summe);
        }
    }
}
