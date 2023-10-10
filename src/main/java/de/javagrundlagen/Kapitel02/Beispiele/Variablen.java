package de.javagrundlagen.Kapitel02.Beispiele;

public class Variablen {
    public static void main(String[] args) {
        boolean booleanVar = true;
        char charVar = 'a';
        byte byteVar = 100;
        short shortVar = 32000;
        int intVar = 0b1000_0000;
        long longVar = 123_456_789;
        float floatVar = 0.12345f;
        double doubleVar = 0.12345e1;

        System.out.println("booleanVar: " + booleanVar);
        System.out.println("charVar: " + charVar);
        System.out.println("byteVar: " + byteVar);
        System.out.println("shortVar: " + shortVar);
        System.out.println("intVar: " + intVar);
        System.out.println("longVar: " + longVar);
        System.out.println("floatVar: " + floatVar);
        System.out.println("doubleVar: " + doubleVar);
    }
}
