import java.util.Calendar;

public class CATaxComputation extends TaxComputation {


    /**
     * Compute the tax on the given shoppingCart.  The given date determines
     * if it is a tax holiday.
     * @param shoppingCart - The shoppingCart of items that the user is purchasing
     * @param date - The date of sale
     * @return The amount of tax to be applied to the shoppingCart
     */
    public float computeTax(ShoppingCart shoppingCart, Calendar date) {

        return shoppingCart.getTotal() * 0.075f;
    }


    /**
     * Determine if the given date qualifies as a tax holiday
     * @param date - The date of sale
     */
    protected boolean taxHoliday(Calendar date) {
        // California has no tax holidays
        return false;
    }
}