import java.util.ArrayList;
import java.util.List;

class Driver {

    /**
     * The main driver
     */
    public static void main(String[] args) {

        // Build a set of fractions to test with corner cases
        Fraction fraction1 = new Fraction(2,3); // A normal fraction
        //Fraction fraction2 = new Fraction(0,3); // A fraction that equates to 0
        Fraction fraction3 = new Fraction(9,9); // A fraction that equates to 1
        UnitFraction fraction4 = new UnitFraction(1,4); // A normal unit fraction
        Fraction fraction5 = new Fraction(-4,5); // A negative fraction via numerator
        Fraction fraction6 = new Fraction(5,-7); // A negative fraction via denominator
        Fraction fraction7 = new Fraction(13,5); // A fraction greater than 1
        //Fraction fraction8 = new Fraction(11,0); // A fraction with a denominator of 0

        // Put fraction objects in an iterable list
        List<Fraction> fractionList = new ArrayList<Fraction>();
        fractionList.add(fraction1);
        //fractionList.add(fraction2);
        fractionList.add(fraction3);
        fractionList.add(fraction4);
        fractionList.add(fraction5);
        fractionList.add(fraction6);
        fractionList.add(fraction7);
        //fractionList.add(fraction8);

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
    }
}