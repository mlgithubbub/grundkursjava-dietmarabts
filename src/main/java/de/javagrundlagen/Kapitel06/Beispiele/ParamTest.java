package de.javagrundlagen.Kapitel06.Beispiele;

public class ParamTest {

    public void test(double betrag, Konto kto){
        betrag += 100.;
        kto.zahleEin(betrag);
    }

    public static void main(String[] args) {
        ParamTest p = new ParamTest();

        double wert = 1000.;
        Konto konto = new Konto();

        System.out.println("Vorher: wert=" + wert + " saldo=" + konto.getSaldo());
        p.test(wert, konto);
        System.out.println("Nachher: wert=" + wert + " saldo=" + konto.getSaldo());
    }
}
