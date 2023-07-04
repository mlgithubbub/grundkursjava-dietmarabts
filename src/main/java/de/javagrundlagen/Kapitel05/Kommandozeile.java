package de.javagrundlagen.Kapitel05;

public class Kommandozeile {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++){
            System.out.println((i+1)+".Parameter: " + args[i]);
        }
    }
}
