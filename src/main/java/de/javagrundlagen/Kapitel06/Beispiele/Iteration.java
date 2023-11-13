package de.javagrundlagen.Kapitel06.Beispiele;

public class Iteration {

    public static long sum(int n){
        long sum = 0;
        for(int i = 1; i <= n; i++){
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(100));
    }
}
