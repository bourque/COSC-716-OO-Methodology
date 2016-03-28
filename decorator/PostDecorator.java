public class PostDecorator extends Decorator {

    private AddOn addOn;

    public PostDecorator(AddOn addOn, Receipt receipt) {
        this.addOn = addOn;
        super(receipt);
    }

    public void printReceipt() {
        System.out.println(addOn.getLines());
        callTrailer();
    }
}