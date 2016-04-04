import java.util.Date;

public abstract class TaxComputation {
    public abstract double computeTax(ShoppingCart items, Date date);
    protected abstract boolean taxHoliday(Date date);
}