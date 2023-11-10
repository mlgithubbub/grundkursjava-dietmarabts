package de.javagrundlagen.Kapitel03.Übungen;

public class BitOperatoren {

    public static void main(String[] args) {

        int binary1 = 0b1011;
        int binary2 = 0b1111;
        String binaryString1 = Integer.toBinaryString(binary1);
        String binaryString2 = Integer.toBinaryString(binary2);
        int stellen = 2;

        int twosComplement = ~binary1;
        String twosComplementString = Integer.toBinaryString(twosComplement);
        int onesComplement = binary1 ^ 0b1111;
        String onesComplementString = Integer.toBinaryString(onesComplement);
        int links = binary1 << stellen;
        String linksBiString = Integer.toBinaryString(links);
        int rechts = binary1 >> stellen;
        String rechtsBiString = Integer.toBinaryString(rechts);
        int rechtsMitNullen = binary1 >>> stellen;
        String rechtsMitNullenBiString = Integer.toBinaryString(rechtsMitNullen);
        int und = binary1 & binary2;
        String undBiString = Integer.toBinaryString(und);
        int xor = binary1 ^ binary2;
        String xorBiString = Integer.toBinaryString(xor);
        int or = binary1 | binary2;
        String orBiString = Integer.toBinaryString(or);

        System.out.println("The 32 bit 2's complement of " + binaryString1 + " (" + binary1 + ")" + " is: " + twosComplementString +
                " (" + twosComplement + ")");
        System.out.println("The 1's complement of " + binaryString1 + " (" + binary1 + ")" + " is: " + onesComplementString +
                " (" + onesComplement + ")");
        System.out.println();
        System.out.println(binaryString1 + " << " + stellen + " = " + linksBiString);
        System.out.println();
        System.out.println(binaryString1 + " >> " + stellen + " = " + rechtsBiString);
        System.out.println();
        System.out.println(binaryString1 + " >>> " + stellen + " = " + rechtsMitNullenBiString);
        System.out.println();
        System.out.println(binaryString1 + " & \n" + binaryString2 + " = \n" + undBiString);
        System.out.println();
        System.out.println(binaryString1 + " ^ \n" + binaryString2 + " = \n" + xorBiString);
        System.out.println();
        System.out.println(binaryString1 + " | \n" + binaryString2 + " = \n" + orBiString);
        System.out.println();
    }
}
