class Driver {

    /**
     * The main driver
     */
    public static void main(String[] args) {

        Fraction fraction1 = new Fraction(2,3);
        Fraction fraction2 = new Fraction(0,12);
        System.out.println(fraction1);
        System.out.println(fraction2);
        System.out.println(fraction1.add(fraction2));
        System.out.println(fraction1.equals(fraction2));
        System.out.println(fraction1.subtract(fraction2));
        System.out.println(fraction1.multiply(fraction2));
        System.out.println(fraction1.divide(fraction2));
    }

}