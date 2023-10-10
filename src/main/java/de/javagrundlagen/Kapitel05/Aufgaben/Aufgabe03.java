package de.javagrundlagen.Kapitel05.Aufgaben;

public class Aufgabe03 {
    /*Implementieren Sie die Matrizenmultiplikation für zweidimensionale double-Arrays A und B. A ist eine
    1xm-Matrix, B eine mxn Matrix. Das Ergebnis C ist eine 1xn-Matrix.

    Zur Berechnung wird das Schema Zeile mal Spalte angewandt: Das Ergebnis des Elements der i-ten Zeile
     und der
    k-ten Spalte von c ergibt sich aus der Multiplikation der Werte der i-ten Zeile von A
    mit den Werten der k-ten
    Spalte von B, wobei die einzelnen Produkte aufaddiert werden.*/

    /*  ASSIGNMENT: MULTIPLY EACH ENTIRE ROW IN A BY EACH ENTIRE COLUMN IN B, SUM PRODUCTS AND SAVE IN C
     # OF COLUMNS IN C = # OF COLUMNS IN B
     # OF ROWS IN C = # OF ROWS IN A
     # OF COLUMNS IN A MUST EQUAL # OF ROWS IN B
     */

    //MY SOLUTION:
    public static void main(String[] args) {

        double[][] A = {{5, 1, 0}, {2, 3, 9}};
        double[][] B = {{0, 1, 2, 0, 1}, {5, 1, 2, 3, 1}, {1, 3, 2, 4, 2}};
        double[][] C = new double[A.length][B[0].length];

        //FOR EACH ROW IN A
        for (int i = 0; i < A.length; i++) { //l
            //FOR EACH COLUMN ITEM IN B
            for (int k = 0; k < B[0].length; k++) { //n
                //FOR EACH ROW ITEM IN B
                for (int j = 0; j < B.length; j++) { //m
                    System.out.println("(" + A[i][j] + " * " + B[j][k] + ")" + " = " + (A[i][j] * B[j][k]));
                    C[i][k] += A[i][j] * B[j][k];
                }
                System.out.println(" = " + C[i][k]);
            }
        }

        for (int i = 0; i < A.length; i++) {
            for (int k = 0; k < B[0].length; k++) {
                System.out.print(C[i][k] + " ");
            }
            System.out.println();
        }
    }
}


    //BOOK SOLUTION:
/*    public static void main(String[] args) {

        int l = 2, m = 3, n = 4;

        double[][] A = {{1., 2., 3.}, {4., 5., 6.}};
        double[][] B = {{0., 1., 2., 1}, {2., 1., 3., 2.}, {1., 0., 4., 1.}};

        double[][] C = new double[l][n];

        for (int i = 0; i < l; i++) {
            for (int k = 0; k < n; k++) {
                for (int j = 0; j < m; j++) {
                    C[i][k] += A[i][j] * B[j][k];
                }
            }
        }

        for (int i = 0; i < l; i++) {
            for (int k = 0; k < n; k++) {
                System.out.print(C[i][k] + " ");
            }
            System.out.println();
        }
    }
}*/


/*ALTERNATIVE ASSIGNMENT: MULTIPLY EACH ENTIRE ROW IN A BY EACH ENTIRE ROW IN B, SUM PRODUCTS AND SAVE IN C
 * # OF COLUMNS IN C = # OF ROWS IN B
 * # OF ROWS IN C = # OF ROWS IN A
 * # OF COLUMNS IN A MUST EQUAL # OF COLUMNS IN B*/

/*ALTERNATIVE ASSIGNMENT: MULTIPLY EACH ITEM IN ROW IN A BY EACH ITEM IN ROW IN B, SUM PRODUCTS AND SAVE IN C
 * # OF COLUMNS IN C = # OF COLUMNS IN A
 * # OF ROWS IN C = # OF ROWS IN A*/

/*ALTERNATIVE ASSIGNMENT: MULTIPLY EACH ITEM IN ROW IN A BY EACH ITEM IN COLUMN IN B, SUM PRODUCTS AND SAVE IN C
 * # OF COLUMNS IN C = # OF COLUMNS IN A
 * # OF ROWS IN C = # OF ROWS IN A
 * # OF COLUMNS IN A MUST EQUAL # OF COLUMNS IN B*/


















