package de.javagrundlagen.Kapitel03.Beispiele;

public class BitOp {

    public static void main(String[] args) {
        int x, y;

        x = 0b10101010;
        y = 0b11110000;
        // 10100000
        x &= y;
        System.out.println(x);

        x = 0b10101010;
        y = 0b00001111;
        // 10101111
        x |= y;
        System.out.println(x);

        x = 0b10101010;
        y = 0b10010000;
        // 00111010
        x ^= y;
        System.out.println(x);
    }
}
