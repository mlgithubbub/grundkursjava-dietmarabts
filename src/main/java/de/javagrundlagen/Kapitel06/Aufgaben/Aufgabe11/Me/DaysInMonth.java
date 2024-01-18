package de.javagrundlagen.Kapitel06.Aufgaben.Aufgabe11.Me;

//Die Methode int tage(int jahr, int monat) soll die Anzahl der Tage des angegebenen Monats im angegebenen Jahr
// zurückgeben. Bei ungültiger Monatszahl soll 0 zurückgegeben werde. Berücksichtigen Sie zur Ermittlung der Anzahl
// Tage des Monats Februar, ob das angegebene Jahr ein Schaltjahr ist( siehe Aufgabe 12 aus Kapitel 4).
public class DaysInMonth {

    public static int tage(int jahr, int monat){

        switch (monat){
            case 1, 3, 5, 7, 8, 10, 12:
                return 31;
            case 2:
                return jahr%4== 0 && jahr%100 !=0 && jahr%400 ==0?  29:28; //https://airandspace.si.edu/stories/editorial/science-leap-year
            case 4, 6, 9, 11:
                return 30;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        DaysInMonth dim = new DaysInMonth();
        System.out.println(dim.tage(2023,2));
        System.out.println(dim.tage(2024, 2));
        System.out.println(dim.tage(2001,12));
        System.out.println(dim.tage(2017,2)); //skipped leap year
        System.out.println(dim.tage(2017, 21)); //not a month
    }
}
