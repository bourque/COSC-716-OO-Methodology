import java.util.Calendar;

public class BasicReceipt implements Receipt {

    private ShoppingCart shoppingCart;
    private Calendar date;
    private String storeID;
    private String storeAddress;
    private String storePhone;
    private String stateCode;
    private float totalSale;
    private float amountDue;
    private TaxComputation tc;


    /**
     * Constructor method
     */
    public BasicReceipt(ShoppingCart shoppingCart, Calendar date, String storeID, String storeAddress, String storePhone, String stateCode) {

        this.shoppingCart = shoppingCart;
        this.date = date;
        this.storeID = storeID;
        this.storeAddress = storeAddress;
        this.storePhone = storePhone;
        this.stateCode = stateCode;
        this.totalSale = shoppingCart.getTotal();
    }


    /**
     * Set the given TaxComputation object
     * @param tc - The TaxComputation object to set
     */
    public void setTaxComputation(TaxComputation tc) {
        this.tc = tc;
    }


    /**
     * Print the receipt
     */
    public void printReceipt() {

        // Print store info
        System.out.println("\nBest Buy Store # " + storeID);
        System.out.println(storeAddress);
        System.out.println(storePhone);
        System.out.println(stateCode);

        // Print date
        System.out.println(date.getTime());

        // Print items
        System.out.println("\nPurchased items:");
        System.out.println(shoppingCart);

        // Print total sale
        System.out.println("\nTotal:\n\t" + totalSale);

        // Print amount due
        System.out.println("\nAmount Due:\n\t" + amountDue + "\n");
    }


    /**
     * Perform the tax computation and determine the total amount due
     */
    protected void getAmountDue() {

        float tax = tc.computeTax(shoppingCart, date);
        amountDue = totalSale + tax;
    }
}