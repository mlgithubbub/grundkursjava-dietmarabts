package de.javagrundlagen.Kapitel06.Aufgaben.Aufgabe07.MeTrial1;

public class Stapel {

    int[] stapelArray = new int[1];

    void push(int e){
        int originalLastIndex = this.stapelArray.length-1;
        if (this.stapelArray[originalLastIndex] != 0) {
            int[] newArray = new int[this.stapelArray.length * 2];
            for (int i = 0; i < this.stapelArray.length; i++) {
                newArray[i] = this.stapelArray[i];
            }
            newArray[originalLastIndex + 1] = e;
            this.stapelArray = newArray;
        }
        else{
                this.stapelArray[originalLastIndex]= e;
            }
        }


    int pop(){
        int obersteElement = this.stapelArray[this.stapelArray.length-1];
        this.stapelArray[this.stapelArray.length-1] = 0;
        return obersteElement;}
}
