package de.javagrundlagen.Kapitel04Aufgaben;

public class Aufgabe08 {
    /*
    Schreiben Sie ein Programm, das zu einer Zahl n <= 20 die Fakultät n! ermittelt. Es gilt bekanntlich:
    n! = 1 * 2 * ... * (n-1) * n sowie 0! = 1.
     */

    //MY SOLUTION:
    public static void main(String[] args) {

        int zahl = 10;
        int fakultaet = 1; //Warning: ä = non-ascii character

        for (int n = 1; n <= zahl; n++){
            fakultaet = fakultaet * n;
        }

        System.out.println(fakultaet);
    }

/*    //BUCHLÖSUNG:
    public static void main(String[] args) {
        int n = 20; // Überlauf, wenn n > 20

        long fak = 1;
        for (int i = 1; i <= n; i++) {
            fak *= i;
        }

        System.out.println(fak);
    }*/
}
