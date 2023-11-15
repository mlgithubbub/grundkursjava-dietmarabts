package de.javagrundlagen.Kapitel06.Aufgaben.Aufgabe04.Me;

//Aufgabe 4: Implementieren Sie die Klasse Sparbuch mit den Attributen
// kontonummer
// kapital
// zinssatz

// und den folgenden Methoden:

// zahleEin: erhöht das Guthaben um einen bestimmten Betrag
// hebeAb: vermindert das Guthaben um einen bestimmten Betrag
// getErtrag: berechnet das Kapital mit Zins und Zinsezins nach einer vorgegebenen Laufzeit
// verzinse: erhöht das Guthaben um den Jahreszins
// getKontonummer: liefert die Kontonummer
// getKapital: liefert das Guthaben
// getZinssatz: liefert den Zinssatz

// Testen Sie die Methoden dieser Klasse
public class Sparbuch {

    //I should have created a constructor to input these values
    private String kontonummer = "0123456789";
    private double kapital;
    //It appears that "zinssatz" is the value not yet divided by 100?
    private double zinssatz = .003;


    //Did I need to use this.kapital?
    //I didn't need to print to the console or return any values, I only needed to change the attribute value for
    // kapital
    double zahleEin(double einzahlung){
        kapital = kapital + einzahlung;
        System.out.println("You have deposited " + einzahlung + " into your account with a balance of " + kapital +
                ". You now have a balance of ");
        return kapital;
    }

    double hebeAb(double abhebung){
        double neuesGuthaben = kapital - abhebung;
        if ((neuesGuthaben) < 0){
            System.out.println("You have withdrawn " + abhebung + " from your account with a balance of " + kapital + "." +
                    " You now have a balance of ");
            kapital = 0;
            return 0;
        }
        System.out.println("You have withdrawn " + abhebung + " from your account with a balance of " + kapital + "." +
                " You now have a balance of ");
        kapital = neuesGuthaben;
        return neuesGuthaben;
    }

    double getErtrag(int laufzeitTage){
        double startkapital = kapital;
        for (int i = 0; i <= laufzeitTage; i++){
             kapital = kapital + (kapital * zinssatz);
        }
        System.out.println("After " + laufzeitTage + " days, your account with a starting balance of " + startkapital +
                " and an interest rate of " + zinssatz + " has a new balance of ");
        return kapital;
    }

    double verzinse(){
        double startkapital = kapital;
        for (int i = 1; i <= 365; i++){
            kapital = kapital + (kapital * zinssatz);
        }
        System.out.println("After 365 days, your account with a starting balance of " + startkapital +
                " and an interest rate of " + zinssatz + " has a new balance of ");
        return kapital;
    }

    //Should I have used this.? I.e., this.kontonummer?
    String getKontonummer(){
        System.out.println("Your account number is ");
        return kontonummer;
    }

    double getKapital(){
        System.out.println("Your account balance is ");
        return kapital;
    }

    double getZinssatz(){
        System.out.println("Your interest rate is ");
        return zinssatz;
    }


    public static void main(String[] args) {

        Sparbuch myAccount = new Sparbuch();

        System.out.println(myAccount.getKontonummer());
        System.out.println(myAccount.getKapital());
        System.out.println(myAccount.getZinssatz());
        System.out.println(myAccount.zahleEin(100));
        System.out.println(myAccount.getErtrag(15));
        System.out.println(myAccount.hebeAb(50));
        System.out.println(myAccount.verzinse());
        System.out.println(myAccount.getKapital());
    }

}
