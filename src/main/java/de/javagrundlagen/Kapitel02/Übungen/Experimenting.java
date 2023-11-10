package de.javagrundlagen.Kapitel02.Übungen;

public class Experimenting {

    public static void main(String[] args) {


        //Character literals can be hexadecimal unicode escape sequences:
        char uniHexChar1 = '\u0007';

        //You cannot shorten the digits of the unicode character escape sequence literal
        char myUniChar1 = '\u0300'; //You can't write u300 instead

        //Character literals can be octal escape sequences with 1-3 digits, 0-377 octal: 0-255 decimal
        char oct3DigitChar = '\007';
        char oct2DigitChar = '\07';
        char oct1DigitChar = '\7';

        System.out.println(uniHexChar1);
        System.out.println(oct3DigitChar);
        System.out.println(oct2DigitChar);
        System.out.println(oct1DigitChar);

        //It's not possible to concatenate and print escape sequences
        //char myChar1 = '\\' + '0003';
        String myCharAsString = "\\" + "u0004";
        System.out.println(myCharAsString);

        //It's not possible to add two character escape sequences:
        char char1 = '\001';
        char char2 = '\002';
        //char charSum = char1 + char2;

        //Unless you convert to integers and back to char:
        int charInt1 = (int)char1;
        int charInt2 = (int)char2;
        int sumCharInt1And2 = charInt1 + charInt2;
        System.out.println(sumCharInt1And2);
        System.out.println((char)sumCharInt1And2);

        //You can't add a character escape sequence and an integer:
        //char charSum2 = char1 + 1;

        //You can cast an integer to a character:
        int myInt1 = 5000;
        char char3 = (char)myInt1;
        System.out.println(char3);

        //You cannot cast a string to a character:
        String string1 = "a";
        //char char4 = (char) string1;

        //You can print characters with escape sequences as both strings and characters
        String string2 = "\u0600";
        char char5 = '\u0600';
        System.out.println(string2);
        System.out.println(char5);



    }
}
