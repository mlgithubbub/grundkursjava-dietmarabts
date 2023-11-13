package de.javagrundlagen.Kapitel06.Beispiele;

public class KonstrTest {

    public static void main(String[] args) {
        Konto k1 = new Konto();
        Konto k2 = new Konto(4711);
        Konto k3 = new Konto(1234, 1000.);
        Konto k4 = new Konto(k3);

        k1.info();
        k2.info();
        k3.info();
        k4.info();

        new Konto(5678,2000.).info();
    }
}
