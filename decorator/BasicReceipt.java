import java.util.Date;

public class BasicReceipt implements Receipt {

    private ShoppingCart shoppingCart;
    private Date date;
    private double totalSale;
    private double amountDue;
    private TaxComputation tc;

    public BasicReceipt(ShoppingCart shoppingCart, Date date) {

        this.shoppingCart = shoppingCart;
        this.date = date;
        this.totalSale = getTotal();
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

    private Double getTotal() {

        double sum = 0;
        for(Item item:shoppingCart.items) {
            sum += item.price;
        }

        return sum;
    }

    public void getAmountDue() {

        double tax = tc.computeTax(shoppingCart, date);
        amountDue = totalSale + tax;
    }
}