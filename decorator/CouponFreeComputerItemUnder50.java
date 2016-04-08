public class CouponFreeComputerItemUnder50 implements AddOn, Applies, Coupon {

    public String getLines() {
        StringBuilder sb = new StringBuilder();
        sb.append("Congratulations! Winner is YOU!\n");
        sb.append("You purchased over $500 in computers and/or computer accessories!\n");
        sb.append("Your next computer accessory item under $50 is on us!\n");
        sb.append("Simply show this receipt at time of your next purchase to redeem.\n");

        return sb.toString();
    }

    public boolean applies(ShoppingCart shoppingCart) {

        // Coupon applies if customer bought over $500 of computer items
        ShoppingCart computerItems = new ShoppingCart();
        for (Item item : shoppingCart.items) {
            if (item.category.equals("computer")) {
                computerItems.addItem(item);
            }
        }

        if (computerItems.getTotal() > 500.00) {
            return true;
        } else {
            return false;
        }
    }
}