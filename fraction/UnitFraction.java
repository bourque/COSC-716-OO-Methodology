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

}