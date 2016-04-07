public class MyAddOn2 implements AddOn, Applies, Coupon {

    public String getLines() {
        return "This is my coupon";
    }

    public boolean applies(ShoppingCart items) {
        return true;
    }
}