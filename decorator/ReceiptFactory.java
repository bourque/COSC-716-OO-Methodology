import java.util.Date;

public class ReceiptFactory {

    private ShoppingCart items;
    private Date date;
    private AddOn[] addOns;

    public ReceiptFactory(ShoppingCart items, Date date) throws UnknownAddOnTypeException {

        this.items = items;
        this.date = date;
    }

    public Receipt getReciept() {

        // Initilalize Receipt
        Receipt receipt = new BasicReceipt(items, date);

        // Compute the necessary tax
        // TaxComputation tc = new TaxComputation();
        // tc.computeTax(items, date);

        // Determine add-ons
        // getAddOns(addOns);

        // Print add-ons in appropriate order
        // for (AddOn a:addOns) {
        //     // logic
        // }

        return receipt;
    }

    // private void getAddOns(AddOn[] addOns) {

    //     addOns = new AddOns[5];
    //     addOns[0] = new MyAddOn0();
    //     // addOns[1] = new MyAddOn1();
    //     // addOns[2] = new MyAddOn2();
    //     // addOns[3] = new MyAddOn3();
    //     // addOns[4] = new MyAddOn4();
    // }
}

class UnknownAddOnTypeException extends Exception {

    public UnknownAddOnTypeException() {
        System.out.println("Invalid AddOn type");
    }
}