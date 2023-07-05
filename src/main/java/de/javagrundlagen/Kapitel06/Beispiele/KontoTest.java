package de.javagrundlagen.Kapitel06.Beispiele;

public class KontoTest {
    public static void main(String[] args) {
        // Ein Objekt der Klasse Konto wird erzeugt.
        Konto meinKonto = new Konto();

        // Für dieses Objekt werden einige Methoden angewandt.
        meinKonto.setKontonummer(4711);
        meinKonto.setSaldo(500.);
        meinKonto.zahleEin(10000.);
        double saldo = meinKonto.getSaldo();
        System.out.println("Saldo: " + saldo);
    }
}
