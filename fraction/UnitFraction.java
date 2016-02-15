class UnitFraction extends Fraction{

    /**
     * Constructor method
     * @param numerator - the numerator of the fraction
     * @param denominator - the denominator of the fraction
     * @throws IllegalArgumentException if the numerator is not 1 or -1
     */
    public UnitFraction(Integer numerator, Integer denominator){
        super(numerator, denominator);

        // Ensure that the numerator is 1
        if (this.numerator != 1) {
            throw new IllegalArgumentException("Numerator must be 1 for a unit fraction");
        }
    }


    /**
     * Copy constructor method
     * @param frac - the fraction
     */
    public UnitFraction(UnitFraction frac){
        super(frac);
    }


    /**
     * Add the given fraction to this fraction
     * @param frac - the fraction to add
     * @return newFraction - A new fraction that is the sum of this fraction
     *                       and the given fraction
     */
    public Fraction add(Fraction frac){

        Integer newNumerator = frac.denominator + frac.numerator * this.denominator;
        Integer newDenominator = this.denominator * frac.denominator;
        Fraction newFraction = new Fraction(newNumerator, newDenominator);

        return reduce(newFraction);
    }


    /**
     * Divide the given fraction to this fraction
     * @param frac - the fraction to divide
     * @return newFraction - A new fraction that is the quotient of this
     *                       fraction and the given fraction
     */
    public Fraction divide(Fraction frac) throws ArithmeticException {

        // If the numerator of the given fraction is 0, throw an exception
        if (frac.numerator.equals(0)) {
            throw new ArithmeticException("Divide by zero.");
        }

        // Multiply by the reciprical of the given fraction
        Integer n = frac.denominator;
        Integer d = this.denominator * frac.numerator;

        // Construct a new fraction and return it
        Fraction newFraction = new Fraction(n, d);
        return reduce(newFraction);
    }


    /**
     * Check whether or not the given fraction is equal to this fraction
     * @param frac - the fraction to reduce
     * @return true if fraction is equal, false if it is not.
     */
    public Boolean equals(Fraction frac){

        // We can assume the unit fraction is already in simplest form
        // Make sure the given fraction is in simplest form
        Fraction fracSimple = reduce(frac);

        // Check to see if they are equal
        if (this.numerator.equals(fracSimple.numerator) && this.denominator.equals(fracSimple.denominator)) {
            return true;
        } else {
            return false;
        }
    }


    /**
     * Multiply the given fraction to this fraction
     * @param frac - the fraction to multiply
     * @return newFraction - A new fraction that is the product of this
     *                       fraction and the given fraction
     */
    public Fraction multiply(Fraction frac){

        // Multipy the numerators and denominators
        Integer n = frac.numerator;
        Integer d = this.denominator * frac.denominator;

        // Construct a new fraction and return it
        Fraction newFraction = new Fraction(n, d);
        return reduce(newFraction);
    }


    /**
     * Subtract the given fraction from this fraction
     * @param frac - the fraction to subtract
     * @return newFraction - A new fraction that is the difference of this
     *                       fraction and the given fraction
     */
    public Fraction subtract(Fraction frac){

        Integer newNumerator = frac.denominator - frac.numerator * this.denominator;
        Integer newDenominator = this.denominator * frac.denominator;
        Fraction newFraction = new Fraction(newNumerator, newDenominator);

        return reduce(newFraction);
    }
}