package cz.uhk.pro1.fractions;

import cz.uhk.pro1.fractions.model.Fraction;

public class Main {
    public static void main(String[] args) {
        Fraction fraction = new Fraction(1,0);

        double d = fraction.toDouble();
        System.out.println(d);

        //String s = fraction.toString();
        System.out.println(fraction);

        //fraction.setDenominator(0);


    }
}
