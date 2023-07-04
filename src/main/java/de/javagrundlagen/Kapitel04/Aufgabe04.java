package de.javagrundlagen.Kapitel04;

public class Aufgabe04 {
    /*
    Berechnen Sie den kleinsten ganzzahligen Wert von n, sodass 2^n größer oder gleich einer vorgegebenen
    ganzen Zahl x ist. Beispiel: Für x = 15 ist n = 4.
     */

    public static void main(String[] args) {

        int n = 0;
        int zahl = 64;

        for (int i = 0; i <= zahl; i++){

            if (Math.pow(2,i) >= zahl){
                n = i;
                break;
            }
        }
        System.out.println(n);
    }

    //BUCHLÖSUNG
/*
    public static void main(String[] args) {
        int x = 15;

        int n = 0;
        for (int z = 1; z < x; n++) {
            z *= 2;
        }

        System.out.println(n);
    }
*/

}
