package de.javagrundlagen.Kapitel06.Aufgaben.Aufgabe08.Book;

public class Auftrag {

    private Artikel artikel;
    private int menge;

    public Auftrag(Artikel artikel, int menge) {
        this.artikel = artikel;
        this.menge = menge;
    }

    public Artikel getArtikel() {
        return this.artikel;
    }

    public void setArtikel(Artikel artikel) {
        this.artikel = artikel;
    }

    public int getMenge() {
        return this.menge;
    }

    public void setMenge(int menge) {
        this.menge = menge;
    }

    public double getAuftragswert() {
        return (double)this.menge * this.artikel.getPreis();
    }

    public static double getGesamtwert(Auftrag... auftraege) {
        double gesamt = 0.0;
        Auftrag[] var3 = auftraege;
        int var4 = auftraege.length;

        for(int var5 = 0; var5 < var4; ++var5) {
            Auftrag a = var3[var5];
            gesamt += a.getAuftragswert();
        }

        return gesamt;
    }
}
