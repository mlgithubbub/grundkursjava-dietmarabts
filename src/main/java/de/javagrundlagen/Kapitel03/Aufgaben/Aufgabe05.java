package de.javagrundlagen.Kapitel03.Aufgaben;

public class Aufgabe05 {

    /*
    FRAGE
    Welche Werte haben die folgenden Ausdrücke und welche Werte haben die Variablen nach der Auswertung,
    wenn a den Anfangswert 1 und b den Anfangswert 7 hat?

    a) --a
    b) a--
    c) a++ + b
    d) b = ++a
    e) a = b++
    f) -(a--) - -(--b)
    g) a++ + ++a + a++

    ANTWORT
    Wert --> Wert nach der Auswertung
    a) 0 --> 0
    b) 1 --> 0
    c) 0 + 7 = 7 --> 1 + 7 = 8
    d) b = 2 --> b = 2
    e) a = 7 --> a = 8
    f) -7 --> -6
    g) 4 --> 6
    */

    //Check Answer:
    public static void main(String[] args) {

        int a = 1;
        int b = 7;

        System.out.println("a) --a => "+ --a + ", a = "+ a + ", b = "+ b);

        a = 1;
        b = 7;
        System.out.println("b) a-- => "+ a-- + ", a = "+ a + ", b = "+ b);

        a = 1;
        b = 7;
        System.out.println("c) a++ + b => "+ (a++ + b) + ", a = "+ a + ", b = "+ b);

        a = 1;
        b = 7;
        System.out.println("d) b = ++a => "+ (b = ++a) + ", a = "+ a + ", b = "+ b); //Not sure what the = does here?

        a = 1;
        b = 7;
        System.out.println("e) a = b++ => "+ (a = b++) + ", a = "+ a + ", b = "+ b); //Not sure what the = does here?

        a = 1;
        b = 7;
        System.out.println("f) -(a--) - -(--b) => "+ (-(a--) - -(--b)) + ", a = "+ a + ", b = "+ b);

        a = 1;
        b = 7;
        System.out.println("g) a++ + ++a + a++ => "+ (a++ + ++a + a++) + ", a = "+ a + ", b = "+ b);

    }



}
