package de.javagrundlagen.Kapitel06.Beispiele;

public class ZaehlerTest {
    private static int zaehler;

    public ZaehlerTest(){
        zaehler++;
    }

    public static void main(String[] args) {
        new ZaehlerTest();
        new ZaehlerTest();
        new ZaehlerTest();
        System.out.println(ZaehlerTest.zaehler);
    }
}
