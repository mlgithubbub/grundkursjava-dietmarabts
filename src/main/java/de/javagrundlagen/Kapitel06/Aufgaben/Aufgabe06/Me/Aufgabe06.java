package de.javagrundlagen.Kapitel06.Aufgaben.Aufgabe06.Me;

//Aufgabe 6: Erstellen Sie die Klasse Beleg, deren Objekte bei ihrer Erzeugung automatisch eine bei der Zahl 10000
// beginnende laufende Belegnummer erhalten. Tipp: Verwenden Sie eine Klassenvariable.
public class Aufgabe06 {
    public static void main(String[] args) {
        Beleg beleg1 = new Beleg();
        //These two lines of code no longer work once the Beleg class attributes are set to private
        //System.out.println(beleg1.belegNummer);
        System.out.println(beleg1.getBelegNummer());
        Beleg beleg2 = new Beleg();
        //System.out.println(beleg2.belegNummer);
        System.out.println(beleg2.getBelegNummer());
        Beleg beleg3 = new Beleg();
        System.out.println(beleg3.getBelegNummer());
    }




}
