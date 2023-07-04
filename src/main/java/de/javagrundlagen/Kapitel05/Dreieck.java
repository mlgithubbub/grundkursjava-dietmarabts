package de.javagrundlagen.Kapitel05;

public class Dreieck {

    public static void main(String[] args) {
        int[][] x = {{1},{1,2},{1,2,3},{1,2,3,4},{1,2,3,4,5}};

        for(int i = 0; i < x.length; i++){
            for (int j = 0; j < x[i].length; j++){
                System.out.print(x[i][j]);
            }
            System.out.println();
        }

        // Variante mit foreach:
        for (int[] a : x){
            for (int b : a){
                System.out.print(b);
            }
            System.out.println();
        }
    }
}
