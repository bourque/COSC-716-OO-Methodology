public class MyAddOn1 implements AddOn, Applies, Rebate {

    public String getLines() {
        return "This is my Rebate";
    }

    public boolean applies(ShoppingCart shoppingCart) {
        return true;
    }
}