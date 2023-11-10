package de.javagrundlagen.Kapitel02.Übungen;

public class LoopThroughUniChars3 {

    public static void main(String[] args) {

        //Loop through integers and print character values
        for (int i = 0; i <= 65535; i++) {
            System.out.print(i + ": ");
            System.out.println((char) i);
        }
    }
}
