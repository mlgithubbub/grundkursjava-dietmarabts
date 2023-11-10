package de.javagrundlagen.Kapitel02.Übungen;

public class TypeInferenceLocalVariables {

    public static void main(String[] args) {

        var myBoolean = true;
        var myChar = 'M';
        var myByte = -128;
        var myShort = -32768;
        var myInt = -2e8;
        //var myLong = 9_223_372_036_854_775_807; //It appears VAR can only represent integers, not long
        var myFloat = -1.5e10;
        var myDouble = -1.5e20;


        System.out.println("myBoolean has the value: " + myBoolean + " and is of type: " +((Object)myBoolean).getClass().getName());
        System.out.println("myChar has the value: " + myChar + " and is of type: " +((Object)myChar).getClass().getName());
        System.out.println("myByte has the value: " + myByte + " and is of type: " +((Object)myByte).getClass().getName());
        System.out.println("myShort has the value: " + myShort + " and is of type: " +((Object)myShort).getClass().getName());
        System.out.println("myInt has the value: " + myInt + " and is of type: " +((Object)myInt).getClass().getName());
        //System.out.println("myLong has the value: " + myLong + " and is of type: " +((Object)myLong).getClass()
        // .getName());
        System.out.println("myFloat has the value: " + myFloat + " and is of type: " +((Object)myFloat).getClass().getName());
        System.out.println("myDouble has the value: " + myDouble + " and is of type: " +((Object)myDouble).getClass().getName());

    }
}
