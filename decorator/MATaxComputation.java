import java.util.Calendar;

public class MATaxComputation extends TaxComputation {

    public float computeTax(ShoppingCart items, Calendar date) {
        // calls private method taxHoliday as part of this
        // compute the tax
        return 1.5f;
    }

    protected boolean taxHoliday(Calendar date) {
        // return true if date of receipt within the state's tax free holiday
        // else return false
        return false;
    }
}