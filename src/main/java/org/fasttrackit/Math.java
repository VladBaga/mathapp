package org.fasttrackit;

import java.util.Arrays;

public class Math {

    public double addition(double firstNr, double secondNr) { // Adunare

        double total = firstNr + secondNr;
        System.out.println("Rezultatul adunarii este : " + total);

        return total;

    }

    public double subtraction(double firstNr, double secondNr) { // Scadere

        double total = firstNr - secondNr;
        System.out.println("Rezultatul scaderii este : " + total);
        return total;
    }

    public double multipy(double firstNr, double secondNr) { // Inmultire

        double total = firstNr * secondNr;
        System.out.println("Rezultatul inmultirii este : " + total);
        return total;
    }

    public double divide(double firstNr, double secondNr) { // Impartire

        double total = firstNr / secondNr;
        System.out.println("Rezultatul impartirii este : " + total);
        return total;
    }

    int addition(int firstNr, int secondNr) { // Adunare numere intregi

        int total = firstNr + secondNr;
        System.out.println("Rezultatul adunarii este : " + total);

        return total;

    }

    int subtraction(int firstNr, int secondNr) { // Scadere numere intregi

        int total = firstNr - secondNr;
        System.out.println("Rezultatul scaderii este : " + total);
        return total;
    }

    int multipy(int firstNr, int secondNr) { // Inmultire numere intregi

        int total = firstNr * secondNr;
        System.out.println("Rezultatul inmultirii este : " + total);
        return total;
    }

    int divide(int firstNr, int secondNr) { // Impartire numere intregi

        int total = firstNr / secondNr;
        System.out.println("Rezultatul impartirii este : " + total);
        return total;
    }
//WORD COUNTER
    public static int count(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return 0;
        }
        String[] words = sentence.split("\\s+");
        System.out.println("Words counted : " + words.length);
        return words.length;
    }
//WORD COUNTER
}
