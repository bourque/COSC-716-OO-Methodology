public class RebateWhirlpoolRefrigerator implements AddOn, Applies, Rebate {


    /**
     * Return the rebate description
     * @return The rebate description
     */
    public String getLines() {

        StringBuilder sb = new StringBuilder();
        sb.append("Your purchase of a Whirlpool Refrigerator qualifies for a $200 mail-in rebate.\n");
        sb.append("To redeem the rebate, please mail this receipt to the following address within 30 days of purchase:\n");
        sb.append("\tBest Buy Rebate Offers\n");
        sb.append("\t1 Best Buy Avenue\n");
        sb.append("\tSante Fe, New Mexico 87501\n");

        return sb.toString();
    }


    /**
     * Determine if the rebate applies to items in the given shoppingCart
     * @param shoppingCart - The shoppingCart of items that the user is purchasing
     * @return true if the rebate applies, false if it does not
     */
    public boolean applies(ShoppingCart shoppingCart) {

        // Coupon applies if customer bought an item named "Whirlpool Refrigerator"
        for (Item item : shoppingCart.items) {
            if (item.name.equals("Whirlpool Refrigerator")) {
                return true;
            }
        }

        return false;
    }
}