import java.util.Date;
import java.util.*;
import java.lang.reflect.Field;

public class ReceiptFactory {

    private ShoppingCart items;
    private Date date;
    private AddOn[] addOns;

    public ReceiptFactory(ShoppingCart items, Date date) throws UnknownAddOnTypeException {

        this.items = items;
        this.date = date;

        // Initilalize Receipt
        Receipt br = new BasicReceipt(items, date);
        for (Field f : br.getClass().getDeclaredFields()) {
            System.out.println(f.getName());
        }
        //System.out.println(br.stateCode);
    }

    // public Receipt getReceipt() {



    //     // // Compute the necessary tax
    //     // if (receipt.stateCode.equals("MD")) {
    //     //     TaxComputation tc = new MDTaxComputation();
    //     // } else if (receipt.stateCode.equals("MA")) {
    //     //     TaxComputation tc = new MATaxComputation();
    //     // } else if (receipt.stateCode.equals("CA")) {
    //     //     TaxComputation tc = new CATaxComputation();
    //     // } else {
    //     //     throw new UnimplementedStateTaxComputationException(receipt.stateCode);
    //     // }
    //     // tc.computeTax(items, date);

    //     // Determine add-ons
    //     // getAddOns(addOns);

    //     // Print add-ons in appropriate order
    //     // for (AddOn a:addOns) {
    //     //     // logic
    //     // }

    //     return br;
    // }

    // private void getAddOns(AddOn[] addOns) {

    //     addOns = new AddOns[5];
    //     addOns[0] = new MyAddOn0();
    //     // addOns[1] = new MyAddOn1();
    //     // addOns[2] = new MyAddOn2();
    //     // addOns[3] = new MyAddOn3();
    //     // addOns[4] = new MyAddOn4();
    // }
}

class UnknownAddOnTypeException extends Exception {

    public UnknownAddOnTypeException() {
        System.out.println("Invalid AddOn type");
    }
}