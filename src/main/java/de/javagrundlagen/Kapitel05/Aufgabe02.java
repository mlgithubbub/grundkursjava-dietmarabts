package de.javagrundlagen.Kapitel05;

public class Aufgabe02 {
    /*Schreiben Sie ein Programm, das ein int-Array von 20 x 20 Elementen erzeugt und jedes Element mit dem Produkt
    seiner Indizes initialisiert.*/

    //MY SOLUTION:
    public static void main(String[] args) {

        int[][] twentyByTwenty = new int[20][20];

        for (int i = 1; i < twentyByTwenty.length; i++){
            for (int j = 1; j < twentyByTwenty[i].length; j++){
                twentyByTwenty[i][j] = i * j;
            }
        }

        for (int[] subArray: twentyByTwenty){
            for (int arrayItem : subArray){
                System.out.print(arrayItem + "\t");
            }
            System.out.println();
        }
    }

    //BOOK SOLUTION:
/*    public static void main(String[] args) {
        int[][] x = new int[20][20];

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                x[i][j] = i * j;
                System.out.print(x[i][j] + " ");
            }
            System.out.println();
        }
    }*/
}
