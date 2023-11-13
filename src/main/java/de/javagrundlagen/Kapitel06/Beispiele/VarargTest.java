package de.javagrundlagen.Kapitel06.Beispiele;

public class VarargTest {

    public static void main(String[] args) {
        System.out.println(sum(1,2));
        System.out.println(sum(1,10,100,1000));
        System.out.println(sum());
        System.out.println(min(3,5,2));
    }

    public static int sum(int... values){
        int sum = 0;
        for(int v : values){
            sum += v;
        }
        return sum;
    }

    public static int min(int firstValue, int... remainingValues) {
        int min = firstValue;
        for (int v : remainingValues) {
            if (v < min) {
                min = v;
            }
        }
        return min;
    }
}
