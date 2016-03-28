public class ReceiptFactory {

    private PurchasedItems items;
    private Date date;
    private AddOn[] addOns;

    public ReceiptFactory(PurchasedItems items, Date date) throws UnknownAddOnTypeException {

        this.items = items;
        this.date = date;
    }

    public getReciept() {

        // Initialize receipt
        Receipt receipt = new BasicReceipt(items, date);

        // Compute the necessary tax

        // Determine add-ons
        getAddOns(addOns);

        // Print add-ons in appropriate order
        // for (AddOn a:addOns) {
        //     // logic
        // }
    }

    private void getAddOns(AddOn[] addOns) {

        addOns = new AddOns[5];
        addOns[0] = new MyAddOn0();
        // addOns[1] = new MyAddOn1();
        // addOns[2] = new MyAddOn2();
        // addOns[3] = new MyAddOn3();
        // addOns[4] = new MyAddOn4();
    }

}