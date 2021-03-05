package cz.uhk.pro1.fractions;

import cz.uhk.pro1.fractions.model.Fraction;
import javax.swing.JOptionPane;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();

        String answer;
        do {

            Fraction fraction = new Fraction(rand.nextInt(10),rand.nextInt(10) + 1);
            Fraction fraction2 = new Fraction(rand.nextInt(10),rand.nextInt(10) + 1);
            int choice = rand.nextInt(4);
            Fraction correctResult;
            String operator;

            switch (choice) {
                case 0:
                    operator = " + ";
                    correctResult = fraction.plus(fraction2);
                    break;
                case 1:
                    operator = " - ";
                    correctResult = fraction.minus(fraction2);
                    break;
                case 2:
                    operator = " * ";
                    correctResult = fraction.mult(fraction2);
                    break;
                default:
                    operator = " / ";
                    correctResult = fraction.div(fraction2);
            }

            answer = JOptionPane.showInputDialog("Vypočítej " + fraction + operator + fraction2 + " a zadej výsledek ve tvaru čitatel/jmenoval");
            if(correctResult.toString().equals(answer)) {
                System.out.println("Šikulka");
            } else {
                System.out.println("Nope, správně je: " + correctResult);
            }

        } while (!(answer == null || answer.equals("konec")));  // skoncime, kdyz answer == null (uzivatel klikl na cancel v dialogu) nebo kdyz zadal konec
        //} while (answer != null && !answer.equals("konec"));
    }
}
