package cz.uhk.pro1.fractions.tests;

import cz.uhk.pro1.fractions.model.Fraction;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FractionTest {

    @Test
    public void testToString() {
        // pripravime si vstupy
        Fraction fraction = new Fraction(1,3);
        // provedeme testovanou operaci
        String s = fraction.toString();
        // overime spravnost vysledku
        assertEquals("1/3", s);
    }

    @Test
    public void testMult() {
        // pripravime vstupy
        Fraction fraction1 = new Fraction(1, 3);
        Fraction fraction2 = new Fraction(1, 7);
        // provedeme operaci
        Fraction r = fraction1.mult(fraction2);
        // overime spravnost vysledku (1/21)
        assertEquals(1, r.getNumerator());
        assertEquals(21, r.getDenominator());
    }

    @Test
    public void testPlus() {
        // pripravime vstupy
        Fraction fraction1 = new Fraction(1, 4);
        Fraction fraction2 = new Fraction(1, 4);
        // provedeme operaci
        Fraction r = fraction1.plus(fraction2);
        assertEquals(1, r.getNumerator());
        assertEquals(2, r.getDenominator());
        //assertEquals(new Fraction(1,2), r); // TODO museli bychom impl. metodu equals
    }

    @Test
    public void testMinus() {
        // pripravime vstupy
        Fraction fraction1 = new Fraction(1, 2);
        Fraction fraction2 = new Fraction(1, 4);
        // provedeme operaci
        Fraction r = fraction1.minus(fraction2);
        assertEquals(1, r.getNumerator());
        assertEquals(4, r.getDenominator());
    }

    @Test
    public void testDiv() {
        // pripravime vstupy
        Fraction fraction1 = new Fraction(1, 2);
        Fraction fraction2 = new Fraction(1, 4);
        // provedeme operaci
        Fraction r = fraction1.div(fraction2);
        assertEquals(2, r.getNumerator());
        assertEquals(1, r.getDenominator());
    }
}
