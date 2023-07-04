package de.javagrundlagen.Kapitel04;

public class Aufgabe07 {

    /*
    Es soll der größte gemeinsame Teiler von zwei positiven ganzen Zahlen p und q mit Hilfe des Euklidischen
    Algorithmus ermittelt werden. Dieses Verfahren kann wie folgt beschrieben werden:
    (1) Belege p mit einer positiven ganzen Zahl.
    (2) Belege q mit einer positiven ganzen Zahl.
    (3) Ist p > q, dann weiter mit (4), sonst mit (5).
    (4) Vertausche die Belegung von p und q.
    (5) Ist q = 0, dann weiter mit (9), sonst mit (6).
    (6) Belege r mit dem Rest der Division p durch q.
    (7) Belege p mit dem Wert von q.
    (8) Belege q mit dem Wert von r, dann weiter mit (5).
    (9) Notiere die Belegung von p als Ergebnis und beende.
    Schreiben Sie hierzu ein Programm.
     */

    //MY SOLUTION:
    public static void main(String[] args) {
        int p = 5;
        int q = 8;
        int z; //Note: initializer 0 is redundant
        int r; //Note: initializer 0 is redundant


        if (p < q) {
            z = p;
            p = q;
            q = z;
        }

        while (q != 0) {
//            System.out.println();
            r = p % q;
//            System.out.println("r is " + r);
            p = q;
//            System.out.println("p is " + p);
            q = r;
//            System.out.println("q is " + q);
//            System.out.println();
        }
        System.out.println("p = " + p);
    }

/*    //BUCHLÖSUNG:
    public static void main(String[] args) {
        int p = 5;
        int q = 8;

        if (p < q) {
            int h = p;
            p = q;
            q = h;
        }

        int r;
        while (q != 0) {
            r = p % q;
            p = q;
            q = r;
        }

        System.out.println(p);
    }*/
}
