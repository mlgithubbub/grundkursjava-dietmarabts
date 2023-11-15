package de.javagrundlagen.Kapitel06.Aufgaben.Aufgabe07.MeTrial2;

public class Aufgabe07 {

    public static void main(String[] args) {

        Stapel stapel1 = new Stapel();

        for (int i = 1; i <= 12; i++){
            stapel1.push(i);
        }

        printInfo(stapel1);

        System.out.println("These items have been removed: ");
        for (int i = 1; i <= 12; i++){
            int lastItem = stapel1.pop();
            System.out.println(lastItem);
        }

        printInfo(stapel1);

    }

    static void printInfo(Stapel stapel){
        System.out.println("Number of items added to stapel array: " + stapel.getNumOfItems());
        System.out.println("Items in stapel array: ");
        for (int i = 0; i < stapel.getStapelArray().length; i++){
            System.out.println(stapel.getStapelArray()[i]);
        }
    }
}
