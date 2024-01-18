package de.javagrundlagen.Kapitel06.Aufgaben.Aufgabe10.Book;

public class Ringpuffer {

    private int[] inhalt;
    private int idx;
    private boolean voll;

    public Ringpuffer(int length) {
        this.inhalt = new int[length];
        this.idx = 0;
        this.voll = false;
    }

    public void schreibe(int v) {
        if (this.idx < this.inhalt.length) {
            this.inhalt[this.idx] = v;
            if (this.idx == this.inhalt.length - 1) {
                this.voll = true;
            }

            this.idx = (this.idx + 1) % this.inhalt.length;
        }
    }

    public void lies() {
        int var10001;
        int i;
        if (!this.voll) {
            for(i = 0; i < this.idx; ++i) {
                var10001 = this.inhalt[i];
                System.out.print("" + var10001 + " ");
            }
        } else {
            for(i = 0; i < this.inhalt.length; ++i) {
                var10001 = this.inhalt[i];
                System.out.print("" + var10001 + " ");
            }
        }

        System.out.println();
    }
}
