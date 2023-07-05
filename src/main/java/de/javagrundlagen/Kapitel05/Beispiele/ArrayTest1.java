package de.javagrundlagen.Kapitel05.Beispiele;

public class ArrayTest1 {
    public static void main(String[] args) {
        int[] zahlen = new int[10];

        for (int i = 0; i < zahlen.length; i++){
            zahlen[i] = i * 100;
        }

        for (int i = 0; i < zahlen.length; i++){
            System.out.print(zahlen[i] + " ");
        }

        System.out.println();
        String[] tage = {"Mo", "Di", "Mi", "Do", "Fr", "Sa", "So"};
        for (int i = 0; i < tage.length; i++){
            System.out.print(tage[i] + " ");
        }
    }
}
