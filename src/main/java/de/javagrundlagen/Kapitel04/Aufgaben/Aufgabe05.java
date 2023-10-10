package de.javagrundlagen.Kapitel04.Aufgaben;

public class Aufgabe05 {

    /*
    Zwei Fließkommazahlen sollen verglichen werden. Ist der Absolutbetrag der Differenz dieser beiden Zahlen kleiner als
    ein vorgegebener Wert z, soll 0 ausgegeben werden, sonst -1 bzw. 1, je nachdem x kleiner als y oder größer als y ist.
     */

    public static void main(String[] args) {

        double myDouble1 = 1.5;
        double myDouble2 = 3.7;
        double difference = myDouble2 - myDouble1;
        double givenValue = 1;

        System.out.println(difference);
        System.out.println(Math.abs(difference));

        if (Math.abs(difference) < givenValue) {
            System.out.println(0);
        } else if (myDouble1 > myDouble2) {
            System.out.println(-1);
        } else if (myDouble2 > myDouble1) {
            System.out.println(1);
        }

        //BUCHLÖSUNG
/*    public static void main(String[] args) {
        double x = 1.5;
        double y = 3.7;
        double z = 1;

        double abs = (x - y < 0) ? y - x : x - y;

        if (abs < z)
            System.out.println(0);
        else if (x < y)
            System.out.println(-1);
        else
            System.out.println(1);
    }*/

    }
}
