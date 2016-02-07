class Driver {

    /**
     * The main driver
     */
    public static void main(String[] args) {

        Fraction fraction1 = new Fraction(1,3);
        Fraction fraction2 = new Fraction(4,12);
        System.out.println(fraction1);
        System.out.println(fraction2);
        System.out.println(fraction1.add(fraction2));
        System.out.println(fraction1.equals(fraction2));
    }

}