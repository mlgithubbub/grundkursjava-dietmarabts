package de.javagrundlagen.Kapitel04;

public class Aufgabe01 {
    public static void main(String[] args) {
        int givenStars = 101;
        int sumOfStars = 0;
        int usableStars = 0;
        int leftoverStars;
        int rows = 0;
        int starsInLastRow = 0;

        int starsPerRow = 1;
        int blankSpaces;
        int blankSpacesBeforeAndAfter;

        //Get usable stars, leftover stars and number of rows
        for (int i = 1; i <= givenStars; i = i + 2) {
            rows = rows + 1;
            sumOfStars = sumOfStars + i;
            if (sumOfStars > givenStars) {
                usableStars = sumOfStars - i;
                rows = rows - 1;
                starsInLastRow = i - 2;
                break;
            } else {
                usableStars = sumOfStars;
            }
        }
        leftoverStars = givenStars - usableStars;

        //Print triangle
        for (int i = 1; i <= rows; i++) {
            blankSpaces = starsInLastRow - starsPerRow;
            blankSpacesBeforeAndAfter = blankSpaces / 2;
            for (int k = 1; k <= blankSpacesBeforeAndAfter; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= starsPerRow; j++) {
                System.out.print("*");
            }
            for (int k = 1; k <= blankSpacesBeforeAndAfter; k++) {
                System.out.print(" ");
            }
            System.out.println();
            starsPerRow = starsPerRow + 2;
        }
        System.out.println();

        System.out.println("There are: " + givenStars + " given stars.");
        System.out.println("There are: " + usableStars + " usable stars.");
        System.out.println("There are: " + leftoverStars + " leftover stars.");
        System.out.println("There are: " + rows + " rows.");
        System.out.println("There are: " + starsInLastRow + " stars in the last row.");
    }

}
