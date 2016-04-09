public class PreDecorator extends Decorator {

    private AddOn addOn;


    /**
     * Constructor method
     * @param addOn - The addOn to decorate with
     * @param receipt - The receipt to decorate
     */
    public PreDecorator(AddOn addOn, Receipt receipt) {
        super(addOn, receipt);
        this.addOn = addOn;
    }


    /**
     * Print the receipt
     */
    public void printReceipt() {
        System.out.println(addOn.getLines());
        callTrailer();
    }
}