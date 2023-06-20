package de.javagrundlagen.Kapitel04Aufgaben;

public class Aufgabe09 {

    /*
    Schreiben Sie ein Programm, das eine Tabelle mit dem kleinen Einmaleins (also 1*1 bis 10*10) angeordnet
    in zehn Zeilen mit je zehn Spalten ausgibt.
     */

    // MY SOLUTION:
    public static void main(String[] args) {
        int variableSpaces; //Warning: Variable 'variableSpaces' initializer '0' is redundant
        for (int i = 1; i <= 10; i++){
            for (int j = 1; j <= 10; j++) {
                System.out.print((j * i));
                if ((j*i) >= 10){
                    variableSpaces = 3;
                } else{
                    variableSpaces = 4;
                }
                for (int k = 0; k <= variableSpaces; k++){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

/*    //BUCHLÖSUNG:
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }*/
}
