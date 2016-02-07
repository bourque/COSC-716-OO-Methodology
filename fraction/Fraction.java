class Fraction {

    private int numerator;
    private int denominator;

    /**
     * Constructor method
     * @param numerator - the numerator of the fraction
     * @param denominator - the denominator of the fraction
     */
    public Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }


    /**
     * Copy constructor method
     * @param frac - the fraction
     */
    public Fraction(Fraction frac){
        this.numerator = frac.numerator;
        this.denominator = frac.denominator;
    }


    /**
     * Override the toString method
     */
    @Override
    public String toString() {
        return Integer.toString(this.numerator) + "/" + Integer.toString(this.denominator);
    }


    /**
     * Add the given fraction to this fraction
     * @param frac - the fraction to add
     * @return newFraction - A new fraction that is the sum of this fraction
     *                       and the given fraction
     */
    public Fraction add(Fraction frac){
        int newNumerator = this.numerator * frac.denominator + frac.numerator * this.denominator;
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
    public Fraction divide(Fraction frac){
        return frac;
    }


    /**
     * Check whether or not the given fraction is equal to this fraction
     * @param frac - the fraction to reduce
     * @return true if fraction is equal, false if it is not.
     */
    public Boolean equals(Fraction frac){

        // First make sure the two fractions are in simplest form
        Fraction thisFrac = new Fraction(this.numerator, this.denominator);
        Fraction thisFracSimple = reduce(thisFrac);
        Fraction fracSimple = reduce(frac);

        // Check to see if they are equal
        if (thisFracSimple.numerator == fracSimple.numerator && thisFracSimple.denominator == fracSimple.denominator) {
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
        return this.denominator;
    }


    /**
     * Return the numerator from this fraction
     * @return this.numerator - the numerator from this fraction
     */
    public int getNumerator(){
        return this.numerator;
    }


    /**
     * Multiply the given fraction to this fraction
     * @param frac - the fraction to multiply
     * @return newFraction - A new fraction that is the product of this
     *                       fraction and the given fraction
     */
    public Fraction multiply(Fraction frac){
        return frac;
    }


    /**
     * Reduce the given fraction to it's simplest form
     * @param frac - the fraction to reduce
     * @return newFraction - A new fraction that is reduced to the given
     *                       fraction's simplest form
     */
    public Fraction reduce(Fraction frac){

        // Find the greatest common denominator
        int n = frac.numerator;
        int d = frac.denominator;
        while (d != 0) {
            if (n > d) {
                n -= d;
            } else {
                d -= n;
            }
        }
        int gcd = n;

        // Reduce the fraction by the greatest common demoniator
        frac.numerator /= gcd;
        frac.denominator /= gcd;

        // Construct a new fraction and return it
        Fraction newFraction = new Fraction(frac.numerator, frac.denominator);
        return newFraction;
    }


    /**
     * Set the denominator for this fraction
     * @param denominator - The denominator to set
     */
    public void setDenominator(int denominator){
        this.denominator = denominator;
    }


    /**
     * Set the numerator for this fraction
     * @param numerator - The numerator to set
     */
    public void setNumerator(int numerator){
        this.numerator = numerator;
    }


    /**
     * Subtract the given fraction from this fraction
     * @param frac - the fraction to subtract
     * @return newFraction - A new fraction that is the difference of this
     *                       fraction and the given fraction
     */
    public Fraction subtract(Fraction frac){
        return frac;
    }
}