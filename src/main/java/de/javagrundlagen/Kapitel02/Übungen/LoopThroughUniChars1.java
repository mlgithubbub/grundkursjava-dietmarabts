package de.javagrundlagen.Kapitel02.Übungen;

public class LoopThroughUniChars1 {


    public static void main(String[] args) {

        String uniHexString;
        String zeroString;
        String unicodeString;
        char unicodeChar;

        //Complicated way, just for fun
        //highest value is 65535
        for (int i = 0; i <= 65535; i++){
            //Convert integer i to a hexidecimal string
            uniHexString = getHexString(i);
            //Make a string of zeros to precede the hexidecimal string in the unicode escape sequence
            zeroString = getZeroString(uniHexString);
            //Make the unicode escape sequence string
            unicodeString = createUnicodeString(zeroString,uniHexString);
            //Get the unicode character for the unicode escape sequence string
            unicodeChar = createUnicodeChar(unicodeString);
            //Print the unicode escape sequence string and the character it corresponds to
            System.out.println(unicodeString + ": " + unicodeChar);
        }

    }

    public static char createUnicodeChar(String unicodeString){
        String uniHexString = unicodeString.substring(1);
        int uniHexInt = Integer.parseInt(uniHexString,16);
        char unicodeChar = (char) uniHexInt;
        return unicodeChar;
    }
    public static String createUnicodeString(String zeroString, String uniHexString){

        String unicodeString = "\\" + zeroString + uniHexString;
        return unicodeString;
    }

    public static String getHexString(int x){
        return Integer.toHexString(x);
    }

    public static String getZeroString(String hexString){
        String zeros = "";
        int zeroStringLength = 4 - hexString.length();
        for (int i = 1; i <= zeroStringLength; i++){
            zeros = zeros + "0";
        }
        return zeros;
    }
}
