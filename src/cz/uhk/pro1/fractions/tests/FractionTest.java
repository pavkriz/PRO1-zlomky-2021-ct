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
}
