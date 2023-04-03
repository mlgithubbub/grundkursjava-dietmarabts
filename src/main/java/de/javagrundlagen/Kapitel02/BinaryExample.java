package de.javagrundlagen.Kapitel02;

public class BinaryExample {

    public static void main(String[] args) {

        for(int i = 0; i < 5; i++){
            int zahl = (1 << i);
            System.out.println("Zahl( 2^" +i + " ): " + zahl);
        }

    }

}
