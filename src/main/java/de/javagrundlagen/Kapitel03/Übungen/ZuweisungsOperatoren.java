package de.javagrundlagen.Kapitel03.Übungen;

public class ZuweisungsOperatoren {

    public static void main(String[] args) {
        int x = 5;
        int y = 2;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println();

        String xBin = Integer.toBinaryString(x);
        String yBin = Integer.toBinaryString(y);

        System.out.println(x + " += "+ y + ": " + plus(x,y));
        System.out.println(xBin + " += " + yBin + ": " + Integer.toBinaryString(plus(x,y)));
        System.out.println();

        System.out.println(x + " -= "+ y + ": " + minus(x,y));
        System.out.println(xBin + " -= " + yBin + ": " + Integer.toBinaryString(minus(x,y)));
        System.out.println();

        System.out.println(x + " *= "+ y + ": " + times(x,y));
        System.out.println(xBin + " *= " + yBin + ": " + Integer.toBinaryString(times(x,y)));
        System.out.println();

        System.out.println(x + " /= "+ y + ": " + dividedBy(x,y));
        System.out.println(xBin + " /= " + yBin + ": " + Integer.toBinaryString(dividedBy(x,y)));
        System.out.println();

        System.out.println(x + " %= "+ y + ": " + modulo(x,y));
        System.out.println(xBin + " %= " + yBin + ": " + Integer.toBinaryString(modulo(x,y)));
        System.out.println();

        System.out.println(x + " <<= "+ y + ": " + bitLeft(x,y));
        System.out.println(xBin + " <<= " + yBin + ": " + Integer.toBinaryString(bitLeft(x,y)));
        System.out.println();

        System.out.println(x + " >>= "+ y + ": " + bitRight(x,y));
        System.out.println(xBin + " >>= " + yBin + ": " + Integer.toBinaryString(bitRight(x,y)));
        System.out.println();

        System.out.println(x + " >>>= "+ y + ": " + bitRightWithNulls(x,y));
        System.out.println(xBin + " >>>= " + yBin + ": " + Integer.toBinaryString(bitRightWithNulls(x,y)));
        System.out.println();

        System.out.println(x + " &= "+ y + ": " + bitAnd(x,y));
        System.out.println(xBin + " &= " + yBin + ": " + Integer.toBinaryString(bitAnd(x,y)));
        System.out.println();

        System.out.println(x + " ^= "+ y + ": " + bitXor(x,y));
        System.out.println(xBin + " ^= " + yBin + ": " + Integer.toBinaryString(bitXor(x,y)));
        System.out.println();

        System.out.println(x + " |= "+ y + ": " + bitOr(x,y));
        System.out.println(xBin + " |= " + yBin + ": " + Integer.toBinaryString(bitOr(x,y)));
        System.out.println();

    }

    public static int plus(int x, int y){
        return x += y;
    }

    public static int minus(int x, int y){
        return x -= y;
    }

    public static int times(int x, int y){
        return x *= y;
    }

    public static int dividedBy(int x, int y){
        return x /= y;
    }

    public static int modulo(int x, int y){
        return x %= y;
    }

    public static int bitLeft(int x, int y){
        return x <<= y;
    }

    public static int bitRight(int x, int y){
        return x >>= y;
    }

    public static int bitRightWithNulls(int x, int y){
        return x >>>= y;
    }

    public static int bitAnd(int x, int y){
        return x &= y;
    }

    public static int bitXor(int x, int y){
        return x ^= y;
    }

    public static int bitOr(int x, int y){
        return x |= y;
    }
}
