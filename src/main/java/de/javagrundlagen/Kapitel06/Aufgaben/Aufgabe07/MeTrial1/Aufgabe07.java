package de.javagrundlagen.Kapitel06.Aufgaben.Aufgabe07.MeTrial1;

//Aufgabe 7: Ein Stapel (Stack) ist eine Datenstruktur, in der Daten nach dem Prinzip "Last in, first out" (LIFO)
// verwaltet werden. Implementieren Sie einen Stapel auf der Basis eines Arrays mit den folgenden Methoden:

//void push(int e): legt eine Zahl oben auf den Stapel
//int pop(): entfernt das oberste Element des Stapels

// Ist das Array voll, soll automatisch ein neues Array mit doppelter Länge erzeugt werden, mit dem dann weiter
// gearbeitet werden kann. Die Elemente des alten Arrays müssen vorher in das neue Array kopiert werden.
// Kapazitätsprüfung, Erzeugung des neuen Arrays und Übernahme der bisherigen Werte sollen in der Methode push
// erfolgen.
public class Aufgabe07 {

    public static void main(String[] args) {
        Stapel stapel1 = new Stapel();
        printArrayInfo(stapel1);

        stapel1.push(1);
        printArrayInfo(stapel1);

        stapel1.push(2);
        printArrayInfo(stapel1);

        stapel1.push(3);
        printArrayInfo(stapel1);

        stapel1.push(4);
        printArrayInfo(stapel1);

        int lastElement = stapel1.pop();
        System.out.println("Delete last element: " + lastElement);
        printArrayInfo(stapel1);
    }



    static void printArrayInfo(Stapel myStapel){
        System.out.println("Stapel Array length: " + myStapel.stapelArray.length);
        System.out.println("Array items: ");
        for (int i = 0; i < myStapel.stapelArray.length; i++){
            System.out.println(myStapel.stapelArray[i]);
        }
        System.out.println();
    }

}
