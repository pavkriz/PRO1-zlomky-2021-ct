package cz.uhk.pro1.fractions.model;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;

        setDenominator(denominator);

    }

    public double toDouble() {
        return (double) numerator / denominator;
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof Fraction) {
            Fraction otherNormalized = ((Fraction) other).normalized();
            Fraction thisNormalized = this.normalized();

            return otherNormalized.numerator == thisNormalized.numerator
                    && otherNormalized.denominator == thisNormalized.denominator;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    public Fraction mult(Fraction anotherFraction) {
        return new Fraction(
                numerator * anotherFraction.numerator,
                denominator * anotherFraction.denominator
        ).normalized();
    }

    /**
     * Secte zlomek s druhym zlomkem
     *
     * @param anotherFraction druhy zlomek
     * @return novy zlomek, ktery je vysledkem a je zkracen
     */
    public Fraction plus(Fraction anotherFraction) {
        Fraction f = new Fraction(
                (numerator * anotherFraction.denominator) + (anotherFraction.numerator * denominator)
                ,denominator * anotherFraction.denominator
        );
        return f.normalized();
    }

    public Fraction minus(Fraction anotherFraction) {
        return new Fraction(
                (numerator * anotherFraction.denominator) - (anotherFraction.numerator * denominator)
                ,denominator * anotherFraction.denominator
        ).normalized();
    }

    public Fraction div(Fraction anotherFraction) {
        return new Fraction(
                numerator * anotherFraction.denominator,
                denominator * anotherFraction.numerator
        ).normalized();
    }

    public Fraction normalized() {
        // najit nejvetsi spolecny delitel citatele a jmenovatele
        int min;
        if(numerator < denominator){    // TODO pozor, neresime zaporna cisla
            min = numerator;
        }
        else
        {
            min = denominator;
        }
        // int min = (numerator < denominator) ? numerator : denominator;
        for(int i = min; i >= 1; i--){
            if (numerator % i == 0 && denominator % i == 0) {
                // vytvorit novy zlomek, jehoz citatel i jmenovatel bude podelen nejvetsim spol. delitelem
                return new Fraction((numerator/i), (denominator/i));
            }
        }
        return new Fraction(numerator, denominator);
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        // tohle nejde udelat: this.denominator = (denominator != 0) ? denominator : throw new RuntimeException("zaaaa");
        if(denominator!=0)
        {
            this.denominator = denominator;
        }
        else{
            throw new RuntimeException("Denominator cannot be 0");
        }

    }
}
