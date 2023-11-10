package de.javagrundlagen.Kapitel03.Übungen;

public class CastOperator {

    public static void main(String[] args) {

        //das höherwertige Byte wird von a abgeschnitten: b = (byte) 257 --> 1
        short shortUnder127 = 125;
        short shortAt127 = 127;
        short short1Above127 = 128;
        short short2Above127 = 150;

        byte byte1 = (byte) shortUnder127;
        byte byte2 = (byte) shortAt127;
        byte byte3 = (byte) short1Above127;
        byte byte4 = (byte) short2Above127;

        System.out.println(shortUnder127 + ":" + Integer.toBinaryString(shortUnder127) + " => " + byte1 + ":" + Integer.toBinaryString(byte1));
        System.out.println(shortAt127 + ":" + Integer.toBinaryString(shortAt127) + " => " + byte2 + ":" + Integer.toBinaryString(byte2));
        System.out.println(short1Above127 + ":" + Integer.toBinaryString(short1Above127) + " => " + byte3 + ":" + Integer.toBinaryString(byte3));
        System.out.println(short2Above127 + ":" + Integer.toBinaryString(short2Above127) + " => " + byte4 + ":" + Integer.toBinaryString(byte4));
        System.out.println();

        //bool, char, byte, short, int, long, float, double
        boolean myBoolean = true;
        char myChar = 'a';
        byte myByte = 127;
        short myShort = 32_767;
        int myInt = 2_147_483_647;
        long myLong = 9_223_372_036_854_775_807L;
        float myFloat = 5.5F;
        double myDouble = 5.5;

        //Cast to boolean-- NOT POSSIBLE
        //bool, char, byte, short, int, long, float, double
        //boolean charToBool = (boolean) myChar;
        //boolean byteToBool = (boolean)myByte;
        //boolean shortToBool = (boolean) myShort;
        //boolean intToBool = (boolean) myInt;
        //boolean longToBool = (boolean) myLong;
        //boolean floatToBool = (boolean) myFloat;
        //boolean doubleToBool = (boolean) myDouble;

        //Cast to char#
        //bool, char, byte, short, int, long, float, double
        //char boolToChar = (char)myBoolean;
        char byteToChar = (char) myByte;
        char shortToChar = (char) myShort;
        char intToChar = (char) myInt;
        char longToChar = (char) myLong;
        char floatToChar = (char) myFloat;
        char doubleToChar = (char) myDouble;
        System.out.println(myByte + " byte to char => " + byteToChar);
        System.out.println(myShort + " short to char => " + shortToChar);
        System.out.println(myInt + " int to char => " + intToChar);
        System.out.println(myLong + " long to char => " + longToChar);
        System.out.println(myFloat + " float to char => " + floatToChar);
        System.out.println(myDouble + " double to char => " + doubleToChar);
        System.out.println();

        //Cast to byte
        //bool, char, byte, short, int, long, float, double
        //byte boolToByte = (byte)myBoolean;
        byte charToByte = (byte) myChar;
        byte shortToByte = (byte) myShort;
        byte intToByte = (byte) myInt;
        byte longToByte = (byte) myLong;
        byte floatToByte = (byte) myFloat;
        byte doubleToByte = (byte) myDouble;
        System.out.println(myChar + " char to byte => " + charToByte);
        System.out.println(myShort + " short to byte => " + shortToByte);
        System.out.println(myInt + " int to byte => " + intToByte);
        System.out.println(myLong + " long to byte => " + longToByte);
        System.out.println(myFloat + " float to byte => " + floatToByte);
        System.out.println(myDouble + " double to byte => " + doubleToByte);
        System.out.println();

        //Cast to short
        //bool, char, byte, short, int, long, float, double
        //short boolToShort = (short)myBoolean;
        short charToShort = (short) myChar;
        short byteToShort = (short) myByte;
        short intToShort = (short) myInt;
        short longToShort = (short) myLong;
        short floatToShort = (short) myFloat;
        short doubleToShort = (short) myDouble;
        System.out.println(myChar + " char to short => " + charToShort);
        System.out.println(myByte + " byte to short => " + byteToShort);
        System.out.println(myInt + " int to short => " + intToShort);
        System.out.println(myLong + " long to short => " + longToShort);
        System.out.println(myFloat + " float to short => " + floatToShort);
        System.out.println(myDouble + " double to short => " + doubleToShort);
        System.out.println();


        //Cast to int
        //bool, char, byte, short, int, long, float, double
        //int boolToInt = (int)myBoolean;
        int charToInt = (int) myChar;
        int byteToInt = (int) myByte;
        int shortToInt = (int) myShort;
        int longToInt = (int) myLong;
        int floatToInt = (int) myFloat;
        int doubleToInt = (int) myDouble;
        System.out.println(myChar + " char to int => " + charToInt);
        System.out.println(myByte + " byte to int => " + byteToInt);
        System.out.println(myShort + " short to int => " + shortToInt);
        System.out.println(myLong + " long to int => " + longToInt);
        System.out.println(myFloat + " float to int => " + floatToInt);
        System.out.println(myDouble + " double to int => " + doubleToInt);
        System.out.println();

        //Cast to long
        //bool, char, byte, short, int, long, float, double
        //short boolToShort = (short)myBoolean;
        long charToLong = (long) myChar;
        long byteToLong = (long) myByte;
        long shortToLong = (long) myShort;
        long intToLong = (long) myInt;
        long floatToLong = (long) myFloat;
        long doubleToLong = (long) myDouble;
        System.out.println(myChar + " char to long => " + charToLong);
        System.out.println(myByte + " byte to long => " + byteToLong);
        System.out.println(myShort + " short to long => " + shortToLong);
        System.out.println(myInt + " int to long => " + intToLong);
        System.out.println(myFloat + " float to long => " + floatToLong);
        System.out.println(myDouble + " double to long => " + doubleToLong);
        System.out.println();

        //Cast to float
        //bool, char, byte, short, int, long, float, double
        //float boolToFloat = (float)myBoolean;
        float charToFloat = (float) myChar;
        float byteToFloat = (float) myByte;
        float shortToFloat = (float) myShort;
        float intToFloat = (float) myInt;
        float longToFloat = (float) myLong;
        float doubleToFloat = (float) myDouble;
        System.out.println(myChar + " char to float => " + charToFloat);
        System.out.println(myByte + " byte to float => " + byteToFloat);
        System.out.println(myShort + " short to float => " + shortToFloat);
        System.out.println(myInt + " int to float => " + intToFloat);
        System.out.println(myLong + " long to float => " + longToFloat);
        System.out.println(myDouble + " double to float => " + doubleToFloat);
        System.out.println();

        //Cast to double
        //bool, char, byte, short, int, long, float, double
        //double boolToDouble = (double)myBoolean;
        double charToDouble = (double) myChar;
        double byteToDouble = (double) myByte;
        double shortToDouble = (double) myShort;
        double intToDouble = (double) myInt;
        double longToDouble = (double) myLong;
        double floatToDouble = (double) myFloat;
        System.out.println(myChar + " char to double => " + charToDouble);
        System.out.println(myByte + " byte to double => " + byteToDouble);
        System.out.println(myShort + " short to double => " + shortToDouble);
        System.out.println(myInt + " int to double => " + intToDouble);
        System.out.println(myLong + " long to double => " + longToDouble);
        System.out.println(myFloat + " float to double => " + floatToDouble);
        System.out.println();

    }
}
