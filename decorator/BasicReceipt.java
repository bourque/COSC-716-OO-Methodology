public class BasicReceipt implements Receipt {

    private String storeInfo;
    private String stateCode;
    private PurchasedItems items;
    private Date date;
    private TaxComputation tc;

    public BasicReceipt(PurchasedItems items, Date date) {
        this.items = items;
        this.date = date;
    }

    public void setTaxComputation(TaxComputation tc) {
        this.tc = tc;
    }

    public void printReceipt() {
        // logic
    }
}