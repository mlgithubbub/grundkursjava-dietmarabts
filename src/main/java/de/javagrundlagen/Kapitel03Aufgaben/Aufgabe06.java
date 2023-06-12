package de.javagrundlagen.Kapitel03Aufgaben;

public class Aufgabe06 {
    /*
    Schreiben Sie ein Programm, das auf Basis eines vorgegebenen Radius den Durchmesser, den Umfang
    und die Fläche eines Kreise berechnet. Die Zahl pi soll den angenäherten Wert 3.14159 haben.
     */

    public static void main(String[] args) {
        double radius = 5;
        double diameter = radius * 2;
        double pi = 3.14159;
        double circumference = diameter * pi;
        double area = pi * radius * radius;

        System.out.println("The diameter of the circle is: " + diameter);
        System.out.println("The circumference of the circle is: " + circumference);
        System.out.println("The area of the circle is: " + area);
    }
}
