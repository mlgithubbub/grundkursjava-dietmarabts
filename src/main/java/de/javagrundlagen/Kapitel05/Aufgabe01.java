package de.javagrundlagen.Kapitel05;

public class Aufgabe01 {
    /*Schreiben Sie ein Programm, das für ein mit Zahlen initialisiertes int-Array den kleinsten und den größten Wert
     sowie den Mittelwert berechnet*/

    public static void main(String[] args) {

        int[] myIntArray = {1,5,2,3,8,9,23,11,43,10};
        int biggestValue = myIntArray[0];
        int smallestValue = myIntArray[0];
        int averageValue;
        int sum = 0;


        for (int i = 0; i < myIntArray.length; i++){
            if (myIntArray[i] > biggestValue){
                biggestValue = myIntArray[i];
            }
            if (myIntArray[0] < smallestValue) {
                smallestValue = myIntArray[i];
            }
             sum = sum + myIntArray[i];
        }
        averageValue = sum/ myIntArray.length;

        System.out.println("The smallest value in the array is: " + smallestValue);
        System.out.println("The biggest value in the array is: " + biggestValue);
        System.out.println("The average of all values in the array is: " + averageValue);
    }

}
