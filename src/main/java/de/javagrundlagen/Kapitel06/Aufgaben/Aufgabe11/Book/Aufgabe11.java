package de.javagrundlagen.Kapitel06.Aufgaben.Aufgabe11.Book;

public class Aufgabe11 {

    public Aufgabe11() {
    }

    public static void main(String[] args) {
        int jahr = 2020;

        for(int m = 1; m <= 12; ++m) {
            System.out.println("Jahr: " + jahr + ", Monat: " + m + ", Anzahl Tage: " + tage(jahr, m));
        }

    }

    public static boolean schaltjahr(int jahr) {
        return jahr % 4 == 0 && (jahr % 100 != 0 || jahr % 400 == 0);
    }

    public static int tage(int jahr, int monat) {
        if (monat > 0 && monat <= 12) {
            switch (monat) {
                case 2:
                    if (schaltjahr(jahr)) {
                        return 29;
                    }

                    return 28;
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                default:
                    return 31;
                case 4:
                case 6:
                case 9:
                case 11:
                    return 30;
            }
        } else {
            return 0;
        }
    }
}
