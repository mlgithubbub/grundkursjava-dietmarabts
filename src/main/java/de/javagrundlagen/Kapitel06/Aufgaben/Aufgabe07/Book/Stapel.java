package de.javagrundlagen.Kapitel06.Aufgaben.Aufgabe07.Book;

public class Stapel {

    private static final int INITIAL_CAPACITY = 16;
    private int[] elements = new int[16];
    private int size;

    public Stapel() {
    }

    public void push(int e) {
        this.ensureCapacity();
        this.elements[this.size++] = e;
    }

    public int pop() {
        return this.elements[--this.size];
    }

    private void ensureCapacity() {
        if (this.elements.length == this.size) {
            int[] neuesArray = new int[2 * this.size];

            for(int i = 0; i < this.size; ++i) {
                neuesArray[i] = this.elements[i];
            }

            this.elements = neuesArray;
        }

    }
}
