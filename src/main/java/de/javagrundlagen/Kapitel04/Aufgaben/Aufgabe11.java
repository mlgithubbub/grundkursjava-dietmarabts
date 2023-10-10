package de.javagrundlagen.Kapitel04.Aufgaben;

public class Aufgabe11 {
    /*
    Schreiben Sie ein Programm, das die Zerlegung einer Zahl n >= 2 in ihre Primfaktoren berechnet. Die folgende
    Abbildung zeigt den Entwurf des Programms in Form eines sogenannten Struktogramms:

    (See Aufgabe11.jpeg in "resources" folder.)
     */

   //MY SOLUTION:
    public static void main(String[] args) {
        int n = 18844;
        int t = 2;

        while (n> 1){
            if (n % t == 0){
                n = n/t;
                System.out.println(t);
            }else{
                t = t + 1;
            }
        }
    }

/*    //BUCHLÖSUNG:
    public static void main(String[] args) {
        int n = 18844;
        int t = 2;

        while (n > 1) {
            if (n % t == 0) {
                n = n / t;
                System.out.println(t);
            } else {
                t++;
            }
        }
    }*/

}
