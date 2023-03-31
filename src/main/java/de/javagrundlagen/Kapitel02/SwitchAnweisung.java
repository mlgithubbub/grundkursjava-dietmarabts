package de.javagrundlagen.Kapitel02;

public class SwitchAnweisung {

    public static void main(String[] args) {

        switch("mango"){

            case "apple":
                System.out.println("Here, have an apple");
                break;
            case "grapes":
                System.out.println("Here, have some grapes");
                break;
            case "banana":
                System.out.println("Here, have a banana");
                break;
            default:
                System.out.println("Sorry, we only have oranges");
        }
    }
}
