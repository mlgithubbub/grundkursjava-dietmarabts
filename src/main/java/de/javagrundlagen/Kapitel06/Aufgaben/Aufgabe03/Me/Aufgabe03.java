package de.javagrundlagen.Kapitel06.Aufgaben.Aufgabe03.Me;

public class Aufgabe03 {

    int x = 10;
    //lokale Variablen: Variablen, die innerhalb einer Methode oder innerhalb eines Blockes einer Methode definiert werden
    public void myMethod(int a, int b){
        //werden angelegt, wenn die Ausführung der Methode/des Blocks beginnt
        int y = 8;
        System.out.println(y);
        //Variablen innerer Blöcke verdecken gleichnahmige Variablen äußerer Blöcke, insbesondere gleichnahmige
        // Attribute der Klasse
        int x = 5;
        System.out.println(x);
        //Die Parameter einer Methode sind als lokale Variablen des Methodenrumpfs aufzufassen
        System.out.println(a+b);
        for (int i = 0; i <= 5; i++){
            int j = i + 1;
            //Es ist nicht erlaubt, eine bereits definierte lokale Variable in einem tiefer geschachtelten Block erneut mit dem gleichen Namen zu definieren, aber ihr Name darf mit einem Attributnamen der Klasse übereinstimmen
            //int x = 3;
            //Innerhalb eines Blocks kann auf der Variablen der umgebenden Blöcke/Methode sowie auf der umschließenden Klasse zugegriffen werden
            int k = i + x;
            System.out.println(k);
        }
        //Variablen, die im Initialisierungsteil des Kopfs einer for-Anweisung definiert werden, sind nur innerhalb der for-Anweisung gültig
        //System.out.println(i);
        //System.out.println(j);
    }
    public static void main(String[] args) {
        Aufgabe03 newAufgabe03 = new Aufgabe03();
        System.out.println(newAufgabe03.x);
        newAufgabe03.myMethod(1,2);
    }
}
