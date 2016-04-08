public class PostDecorator extends Decorator {

    private AddOn addOn;

    public PostDecorator(AddOn addOn, Receipt receipt) {
        super(addOn, receipt);
        this.addOn = addOn;
    }

    public void printReceipt() {
        callTrailer();
        System.out.println(addOn.getLines());
    }
}