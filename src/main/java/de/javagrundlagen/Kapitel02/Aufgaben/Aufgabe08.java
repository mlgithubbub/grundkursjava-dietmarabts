package de.javagrundlagen.Kapitel02.Aufgaben;

/*Berechnen Sie den kleinsten ganzahligen Wert von n,
sodass 2^n größer oder gleich einer vorgegebenen ganzen Zahl x ist.
Beispiel: Für x = 15 ist n = 4.
* */
public class Aufgabe08 {

    public static void main(String[] args) {

        int x = 40;

       for (int n = 1; n <= 10; n++){
           if (Math.pow(2,n)>x) {
               System.out.println("2^"+ (n-1) + " = " + Math.pow(2,n-1));
               System.out.println("2^"+ n+ " = " + Math.pow(2,n));
               System.out.println("n is " + n);
               break;
           }
       }

    }
}
