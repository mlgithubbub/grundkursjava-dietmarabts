package de.javagrundlagen.Kapitel02;

public class Typumwandlung {

    public static void main(String[] args) {

        /*TYPUMWANDLUNG: KLEIN -> GROSS:
        * BYTE < SHORT < INT < LONG < FLOAT < DOUBLE
        * */
        byte myByte = 6;
        short myShort = 3;
        int myInt1 = 10;
        int myInt2 = 3;
        long myLong = 10;
        float myFloat = 10;
        double myDouble = 3;


        //BYTE/SHORT -> INTEGER
        System.out.println("\n"+ "BYTE/SHORT -> INTEGER");
        var byteDivShort = myByte/myShort;
        System.out.print("byte " + myByte +"/short " +myShort+"= "+ byteDivShort + " which is of type: ");
        System.out.println(((Object) byteDivShort).getClass().getSimpleName()); //integer!!!

        //BYTE/SHORT -> BYTE/SHORT
        System.out.println("\n"+ "BYTE/SHORT -> BYTE/SHORT");
        byte byteDivShortToByte = (byte) byteDivShort;
        short byteDivShortToShort = (short) byteDivShort;
        System.out.print(byteDivShort + " cast to a byte = " + byteDivShortToByte + " which is of type: ");
        System.out.println(((Object) byteDivShortToByte).getClass().getSimpleName()); //cast integer to byte
        System.out.print(byteDivShort + " cast to a short = " + byteDivShortToShort + " which is of type: ");
        System.out.println(((Object) byteDivShortToShort).getClass().getSimpleName()); //cast interger to short

        //INTEGER
        System.out.println("\n"+ "INTEGER -> INTEGER");
        var intDivInt = myInt1/myInt2;
        System.out.print("int " + myInt1 +"/int " +myInt2+"= "+ intDivInt + " which is of type: ");
        System.out.println(((Object) intDivInt).getClass().getSimpleName()); //integer

        //INTEGER -> LONG
        System.out.println("\n"+ "INTEGER -> LONG");
        var longDivByInt = myLong/myInt2;
        System.out.print("long " + myLong +"/int " +myInt2+"= "+ longDivByInt + " which is of type: ");
        System.out.println(((Object) longDivByInt).getClass().getSimpleName()); //long
        var longDivIntToInt = (int) longDivByInt;
        System.out.print(longDivByInt + " cast to an integer = " + longDivIntToInt + " which is of type: ");
        System.out.println(((Object) longDivIntToInt).getClass().getSimpleName()); //cast long to int

        //INTEGER -> FLOAT
        System.out.println("\n"+ "INTEGER -> FLOAT");
        var floatDivByInt = myFloat/myInt2;
        System.out.print("float " + myFloat +"/int " +myInt2+"= "+ floatDivByInt + " which is of type: ");
        System.out.println(((Object) floatDivByInt).getClass().getSimpleName()); //float
        var floatDivByIntToInt = (int) floatDivByInt;
        System.out.print(floatDivByInt + " cast to an integer = " + floatDivByIntToInt + " which is of type: ");
        System.out.println(((Object) floatDivByIntToInt).getClass().getSimpleName()); //cast float to int

        //INTEGER -> DOUBLE
        System.out.println("\n"+ "INTEGER -> DOUBLE");
        var doubleDivByInt = myDouble/myInt2;
        System.out.print("double " + myDouble +"/int " +myInt2+"= "+ doubleDivByInt + " which is of type: ");
        System.out.println(((Object) doubleDivByInt).getClass().getSimpleName()); //double
        var doubleDivByIntToInt = (int) doubleDivByInt;
        System.out.print(doubleDivByInt + " cast to an integer = " + doubleDivByIntToInt + " which is of type: ");
        System.out.println(((Object) doubleDivByIntToInt).getClass().getSimpleName()); //force int

        //LONG -> FLOAT
        System.out.println("\n"+ "LONG -> FLOAT");
        var floatDivByLong = myFloat/myLong;
        System.out.print("float " + myFloat +"/long " +myLong+"= "+ floatDivByLong + " which is of type: ");
        System.out.println(((Object) floatDivByLong).getClass().getSimpleName()); //float
        var floatDivByLongToLong = (long)floatDivByLong;
        System.out.print(floatDivByLong + " cast to a long = " + floatDivByLongToLong + " which is of type: ");
        System.out.println(((Object) floatDivByLongToLong).getClass().getSimpleName()); //cast float to long

        //LONG -> DOUBLE
        System.out.println("\n"+ "LONG -> DOUBLE");
        var longDivByDouble = myLong/myDouble;
        System.out.print("long " + myLong +"/double " +myDouble+"= "+ longDivByDouble + " which is of type: ");
        System.out.println(((Object) longDivByDouble).getClass().getSimpleName()); //double
        var longDivByDoubleToLong = (long) longDivByDouble;
        System.out.print(longDivByDouble + " cast to a long = " + longDivByDoubleToLong + " which is of type: ");
        System.out.println(((Object) longDivByDoubleToLong).getClass().getSimpleName()); //cast double to long

        //FLOAT -> DOUBLE
        System.out.println("\n"+ "FLOAT -> DOUBLE");
        var floatDivByDouble = myFloat/myDouble;
        System.out.print("float " + myFloat +"/double " +myDouble+"= "+ floatDivByDouble + " which is of type: ");
        System.out.println(((Object) floatDivByDouble).getClass().getSimpleName()); //double
        var floatDivByDoubleToFloat = (float) floatDivByDouble;
        System.out.print(floatDivByDouble + " cast to a float = " + floatDivByDoubleToFloat + " which is of type: ");
        System.out.println(((Object) floatDivByDoubleToFloat).getClass().getSimpleName()); //cast double to float
    }


}
