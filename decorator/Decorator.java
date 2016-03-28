public abstract class Decorator implements Receipt {

    private Receipt trailer;

    public Decorator(Receipt receipt) {
        trailer = receipt;
    }

    protected void callTrailer() {
        trailer.printReceipt();
    }

    public abstract void printReceipt();
}