public class MDTaxComputation extends TaxComputation {

    public double computeTax(PurchasedItems items, ReceiptDate date) {
        // calls private method taxHoliday as part of this
        // compute the tax
    }

    private boolean taxHoliday(ReceiptDate date) {
        // return true if date of receipt within the state's tax free holiday
        // else return false
    }
}