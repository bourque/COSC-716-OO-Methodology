public abstract class Decorator implements Receipt {

    private Receipt trailer;


    /**
     * Constructor method
     * @param addOn - The addOn to decorate with
     * @param receipt - The receipt to decorate
     */
    public Decorator(AddOn addOn, Receipt receipt) {
        trailer = receipt;
    }


    /**
     * Call the printReceipt method of the trailer
     */
    protected void callTrailer() {
        trailer.printReceipt();
    }


    /**
     * Print the receipt
     */
    public abstract void printReceipt();
}