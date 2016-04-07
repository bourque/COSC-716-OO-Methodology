import java.util.Calendar;

public class CATaxComputation extends TaxComputation {

    public double computeTax(ShoppingCart shoppingCart, Calendar date) {
        // calls private method taxHoliday as part of this
        // compute the tax
        return 0.0;
    }

    protected boolean taxHoliday(Calendar date) {
        // return true if date of receipt within the state's tax free holiday
        // else return false
        return false;
    }
}