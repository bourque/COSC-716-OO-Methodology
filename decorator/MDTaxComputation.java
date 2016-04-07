import java.util.Calendar;

public class MDTaxComputation extends TaxComputation {

    public double computeTax(ShoppingCart shoppingCart, Calendar date) {

        double MDTax = 0.06;
        double tax = 0.0;

        // Determine if the date qualifies as a tax holiday
        boolean holiday = taxHoliday(date);

        // If it is a tax holiday, then only tax non-computer items
        if (holiday == true) {
            ShoppingCart taxableItems = new ShoppingCart();
            for (Item item : shoppingCart.items) {
                if (item.category.equals("computer")) {
                    taxableItems.addItem(item);
                }
            }
            tax = taxableItems.getTotal() * MDTax;

        // If it is not a tax holiday, then just tax the total
        } else {
            tax = shoppingCart.getTotal() * MDTax;
        }

        return tax;
    }

    protected boolean taxHoliday(Calendar date) {

        // Assume Maryland's tax holiday is on April 7th
        int holidayMonth = Calendar.APRIL;
        int holidayDay = 7;

        if (date.get(Calendar.MONTH) == holidayMonth && date.get(Calendar.DAY_OF_MONTH) == holidayDay) {
            return true;
        } else {
            return false;
        }
    }
}