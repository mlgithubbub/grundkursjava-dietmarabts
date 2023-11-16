package de.javagrundlagen.Kapitel06.Aufgaben.Aufgabe08.Me;

public class Auftrag {

    //Wrong, need to have an artikel object as an attribute instead
    //private int articleId;

    private Artikel artikel;

    private int menge;


    Auftrag(Artikel artikel, int menge){
        this.artikel = artikel;
        this.menge = menge;
    }

    Artikel getArticle(){
        return this.artikel;
    }

    void setArtikel(Artikel artikel){
        this.artikel = artikel;
    }

    int getMenge(){
        return this.menge;
    }

    void setMenge(int menge){
        this.menge = menge;
    }

    public static double getGesamtwert(Auftrag...auftraege){
        double gesamtwert = 0;
        for (Auftrag auftrag:auftraege){
            gesamtwert += auftrag.artikel.getPreis() * auftrag.menge;
        }
        return gesamtwert;
    }
}
