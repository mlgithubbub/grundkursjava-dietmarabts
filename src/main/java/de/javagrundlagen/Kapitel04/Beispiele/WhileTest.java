package de.javagrundlagen.Kapitel04.Beispiele;

public class WhileTest {

    public static void main(String[] args) {
        int n = 100, summe = 0, i = 1;

        while(i <= n){
            summe += i;
            i++;
        }
        System.out.println("Summe 1 bis " + n + ": " + summe);
    }
}
