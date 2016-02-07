class Driver {

    /**
     * The main driver
     */
    public static void main(String[] args) {

        Fraction fraction = new Fraction(2,4);
        Fraction copyFraction = new Fraction(fraction);
        System.out.println(fraction);
        System.out.println(copyFraction);
    }

}