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
     * Override the toString method
     */
    public String toString() {

        // If the denominator is 0, then return "inf"
        if (this.denominator == 0) {
            return "inf";
        }

        // Otherwise, return a string of the fraction
        else {
            return Integer.toString(this.numerator) + "/" + Integer.toString(this.denominator);
        }
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
        if (frac.numerator == 0) {
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

        // First make sure the given fraction is in simplest form
        Fraction fracSimple = reduce(frac);

        // Check to see if they are equal
        if (this.numerator.equals(fracSimple.numerator) && this.denominator.equals(fracSimple.denominator)) {
            return true;
        } else {
            return false;
        }
    }


    /**
     * Return the doniminator from this fraction
     * @return this.denominator - the denominator from this fraction
     */
    public Integer getDenominator(){
        return super.getDenominator();
    }


    /**
     * Return the numerator from this fraction
     * @return this.numerator - the numerator from this fraction
     */
    public Integer getNumerator(){
        return super.getNumerator();
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
     * Reduce the given fraction to it's simplest form
     * @param frac - the fraction to reduce
     * @return newFraction - A new fraction that is reduced to the given
     *                       fraction's simplest form
     */
    public Fraction reduce(Fraction frac){
        return super.reduce(frac);
    }


    /**
     * Set the denominator for this fraction
     * @param denominator - The denominator to set
     */
    public void setDenominator(Integer denominator){
        super.setDenominator(denominator);
    }


    /**
     * Set the numerator for this fraction
     * @param numerator - The numerator to set
     */
    public void setNumerator(Integer numerator){
        super.setNumerator(numerator);
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