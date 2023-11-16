package de.javagrundlagen.Kapitel06.Aufgaben.Aufgabe09.Me;

//Aufgabe 9:

// B) Innerhalb des Rumpfs einer Methode kann sich die Methode selbst aufrufen (Rekursion). Implementieren Sie die
// Methode aus A) rekursiv. Bezeichnet k(n) das Gesamtkapital nach n Jahren (n >= 0), dann gilt:
// k(0) = kapital
// k(n) = k(n-1) * (1 + zinssatz) für n > 0
// Bei der Lösung wird eine Fallunterscheidung getroffen:
// Hat jahre den Wert 0, wird kapital zurückgegeben. In allen anderen Fällen erfolgt ein Selbstaufruf der Methode,
// wobei jedoch der Wert des dritten Parameters um 1 vermindert ist. Zurückgegeben wird das Produkt aus (1 +
// zinssatz) und dem Rückgabewert der aufgerufenen Methode.

public class Aufgabe09B {

    public static void main(String[] args) {
       double zinsen = zinsen(1000,.015, 1);
        System.out.println(zinsen);
    }

    public static double zinsen(double kapital, double zinssatz, int jahre){
        if (jahre == 0){
            return kapital;
        }
        else{
            return zinsen(kapital,zinssatz,jahre-1) * (1 + zinssatz);
        }
    }

}
