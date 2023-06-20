package de.javagrundlagen.Kapitel04Aufgaben;

public class Aufgabe12 {
    /*
    Ein Schaltjahr ist ein Jahr, das eine Jahreszahl hat, die durch 4 teilbar ist. Jahreszahlen, die durch 100 teilbar
    sind, sind allerdings keine Schaltjahre. Es sei denn, die Jahreszahl ist durch 400 teilbar. Schreiben Sie ein
    Programm, das für ein vorgegebenes Jahr ermittelt, ob es ein Schaltjahr ist.

    Schaltjahr = leap year
     */

    //MY SOLUTION:
    public static void main(String[] args) {
        int year = 1965;

        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " IS a leap year.");
        } else if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
            System.out.println(year + " IS a leap year.");
        } else {
            System.out.println(year + " is NOT a leap year.");
        }
    }

/*    //BUCHLÖSUNG:
    public static void main(String[] args) {
        int jahr = 2020;
        boolean schaltjahr;

        if (jahr % 4 == 0 && (jahr % 100 != 0 || jahr % 400 == 0))
            schaltjahr = true;
        else
            schaltjahr = false;

        if (schaltjahr)
            System.out.println(jahr + " ist ein Schaltjahr.");
        else
            System.out.println(jahr + " ist kein Schaltjahr.");
    }*/
}
