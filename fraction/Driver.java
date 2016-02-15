/*
Matthew Bourque
2/16/2016
Homework Assignment 1
*/

import java.util.ArrayList;
import java.util.List;

class Driver {

    /**
     * The main driver
     */
    public static void main(String[] args) {

        // Build a set of fractions to test with
        Fraction fraction1 = new Fraction(2,3); // A normal fraction
        Fraction fraction2 = new Fraction(-2,3); // A negative fraction via numerator
        Fraction fraction3 = new Fraction(3,-4); // A negative fraction via denominator
        Fraction fraction4 = new Fraction(4,3); // A fraction greater than 1
        UnitFraction fraction5 = new UnitFraction(1,4); // A normal unit fraction

        // Put fraction objects into an iterable list
        List<Fraction> fractionList = new ArrayList<Fraction>();
        fractionList.add(fraction1);
        fractionList.add(fraction2);
        fractionList.add(fraction3);
        fractionList.add(fraction4);
        fractionList.add(fraction5);

        // Test equals method
        System.out.println("\nTesting equals method\n");
        for (int i = 0; i < fractionList.size(); i++) {
            for (int j = 0; j < fractionList.size(); j++) {
                System.out.print("\t" + fractionList.get(i) + " == " + fractionList.get(j) + " : ");
                System.out.print(fractionList.get(i).equals(fractionList.get(j)) + "\n");
            }
        }

        // Test add method
        System.out.println("\nTesting add method\n");
        for (int i = 0; i < fractionList.size(); i++) {
            for (int j = 0; j < fractionList.size(); j++) {
                System.out.print("\t" + fractionList.get(i) + " + " + fractionList.get(j) + " = ");
                System.out.print(fractionList.get(i).add(fractionList.get(j)) + "\n");
            }
        }

        // Test subtract method
        System.out.println("\nTesting subtract method\n");
        for (int i = 0; i < fractionList.size(); i++) {
            for (int j = 0; j < fractionList.size(); j++) {
                System.out.print("\t" + fractionList.get(i) + " - " + fractionList.get(j) + " = ");
                System.out.print(fractionList.get(i).subtract(fractionList.get(j)) + "\n");
            }
        }

        // Test multiply method
        System.out.println("\nTesting multiply method\n");
        for (int i = 0; i < fractionList.size(); i++) {
            for (int j = 0; j < fractionList.size(); j++) {
                System.out.print("\t" + fractionList.get(i) + " * " + fractionList.get(j) + " = ");
                System.out.print(fractionList.get(i).multiply(fractionList.get(j)) + "\n");
            }
        }

        // Test divide method
        System.out.println("\nTesting divide method\n");
        for (int i = 0; i < fractionList.size(); i++) {
            for (int j = 0; j < fractionList.size(); j++) {
                System.out.print("\t" + fractionList.get(i) + " / " + fractionList.get(j) + " = ");
                System.out.print(fractionList.get(i).divide(fractionList.get(j)) + "\n");
            }
        }

        // Test the exceptions
        // Try to make a fraction with denominator = 0
        System.out.println("\nTesting exception for denominator = 0");
        try {
            Fraction fraction6 = new Fraction(1,0);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }

        // Try to make a unit fraction with numerator != 1
        System.out.println("\nTesting exception for unit fraction with numerator != 1");
        try {
            UnitFraction fraction7 = new UnitFraction(2,3);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }

        // Try to divide by a faction that equates to 0
        System.out.println("\nTesting excpetion for divide by zero");
        try {
            Fraction fraction8 = new Fraction(0,1);
            System.out.println("\t" + fraction1 + " / " + fraction8 + " = ");
            System.out.print(fraction1.divide(fraction8));
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}

// Question: What changes would need to be made to make the Fraction class immutable.
// An immutable object cannot be changed once it is created.  To accomplish this with the Fraction class, one would have to:
// 1. Declare the fraction class to be 'final' (i.e. final public class Fraction{}); the 'final' keyword ensures that the reference to the fraction object does not change.
// 2. Declare the numerator and denominator fields to be 'private' and 'final' (e.g. final private Integer numerator)
// 3. Remove the setter methods (i.e. setNumerator, setDenominator) so that a user is unable to change the numerator and denominator fields
// It is also important to note that if the Fraction class is made 'final', it cannot be subclassed, and thus the UnitFraction class would not be able to inherit from Fraction.