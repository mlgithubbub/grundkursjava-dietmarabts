package de.javagrundlagen.Kapitel04.Beispiele;

public class SwitchTest2 {

    public static void main(String[] args) {
        char op = 'x';

        //Beispiel 1
        switch (op) {
            case '*':
            case 'x':
                System.out.println("Multiplikation");
                break;
            case ':':
            case '/':
                System.out.println("Division");
        }

        //Beispiel 2
        switch (op){
            case '*', 'x' -> System.out.println("Multiplikation");
            case ':', '/' -> {
                String s = "Division";
                System.out.println(s);
            }
        }

        //Beispiel 3
        String result1 = switch(op){
            case '*':
            case 'x':
                yield "Multiplikation";
            case ':', '/':
                String s = "Division";
                yield s;
            default:
                yield "Unbekannt";
        };
        System.out.println(result1);

        //Beispiel 4
        String result2 = switch(op){
            case '*', 'x' -> "Multiplikation";
            case ':', '/' -> {
                String s = "Division";
                yield s;
            }
            default -> "Unbekannt";
        };
        System.out.println(result2);
    }
}
