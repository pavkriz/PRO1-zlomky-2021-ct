package cz.uhk.pro1.fractions.tests;

import cz.uhk.pro1.fractions.model.Fraction;
import cz.uhk.pro1.fractions.model.FractionList;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class FractionListTest {
    @Test
    public void testSum() {
        FractionList seznam = new FractionList();

        seznam.addFraction(new Fraction(1, 2));
        seznam.addFraction(new Fraction(2, 3));
        seznam.addFraction(new Fraction(4, 5));
        seznam.addFraction(new Fraction(6, 9));
        seznam.addFraction(new Fraction(4, 20));

        Fraction expected = new Fraction(17, 6);

        assertEquals(expected, seznam.sum());
    }

    @Test
    public void testProduct() {
        FractionList seznam = new FractionList();

        seznam.addFraction(new Fraction(1, 2));
        seznam.addFraction(new Fraction(2, 3));
        seznam.addFraction(new Fraction(3, 5));
        seznam.addFraction(new Fraction(4, 2));

        Fraction expected = new Fraction(24,60);

        assertEquals(expected, seznam.product());

    }

    @Test(expected = RuntimeException.class)
    public void testEmptySum() {
        FractionList seznam = new FractionList();
        seznam.sum();
//        try {
//            seznam.sum();
//            fail();
//        } catch (RuntimeException e) {
//
//        }
    }

}