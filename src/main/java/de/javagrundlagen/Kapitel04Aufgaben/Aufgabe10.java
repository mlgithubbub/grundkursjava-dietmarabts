package de.javagrundlagen.Kapitel04Aufgaben;

public class Aufgabe10 {
    /*
    Schreiben Sie ein Programm, das eine Treppe aus h Stufen einer bestimmte Breite b in der folgenden Form zeichnet
    (Ausgabe von Leerzeichen und "*" auf der Konsole):

                               *** (3)
                            ****** (6)
                         ********* (9)
                      ************ (12)
                   *************** (15)
                ****************** (18)
             ********************* (21)
          ************************ (24)
       *************************** (27)
    ****************************** (30)
     */

    //MY SOLUTION:
    public static void main(String[] args) {
        int breite = 40;
        int stufen = 10;
        int schritt = breite/stufen;


        //Print row: first spaces, then stars
        for (int x = 1; x <= stufen; x++){
            //Print spaces
            for (int i = 1; i <= breite - schritt * x; i++){
                System.out.print(" ");
            }
            //Print stars
            for (int j = 1; j <= schritt * x; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*//BUCHLÖSUNG:
    public static void main(String[] args) {
        int h = 10;
        int b = 3;

        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= h - i; j++) {
                for (int k = 1; k <= b; k++) {
                    System.out.print(" ");
                }
            }

            for (int j = 1; j <= i; j++) {
                for (int k = 1; k <= b; k++) {
                    System.out.print("*");
                }
            }

            System.out.println();
        }
    }*/
}
