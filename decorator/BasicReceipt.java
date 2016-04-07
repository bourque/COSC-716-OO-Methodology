import java.util.Calendar;

public class BasicReceipt implements Receipt {

    private ShoppingCart shoppingCart;
    private Calendar date;
    private float totalSale;
    private float amountDue;
    private TaxComputation tc;

    public BasicReceipt(ShoppingCart shoppingCart, Calendar date) {

        this.shoppingCart = shoppingCart;
        this.date = date;
        this.totalSale = shoppingCart.getTotal();
    }

    public void setTaxComputation(TaxComputation tc) {
        this.tc = tc;
    }

    public void printReceipt() {
        System.out.println("\nReceipt:\n");
        System.out.println("Purchased items:");
        System.out.println(shoppingCart);
        System.out.println("\nTotal:\n\t" + totalSale);
        System.out.println("\nAmount Due:\n\t" + amountDue + "\n");
    }

    public void getAmountDue() {

        float tax = tc.computeTax(shoppingCart, date);
        amountDue = totalSale + tax;
    }
}