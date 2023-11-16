package de.javagrundlagen.Kapitel06.Aufgaben.Aufgabe08.Me;

public class Artikel {

    private int id;
    private double preis;

    Artikel(int id, double preis){
        this.id = id;
        this.preis = preis;
    }

    int getId(){
        return this.id;
    }

    void setId(int id){
        this.id = id;
    }

    double getPreis(){
        return this.preis;
    }

    void setPreis(double preis){
        this.preis = preis;
    }



}
