package de.javagrundlagen.Kapitel02;

public class Datentypen {

    public static void main(String[] args){

        boolean yes = true;
        boolean no = false;
        char letter = 'a';

        //ESCAPE SEQUENCES:
        String bS = "\b"; //backspace
        String tab = "\t";
        String nL = "\n"; //newline
        String fF = "\f"; //formfeed
        String cR = "\r"; //carriage return
        String dQ = "\""; //double quotes
        String sQ = "\'"; //single quotes
        String bSl = "\\"; //backslash
        String letter2 = "\333"; //ASCII-codiertes Zeichen, Oktalschreibweise
        String letter1 = "\u00c4"; //Unicode-Zeichen, Hexadezimalschreibweise

        String myString = dQ + "Hi" + dQ + "," + nL + "My name is " + sQ + "Morganaa" + bS + bS + sQ + tab + "!";

        //WHOLE NUMBERS:
        byte byteInOctal = 011;
        byte byteInHexadecimal = 0x2F;
        byte byteInHexadecimal2 = 0X2F;
        byte smallestByte = -128;
        byte biggestByte = 127;

        short shortInOctal = 0234;
        short shortInHexadecimal = 0xF5A;
        short shortInHexadecimal2 = 0XF5A;
        short smallestShort = -32768;
        short biggestShort = 32767;

        int intInOctal = 0125637;
        int intInHexadecimal = 0x1FF2A;
        int intInHexadecimal2 = 0X1FF2A;
        int smallestInt = -2147483648;
        int biggestInt = 2147483647;

        long longInOctal = 077777777777L; //hmmm
        long longInHexadecimal = 0xFFFFFFFF; //hmmm
        long intAsLong = 2147283627l;
        long intAsLong2 = 2147283627L;
        long biggestLong = 9223372036854775807l;
        long biggestLong2 = 9223372036854775807L;


        //DECIMAL NUMBERS:
        float myFloat = 1.25f;
        float myFloat2 = 1.25F;
        float biggestFloat = 3.4028235e38F;
        double smallestFloat = 1.4e-45;

        double myDouble = 1.25;
        double myDoubleWithSuffix = 1.25d;
        double myDoubleWithSuffix2 = 1.25D;
        double biggestDouble = 1.7976931348623157e308;
        double smallestDouble = 4.9e-324;


        System.out.println(letter2);
        System.out.println(myString);

    }
}
