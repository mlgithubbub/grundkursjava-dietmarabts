package de.javagrundlagen.Kapitel05.Beispiele;

public class Matrix {

    public static void main(String[] args) {

        int[][] x = {{1, 2, 3}, {4, 5, 6}};

        System.out.println(x.length);

        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i].length);
        }

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.print("(" + i + "," + j + "): " + x[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
