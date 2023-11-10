package de.javagrundlagen.Kapitel02.Übungen;

public class LoopThroughUniChars4 {

    public static void main(String[] args) {

        //Loop through characters as integer values directly, much slower! - Why?
        for (char i = 0; i <= 65535; i++){
            System.out.println(i);
        }

    }
}
