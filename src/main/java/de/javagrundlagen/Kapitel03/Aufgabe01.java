package de.javagrundlagen.Kapitel03;

public class Aufgabe01 {
    /*Es sollen x Flaschen in Kartons verpackt werden. Ein Karton kann n Flaschen aufnehmen.
    Schreiben Sie ein Programm, das ermittelt, in wie viele Kartons eine bestimmte Anzahl
    Flaschen verpackt werden kann und wie viele Flaschen übrig bleiben.
    * */

    public static void main(String[] args) {

        int bottleQuantity = 31;
        int boxCapacity = 4;

        int numberOfPackableBoxes = bottleQuantity/boxCapacity;
        int remainingBottles = bottleQuantity - (numberOfPackableBoxes * boxCapacity);

        System.out.println("The number of boxes that can be packed is: "+ numberOfPackableBoxes);
        System.out.println("The number of bottles remaining is: "+ remainingBottles);
    }
}
