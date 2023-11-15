package de.javagrundlagen.Kapitel06.Aufgaben.Aufgabe07.MeTrial2;

public class Stapel {

    private int[] stapelArray = new int[10];

    private int numOfItems = 0; //=0 is optional

    void push(int e){
        if (numOfItems == this.stapelArray.length){
            int[] newArray = new int[this.stapelArray.length*2];
            for (int i = 0; i < this.stapelArray.length; i++){
                newArray[i] = stapelArray[i];
            }
            this.stapelArray = newArray;
        }
        this.stapelArray[numOfItems] = e;
        this.numOfItems++;
    }

    int pop(){
        int lastItem = this.stapelArray[this.numOfItems-1];
        this.stapelArray[this.numOfItems-1] = 0;
        this.numOfItems--;
        return lastItem;
    }

    int[] getStapelArray(){
        return this.stapelArray;
    }

    int getNumOfItems(){
        return this.numOfItems;
    }
}
