package de.javagrundlagen.Kapitel02;


import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.BitSet;

public class test {


    public static void main(String[] args) throws IOException {
        InputStream myInput = new InputStream() {
            @Override
            public int read() throws IOException {
                return 0;
            }
        };
        BufferedInputStream myBuff = new BufferedInputStream(myInput);

        System.out.println(myBuff);

        byte[] myByteArray = {1,2,3};

        myBuff.read(myByteArray);
    }
}
