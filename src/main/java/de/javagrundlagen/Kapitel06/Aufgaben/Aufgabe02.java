package de.javagrundlagen.Kapitel06.Aufgaben;

public class Aufgabe02 {

    //Besitzt folgende Klass einen Standardkonstruktor?

    public class A{
        private int a;

        public A(int i){
            a = i;
        }
    }
    // My answer:
    //No, because a custom constructor is defined.

    //LÖSUNG:
//    Nein!
//
//    Ist ein Konstruktor mit oder ohne Parameter explizit definiert,
//    so erzeugt der Compiler keinen Standardkonstruktor mehr.

}
