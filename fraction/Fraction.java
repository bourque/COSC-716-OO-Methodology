class Fraction {

    private int numerator;
    private int denominator;

    /**
     * Constructor method
     */
    public Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }


    /**
     * Copy constructor method
     */
    public Fraction(Fraction frac){
        this.numerator = frac.numerator;
        this.denominator = frac.denominator;
    }


    public int getDenominator(){
        return this.denominator;
    }


    public void setDenominator(int denominator){
        this.denominator = denominator;
    }


    public int getNumerator(){
        return this.numerator;
    }


    public void setNumerator(int numerator){
        this.numerator = numerator;
    }


    public void add(){

    }


    public void subtract(){

    }


    public void multiply(){

    }


    public void divide(){

    }


    public void equals(){

    }


    public void reduce(){

    }


    /**
     * Override the toString method of the Object class
     */
    @Override
    public String toString() {
        return Integer.toString(this.numerator) + "/" + Integer.toString(this.denominator);
    }
}