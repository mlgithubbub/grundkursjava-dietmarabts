package de.javagrundlagen.Kapitel02.Beispiele;

public class VarTest {

    public static void main(String[] args) {
        var age = 42;
        var pi = 3.14159;
        var hello = "Hallo!";
        var notTrue = false;


        System.out.println(age + " " + pi + " " + hello + " " + notTrue);


        //Convert primitive data type to an object to use getClass() and getName() methods to find out the data type:
        System.out.println(((Object)age).getClass().getName());
        System.out.println(((Object)pi).getClass().getName());
        System.out.println(((Object)hello).getClass().getName());
        System.out.println(((Object)notTrue).getClass().getName());

    }
}
