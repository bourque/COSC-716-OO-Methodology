import java.util.Calendar;

public abstract class TaxComputation {
    public abstract float computeTax(ShoppingCart shoppingCart, Calendar date);
    protected abstract boolean taxHoliday(Calendar date);
}