public class MyAddOn3 implements AddOn, Applies, Coupon {

    public String getLines() {
        return "This is my other coupon";
    }

    public boolean applies(ShoppingCart items) {
        return true;
    }
}