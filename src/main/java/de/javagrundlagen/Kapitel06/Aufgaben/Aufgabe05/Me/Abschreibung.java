package de.javagrundlagen.Kapitel06.Aufgaben.Aufgabe05.Me;


//Aufgabe 5: Erstellen Sie eine Klasse Abschreibung, die den Anschaffungspreis, die Anzahl der Nutzungsjahre und den
// Abschreibungssatz enthält. Vereinbaren sie zwei Konstruktoren und die beiden Abschreibungsmethoden: lineare und
// geometrisch-degressive Abschreibung. Die Buchwerte für die einzelnen Jahre sollen am Bildschirm ausgegeben werden.
// Testen Sie die Methode dieser Klasse.
public class Abschreibung {

    double anschaffungspreis;
    int nutzungsjahre;
    double abschreibungssatz;

    Abschreibung(double anschaffungspreis, int nutzungsjahre){
        this.anschaffungspreis = anschaffungspreis;
        this.nutzungsjahre = nutzungsjahre;
    }
    Abschreibung(double anschaffungspreis, int nutzungsjahre, double abschreibungssatz){
        this.anschaffungspreis = anschaffungspreis;
        this.nutzungsjahre = nutzungsjahre;
        this.abschreibungssatz = abschreibungssatz;
    }

    //Book uses this. for all of the attributes accessed in the methods...
    void abschreibenLinear(){
        //Book solution casts the integer nutzungsjahre to a double
        double abschreibung = anschaffungspreis/nutzungsjahre;
        //Book solution uses ++i instead of i++
        //In ++i, the variable is used first and then raised
        for (int i = 1; i <= nutzungsjahre; i++){
                System.out.println("Year " + i + ": " + anschaffungspreis + " - " + abschreibung + " = " + (anschaffungspreis - abschreibung));
                anschaffungspreis = anschaffungspreis - abschreibung;
        }
    }

    void abschreibenGeometrischDegressive(){
        double abschreibung;
        for (int i = 1; i <= nutzungsjahre; i++){
            abschreibung = anschaffungspreis*abschreibungssatz;
            System.out.println("Year " + i + ": " + anschaffungspreis + " - " + abschreibung + " = " + (anschaffungspreis - abschreibung));
            anschaffungspreis = anschaffungspreis - abschreibung;
        }

    }


}
