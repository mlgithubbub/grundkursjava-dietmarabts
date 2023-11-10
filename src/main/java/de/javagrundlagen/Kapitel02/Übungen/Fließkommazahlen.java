package de.javagrundlagen.Kapitel02.Übungen;

public class Fließkommazahlen {

    public static void main(String[] args) {

        //Vorkomma-Teil + Dezimalpunkt + Nachkomma-Teil + Exponenten + Suffix
        //mindestens der Dezimalpunkt, der Exponent oder das Suffix
        float float1 = 1.1f; //OR F
        float float2 = 1e10F; //OR f
        float float3 = 1f; //OR F

        System.out.println(float1);
        System.out.println(float2);
        System.out.println(float3);

        double double1 = 1.2d; //OR D
        double double2 = 1e10D; //OR d
        double double3 = 1d; //OR D

        System.out.println(double1);
        System.out.println(double2);
        System.out.println(double3);

        //Entweder Vorkomma-Teil oder Nachkomma-Teil darf wegfallen
        float float4 = 1.f;
        float float5 = .5F;
        double double4 = 1.d;
        double double5 = .5D;

        System.out.println(float4);
        System.out.println(float5);
        System.out.println(double4);
        System.out.println(double5);

        //Exponent und Suffix sind optional-- REALLY?!

    }
}
