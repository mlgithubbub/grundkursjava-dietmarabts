package de.javagrundlagen.Kapitel02.Übungen;

public class LoopThroughUniChars2 {

    public static void main(String[] args) {

        //Cast char to an int, increment and cast back to char:
        char uniChar = '\u0000';
        int uniCharAsInt = uniChar;

        for (int i = 0; i <= 50; i++) {
            System.out.print(uniCharAsInt + ": ");
            System.out.println((char) uniCharAsInt);
            uniCharAsInt++;
        }
    }
}
