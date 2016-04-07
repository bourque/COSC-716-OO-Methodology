import java.util.Calendar;

public class CATaxComputation extends TaxComputation {

    public float computeTax(ShoppingCart shoppingCart, Calendar date) {

        return shoppingCart.getTotal() * 0.075f;
    }

    protected boolean taxHoliday(Calendar date) {
        // California has no tax holidays
        return false;
    }
}