import java.util.Date;
import java.util.*;
import java.lang.reflect.Field;

public class ReceiptFactory {

    private ShoppingCart items;
    private Date date;
    private AddOn[] addOns;
    public Receipt receipt;

    public ReceiptFactory(ShoppingCart items, Date date) throws UnknownAddOnTypeException {

        this.items = items;
        this.date = date;

        // Initilalize Receipt
        this.receipt = new BasicReceipt(items, date);

        // Get AddOns
        getAddOns(addOns);

    }

    public Receipt getReceipt() {

        return this.receipt;
    }

    private void getAddOns(AddOn[] addOns) {

        addOns = new AddOn[5];
        addOns[0] = new MyAddOn0();
        addOns[1] = new MyAddOn0();
        addOns[2] = new MyAddOn0();
        addOns[3] = new MyAddOn0();
        addOns[4] = new MyAddOn0();
    }
}

class UnknownAddOnTypeException extends Exception {

    public UnknownAddOnTypeException() {
        System.out.println("Invalid AddOn type");
    }
}