package de.javagrundlagen.Kapitel06.Beispiele;

public class Konto {
    //Constructors
    public Konto(){}

//    Konto(int kontonummer){
//        this.kontonummer = kontonummer;
//    }

    //This constructor is the same as the above constructor
    public Konto(int kontonummer){
        this(kontonummer, 0.);
    }

    public Konto(int kontonummer, double saldo){
        this.kontonummer = kontonummer;
        this.saldo = saldo;
    }

    public Konto(Konto k){
        kontonummer = k.kontonummer;
        saldo = k.saldo;
    }
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

