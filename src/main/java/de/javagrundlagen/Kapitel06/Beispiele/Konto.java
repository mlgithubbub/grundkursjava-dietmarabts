package de.javagrundlagen.Kapitel06.Beispiele;

public class Konto {
    //Attribute:
    private int kontonummer;
    private double saldo;

    //Get-/Set-Methoden
    public int getKontonummer() {
        return kontonummer;
    }

    public void setKontonummer(int nr) {
        kontonummer = nr;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double betrag) {
        saldo = betrag;
    }

    //Methoden, die den Saldo erhöhen/vermindern
    public void zahleEin(double betrag) {
        saldo += betrag;
    }

    public void zahleAus(double betrag) {
        saldo -= betrag;
    }

    //Methode, die die Attributwerte ausgibt
    public void info() {
        System.out.println("Kontonummer: " + kontonummer + " Saldo: " + saldo);
    }
}

