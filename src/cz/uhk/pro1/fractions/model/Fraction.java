package cz.uhk.pro1.fractions.model;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator){
       this.numerator = numerator;
       this.denominator = denominator;

    }

    public double toDouble(){
        return (double)numerator/denominator;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    public Fraction mult(Fraction anotherFraction) {
        // TODO
        //  new Fraction
    }

    // TODO gettery
}
