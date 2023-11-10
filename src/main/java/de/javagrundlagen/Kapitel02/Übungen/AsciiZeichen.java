package de.javagrundlagen.Kapitel02.Übungen;

public class AsciiZeichen {

    public static void main(String[] args) {

        char myChar = '\001';
        System.out.println(myChar);

        char myChar2 = '\005';
        System.out.println(myChar2);

        char myChar3 = 1;
        System.out.println(myChar3);

        System.out.println((myChar+myChar2));

        String myCharString = "\\" + "00" + "1";
        System.out.println(myCharString);

        char asciiChar = 0;

        for (int i = 1; i <= 128; i += 10){
            for (int j = i; j <= i + 9; j++){
                asciiChar = (char)j;
                System.out.print(j + ": " + asciiChar + "\t");
            }
            System.out.print("\n");
        }
    }
}
