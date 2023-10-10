package de.javagrundlagen.Kapitel04.Aufgaben;

public class Aufgabe14 {
    /*
    Schreiben Sie ein Programm, das den Body-Mass-Index (BMI) für die Bewertung des Körpergewichts eines Menschen (in kg)
    in Relation zu seiner Körpergröße (in m) berechnet:

    bmi = gewicht / (groesse * groesse)

    Geben Sie zusätzlich die folgenden Texte aus:
    Untergewicht (falls bmi < 18.5)
    Normalgewicht (falls bmi >= 18.5 und bmi < 25)
    Übergewicht (falls bmi >= 25 und bmi < 30)
    Adipositas (falls bmi >= 30)

     */

    //MY SOLUTION:
    public static void main(String[] args) {
        double gewicht = 49.2;
        double groesse = 1.63;
        double bmi = gewicht / (groesse * groesse);
        double maxIdealWeight = 24.99 * groesse * groesse;
        double minIdealWeight = 18.5 * groesse * groesse;
        double minWeightLoss = gewicht - maxIdealWeight;
        double maxWeightLoss = gewicht - minIdealWeight;

        System.out.println("Your bmi is: " + bmi);
        if (bmi >= 30) {
            System.out.println("Adipositas");
            System.out.println("You need to lose " + minWeightLoss + "-"+ maxWeightLoss + " kg!");
        } else if (bmi < 30 && bmi >= 25) {
            System.out.println("Übergewicht");
            System.out.println("You need to lose " + minWeightLoss + "-"+ maxWeightLoss + " kg!");
        } else if (bmi < 25 && bmi >= 18.5) {
            System.out.println("Normalgewicht");
        } else {
            System.out.println("Untergewicht");
        }
    }

/*    //BUCHLÖSUNG:
    public static void main(String[] args) {
        double weight = 56.;
        double height = 1.7;

        double bmi = weight / (height * height);

        String text = "";
        if (bmi < 18.5) {
            text = "Untergewicht: " + bmi;
        } else if ((bmi >= 18.5) && (bmi < 25)) {
            text = "Normalgewicht: " + bmi;
        } else if ((bmi >= 25) && (bmi < 30)) {
            text = "Übergewicht: " + bmi;
        } else if (bmi >= 30) {
            text = "Adipositas: " + bmi;
        }

        System.out.println(text);
    }*/
}
