package cz.uhk.pro1.fractions.model;

import java.util.ArrayList;
import java.util.List;

public class FractionList {
    private final List<Fraction> fractions = new ArrayList<>();

    public void addFraction(Fraction f) {
        fractions.add(f);
    }

    /**
     * Secte zlomky v seznamu
     * @return soucet
     * @throws RuntimeException kdyz je seznam prazdny
     */
    public Fraction sum(){
        checkNotEmpty();

//        Fraction soucet = new Fraction(0,1);
//
//        for (int i = 0; i < fractions.size(); i++){
//            soucet = soucet.plus(fractions.get(i));
//        }

        Fraction soucet = fractions.get(0);

        for (int i = 1; i < fractions.size(); i++){
            soucet = soucet.plus(fractions.get(i));
        }

        return soucet;
    }

    private void checkNotEmpty() {
        if (fractions.size() == 0) {
            throw new RuntimeException("Tried to sum an empty list");
        }
    }

    public Fraction product(){
        checkNotEmpty();

//        Fraction soucin = new Fraction(1,1);
//
//        for (int i = 0; i < fractions.size(); i++){
//            soucin = soucin.mult(fractions.get(i));
//        }

        Fraction soucin = fractions.get(0);

        for (int i = 1; i < fractions.size(); i++){
            soucin = soucin.mult(fractions.get(i));
        }

        return soucin;
    }

}
