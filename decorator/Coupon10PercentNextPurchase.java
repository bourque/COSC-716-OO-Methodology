public class Coupon10PercentNextPurchase implements AddOn, Applies, Coupon {

    public String getLines() {

        StringBuilder sb = new StringBuilder();
        sb.append("Congratulations! Winner is YOU!\n");
        sb.append("You purchased over $100! This qualifies you for 10% off your next Best Buy!\n");
        sb.append("Simply show this receipt at time of your next purchase to redeem.\n");

        return sb.toString();
    }

    public boolean applies(ShoppingCart shoppingCart) {

        // Coupon applies if the total is greather than $100
        if (shoppingCart.getTotal() > 100.00) {
            return true;
        } else {
            return false;
        }
    }
}