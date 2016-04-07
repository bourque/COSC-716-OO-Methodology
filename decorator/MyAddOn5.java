public class MyAddOn5 implements AddOn, Applies, Rebate {

    public String getLines() {
        return "This is my other rebate";
    }

    public boolean applies(ShoppingCart items) {
        return true;
    }
}