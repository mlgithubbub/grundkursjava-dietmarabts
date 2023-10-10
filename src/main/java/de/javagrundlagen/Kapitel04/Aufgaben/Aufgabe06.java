package de.javagrundlagen.Kapitel04.Aufgaben;

public class Aufgabe06 {
    /*
    Schreiben Sie ein Programm, das eine ganze Zahl vom Typ int in Binärdarstellung (32 bit) ausgibt. Benutzen Sie
    hierzu die Bitoperatoren & und <<. Tipp: Das Bit mit der Nummer i (Nummerierung beginnt bei 0) in der
    Binärdarstellung von zahl hat den Wert 1 genau dann, wenn der Ausdruck zahl & (1 << i) von 0 verschieden ist.
     */

    /*//MY SOLUTION WITHOUT TIP:
    public static void main(String[] args) {

        double zahl = 100;
        int exponent = 0;

       //Find highest power of 2 less than zahl
        for (int i = 0; i <= zahl; i++){
           if (Math.pow(2, i) > zahl){
               exponent = i - 1;
               break;
           } else {
               exponent = i;
           }
       }

        //Print binary number
        for (int i = exponent; i >= 0; i--){
            if (Math.pow(2, i) <= zahl){
                System.out.print(1);
                zahl = zahl - Math.pow(2, i);
            }else{
                System.out.print(0);
            }
        }
*/

    //MY SOLUTION WITH TIP:
    public static void main(String[] args) {

        int zahl = 500;
        int exponent = 0;

        //Find highest power of 2 less than zahl:
        for (int i = 0; i <= zahl; i++) {
            if (Math.pow(2, i) > zahl) {
                exponent = i - 1;
                break;
            } else {
                exponent = i;
            }
        }

        //Print binary number:
        for (int i = exponent; i >= 0; i--) {
            if ((zahl & 1 << i) != 0) {
                System.out.print(1);
            } else {
                System.out.print(0);
            }
        }

    }

/*    //BUCHLÖSUNG:
    public static void main(String[] args) {
        int zahl = 10;

        for (int i = 31; i >= 0; --i) {
            if ((zahl & (1 << i)) != 0)
                System.out.print('1');
            else
                System.out.print('0');
            if (i % 8 == 0)
                System.out.print(' ');
        }

        System.out.println();
    }*/

}


