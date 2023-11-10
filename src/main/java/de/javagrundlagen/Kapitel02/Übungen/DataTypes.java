package de.javagrundlagen.Kapitel02.Übungen;

public class DataTypes {

    public static void main(String[] args) {

        //Primitive Datentypen
        boolean trueBoolean = true;
        boolean falseBoolean = false;
        System.out.println(trueBoolean);
        System.out.println(falseBoolean);

        byte lowestByte = -128;
        System.out.println(lowestByte);
        lowestByte = (byte)(Math.pow(2,8)/2);
        System.out.println(lowestByte);

        byte math = (byte)(Math.pow(2,8)-1);
        System.out.println(math);

        byte highestByte = 127;
        System.out.println(highestByte);
        highestByte = (byte)((Math.pow(2,8)/2)-1);
        System.out.println(highestByte);

        short lowestShort = -32_768;
        System.out.println(lowestShort);
        lowestShort = (short)((Math.pow(2,16))/2);
        System.out.println(lowestShort);


        short highestShort = 32_767;
        System.out.println(highestShort);
        highestShort = (short)(((Math.pow(2,16))/2)-1);
        System.out.println(highestShort);

        int lowestInt = -2_147_483_648;
        System.out.println(lowestInt);
        lowestInt = (int)(0-(Math.pow(2,32)/2));
        System.out.println(lowestInt);

        int highestInt = 2_147_483_647;
        System.out.println(highestInt);
        highestInt = (int)(Math.pow(2,32)/2);
        System.out.println(highestInt);

        long lowestLong = -9_223_372_036_854_775_808L; //or lowercase l
        System.out.println(lowestLong);
        lowestLong = (long)(0-(Math.pow(2,64))/2);
        System.out.println(lowestLong);

        long highestLong = 9_223_372_036_854_775_807l; //or uppercase L
        System.out.println(highestLong);
        highestLong = (long)((Math.pow(2,64))/2);
        System.out.println(highestLong);

        float lowestFloat = 1.4f * 10e-45f; //or uppercase F
        System.out.println(lowestFloat);

        float highestFloat = 3.4028235f * 10e37f;
        System.out.println(highestFloat);

        double lowestDouble = 4.9d * 10e-324d;
        System.out.println(lowestDouble);
        lowestDouble = 4.94065645841246544e-324d;
        System.out.println(lowestDouble);

        double highestDouble = 1.7976931348623157d * 10e307d;
        System.out.println(highestDouble);
        highestDouble = 1.79769313486231570e+308d;
        System.out.println(highestDouble);


    }
}
