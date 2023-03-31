package de.javagrundlagen.Kapitel02;

import javax.swing.*;

public class IfAnweisungen {

    public static void main(String[] args) {

        int weight = 60;

        if (weight >= 60){
            System.out.println("You are above your desired weight");
        }
        else {
            System.out.println("You are within your desired weight range");
        }

        if (weight > 75){
            System.out.println("You are way too fat");
        }
        else if (weight <= 75 & weight>= 60) {
            System.out.println("You are a bit chubby");
        }
        else{
            System.out.println("You're alright");
        }

        String feedback = weight < 60 ? "Good job" : "Bad job";
        System.out.println(feedback);

    }
}
