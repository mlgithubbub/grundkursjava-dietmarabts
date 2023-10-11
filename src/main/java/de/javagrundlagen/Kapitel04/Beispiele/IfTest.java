package de.javagrundlagen.Kapitel04.Beispiele;

public class IfTest {
    public static void main(String[] args) {
        int zahl = 4;

        if (zahl == 6 || zahl == 8)
            System.out.println("Knapp daneben");
        else if (zahl == 7)
            System.out.println("Treffer");
        else
            System.out.println("Weit daneben");
    }
}
