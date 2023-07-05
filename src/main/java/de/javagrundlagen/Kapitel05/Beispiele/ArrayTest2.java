package de.javagrundlagen.Kapitel05.Beispiele;

public class ArrayTest2 {

    public static void main(String[] args) {
        int[]zahlen = new int[10];

        for (int i = 0; i < zahlen.length; i++){
            zahlen[i] = i * 100;
        }

        for(int zahl : zahlen){ //foreach-Schleife
            System.out.print(zahl + " ");
        }

        System.out.println();
        String[]tage = {"Mo", "Di", "Mi", "Do", "Fr", "Sa", "So"};
        for (String tag : tage){
            System.out.print(tag + " ");
        }
    }
}
