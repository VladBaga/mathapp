package org.fasttrackit;

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

}
