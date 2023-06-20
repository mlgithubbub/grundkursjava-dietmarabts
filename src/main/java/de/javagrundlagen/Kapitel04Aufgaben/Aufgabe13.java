package de.javagrundlagen.Kapitel04Aufgaben;

public class Aufgabe13 {
    /*
    Berechnen Sie die Quersumme einer vorgegebenen ganzen Zahl. Die Quersumme einer Zahl ist die Summe aller ihrer
    Ziffern.
     */

    //MY SOLUTION:
    public static void main(String[] args) {
        int zahl = 123456;
        int quersumme = 0;
        int digits = 0;
        int x = 1;

        //Get digits
        for (int i = 1; i <= zahl; i = i * 10){
            if (i > zahl){
                break;
            }
            else {
                digits = digits + 1;
            }
        }
        System.out.println(digits);

        //Get numbers
        System.out.print("The quersumme is: ");
        for (int j = 1; j <= digits; j++){
            x = x * 10;
            quersumme = quersumme + zahl%x/(x/10);
            System.out.print(zahl%x/(x/10) + " + ");
            zahl = zahl - zahl%x;
        }
        System.out.println("= " + quersumme);
    }

/*    //BUCHLÖSUNG:
    public static void main(String[] args) {
        int x = 12389;

        int quersumme = 0;
        while (x > 0) {
            quersumme = quersumme + x % 10;
            x = x / 10;
        }

        System.out.println("Quersumme: " + quersumme);
    }*/
}
