package de.javagrundlagen.Kapitel04.Beispiele;

public class SprungTest {

    public static void main(String[] args) {
        M1:
        for (int i = 1; i < 10; i++){
            for (int j = 1; j < 10; j++){
                System.out.print(j + " ");

                if (j == i){
                    System.out.println();
                    continue M1;
                }
            }
        }
    }


}
