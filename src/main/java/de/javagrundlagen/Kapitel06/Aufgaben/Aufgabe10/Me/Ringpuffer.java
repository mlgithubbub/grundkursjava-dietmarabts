package de.javagrundlagen.Kapitel06.Aufgaben.Aufgabe10.Me;

//Implementieren Sie mit Hilfe eines Arrays einen Ringpuffer, in den ganzen Zahlen geschrieben werden können. Der
// Ringpuffer hat eine feste Länge. Ist der Puffer voll, so soll der jeweils älteste Eintrag überschrieben werden.
// Ein Index gibt die Position im Array an, an der die nächste Schreiboperation stattfindet. Nach jedem Schreiben
// wird der Index um 1 erhöht und auf 0 gesetzt, wenn die obere Grenze des Arrays überschritten wurde. Es soll auch
// eine Methode geben, die den gesamten Inhalt des Puffers ausgibt.

public class Ringpuffer {

    int[] ringpufferArray;
    int index;

    Ringpuffer(int arrayLength){
        this.ringpufferArray = new int[arrayLength];
    }

    void addToRingpuffer(int item){

        if (this.index <= this.ringpufferArray.length-1){
            this.ringpufferArray[index] = item;
            index++;
        } else{
            index = 0;
            this.ringpufferArray[index] = item;
            index++;
        }



//
//        int index = 0;
//        for (int i = 0; i < this.ringpufferArray.length; i++){
//            if (this.ringpufferArray[i] == 0){
//                this.ringpufferArray[i] = item;
//                break;
//            }
//                index += 1;
//        }
//        if (index == this.ringpufferArray.length-1){
//
//        }
    }

    void printRingPuffer(){
        System.out.println("Here is your ringpuffer: ");
        for(int i = 0; i < this.ringpufferArray.length; i++){
            System.out.println(this.ringpufferArray[i]);
        }
    }

}
