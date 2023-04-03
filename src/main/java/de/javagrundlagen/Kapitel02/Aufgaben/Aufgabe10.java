package de.javagrundlagen.Kapitel02.Aufgaben;

/*Schreiben Sie ein Programm, das eine ganze Zahl
vom Typ int in Binärdarstellung (32 Bit) ausgibt.
Benutzen Sie hierzu die Bitoperatoren & und <<.

Tipp: Das Bit mit der Nummer i (Nummerierung beginnt bei 0)
in der Binärdarstellung von 'zahl' hat den Wert 1 genau dann,
wenn der Ausdruck 'zahl' & (1<<i) von 0 verschieden ist.
* */
public class Aufgabe10 {

    public static void main(String[] args) {

        int zahl = 36;
        int binaryIndex = 0;


        for (int n = 0; Math.pow(2,n)<= zahl; n++){
            binaryIndex = n;
        }

        for (int i=binaryIndex;i>=0;i--){
            if ((zahl&1<<i) != 0){
                System.out.print(1);
            }
            else{
                System.out.print(0);
            }
        }


}}
