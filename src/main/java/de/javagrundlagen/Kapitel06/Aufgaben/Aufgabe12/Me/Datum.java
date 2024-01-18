package de.javagrundlagen.Kapitel06.Aufgaben.Aufgabe12.Me;

import de.javagrundlagen.Kapitel06.Aufgaben.Aufgabe11.Me.DaysInMonth;

//Schreiben Sie eine Klasse Datum, die die Attribute tag, monat und jahr hat, mit einem Konstruktor für diese drei
// Attribute. Implementieren Sie die Methode display, die ein gültiges Datum formatiert ausgibt. Nutzen Sie die
// Methode tage in Aufgabe 11, um zu prüfen, ob es sich um ein gültiges Datum handelt.
public class Datum {
    int tag;
    int monat;
    int jahr;

    Datum(int tag, int monat, int jahr){
        this.tag = tag;
        this.monat = monat;
        this.jahr = jahr;
    }


    public void display(){
        if (monat >= 0 && monat <= 12 && jahr >= 0 && tag >0 && tag <= DaysInMonth.tage(jahr, monat)){
            System.out.println("European date: " + tag + "/" + monat + "/" + jahr);
        } else {
            System.out.println("Invalid date!");
        }
    }

    public static void main(String[] args) {
        Datum myDate = new Datum(28,2,2024);
        myDate.display();
    }
}
