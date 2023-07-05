package de.javagrundlagen.Kapitel05.Beispiele;

public class Matrix2x3 {

    public static void main(String[] args) {

        //This is the same matrix...
        int[][] x = new int[2][3];

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.print("(" + i + "," + j + "): " + x[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println();

        // As this:
        int[][] y;
        y = new int[2][];
        for (int l = 0; l < 2; l++) {
            y[l] = new int[3];
        }

        for (int k = 0; k < x.length; k++) {
            for (int j = 0; j < x[k].length; j++) {
                System.out.print("(" + k + "," + j + "): " + x[k][j] + "\t");
            }
            System.out.println();
        }

    }
}
