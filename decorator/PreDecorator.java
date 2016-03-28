public class PreDecorator extends Decorator {

    private AddOn addOn;

    public PreDecorator(AddOn addOn, Receipt receipt) {
        super(receipt);
        this.addOn = addOn;
    }

    public void printReceipt() {
        System.out.println(addOn.getLines());
        callTrailer();
    }
}