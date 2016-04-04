import java.util.Date;

public class CATaxComputation extends TaxComputation {

    public double computeTax(ShoppingCart items, Date date) {
        // calls private method taxHoliday as part of this
        // compute the tax
    }

    private boolean taxHoliday(Date date) {
        // return true if date of receipt within the state's tax free holiday
        // else return false
    }
}