class UnitFraction extends Fraction{

    /**
     * Constructor method
     * @param denominator - the denominator of the fraction
     */
    public UnitFraction(int numerator, int denominator){
        super(numerator, denominator);
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
    @Override
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
    @Override
    public Fraction add(Fraction frac){

        int newNumerator = frac.denominator + frac.numerator * this.denominator;
        int newDenominator = this.denominator * frac.denominator;
        Fraction newFraction = new Fraction(newNumerator, newDenominator);

        return reduce(newFraction);
    }


    /**
     * Divide the given fraction to this fraction
     * @param frac - the fraction to divide
     * @return newFraction - A new fraction that is the quotient of this
     *                       fraction and the given fraction
     */
    @Override
    public Fraction divide(Fraction frac){

        // Multiply by the reciprical of the given fraction
        int n = frac.denominator;
        int d = this.denominator * frac.numerator;

        // Construct a new fraction and return it
        Fraction newFraction = new Fraction(n, d);
        return reduce(newFraction);
    }


    /**
     * Check whether or not the given fraction is equal to this fraction
     * @param frac - the fraction to reduce
     * @return true if fraction is equal, false if it is not.
     */
    @Override
    public Boolean equals(Fraction frac){

        // First make sure the given fraction is in simplest form
        Fraction fracSimple = reduce(frac);

        // Check to see if they are equal
        if (this.numerator == fracSimple.numerator && this.denominator == fracSimple.denominator) {
            return true;
        } else {
            return false;
        }
    }


    /**
     * Return the doniminator from this fraction
     * @return this.denominator - the denominator from this fraction
     */
    public int getDenominator(){
        return super.getDenominator();
    }


    /**
     * Return the numerator from this fraction
     * @return this.numerator - the numerator from this fraction
     */
    public int getNumerator(){
        return super.getNumerator();
    }


    /**
     * Multiply the given fraction to this fraction
     * @param frac - the fraction to multiply
     * @return newFraction - A new fraction that is the product of this
     *                       fraction and the given fraction
     */
    @Override
    public Fraction multiply(Fraction frac){

        // Multipy the numerators and denominators
        int n = frac.numerator;
        int d = this.denominator * frac.denominator;

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
    public void setDenominator(int denominator){
        super.setDenominator(denominator);
    }


    /**
     * Set the numerator for this fraction
     * @param numerator - The numerator to set
     */
    public void setNumerator(int numerator){
        super.setNumerator(numerator);
    }


    /**
     * Subtract the given fraction from this fraction
     * @param frac - the fraction to subtract
     * @return newFraction - A new fraction that is the difference of this
     *                       fraction and the given fraction
     */
    @Override
    public Fraction subtract(Fraction frac){

        int newNumerator = frac.denominator - frac.numerator * this.denominator;
        int newDenominator = this.denominator * frac.denominator;
        Fraction newFraction = new Fraction(newNumerator, newDenominator);

        return reduce(newFraction);
    }
}