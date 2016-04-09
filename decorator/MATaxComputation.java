import java.util.ArrayList;
import java.util.Calendar;

public class MATaxComputation extends TaxComputation {


    /**
     * Compute the tax on the given shoppingCart.  The given date determines
     * if it is a tax holiday.
     * @param shoppingCart - The shoppingCart of items that the user is purchasing
     * @param date - The date of sale
     * @return The amount of tax to be applied to the shoppingCart
     */
    public float computeTax(ShoppingCart shoppingCart, Calendar date) {

        float MATax = 0.0625f;
        float tax = 0.0f;

        // Build list of tax free categoiries
        ArrayList<String> nonTaxableCategories = new ArrayList<String>();
        nonTaxableCategories.add("school");
        nonTaxableCategories.add("computer");
        nonTaxableCategories.add("sports");
        nonTaxableCategories.add("health");
        nonTaxableCategories.add("beauty");

        // Determine if the date qualifies as a tax holiday
        boolean holiday = taxHoliday(date);

        // If it is a tax holiday, then only tax non-computer items
        if (holiday == true) {
            ShoppingCart taxableItems = new ShoppingCart();
            for (Item item : shoppingCart.items) {
                if (!nonTaxableCategories.contains(item.category)) {
                    taxableItems.addItem(item);
                }
            }
            tax = taxableItems.getTotal() * MATax;

        // If it is not a tax holiday, then just tax the total
        } else {
            tax = shoppingCart.getTotal() * MATax;
        }

        return tax;
    }


    /**
     * Determine if the given date qualifies as a tax holiday
     * @param date - The date of sale
     */
    protected boolean taxHoliday(Calendar date) {

        // Massachusetts tax holiday is on August 13th and 14th
        int holidayMonth = Calendar.AUGUST;
        int holidayDay1 = 13;
        int holidayDay2 = 14;

        if (date.get(Calendar.MONTH) == holidayMonth && date.get(Calendar.DAY_OF_MONTH) == holidayDay1 || date.get(Calendar.DAY_OF_MONTH) == holidayDay2) {
            return true;
        } else {
            return false;
        }
    }
}