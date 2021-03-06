import java.io.File;
import java.io.FileNotFoundException;
import java.util.Calendar;
import java.util.Scanner;

public class ReceiptFactory {

    private String storeID;
    private String storeAddress;
    private String storePhone;
    private String stateCode;
    private AddOn[] addOns;


    /**
     * Constructor method.  Reads in the config file with store information, and downloads
     * The addOns.
     */
    public ReceiptFactory() {

        // Read in the config file and set the store parameters
        try {
            Scanner scanner = new Scanner(new File("config.dat"));
            this.storeID = scanner.nextLine();
            this.storeAddress = scanner.nextLine();
            this.storePhone = scanner.nextLine();
            this.stateCode = scanner.nextLine();
            scanner.close();
        } catch(FileNotFoundException e) {
            System.out.println("Error " + e.toString());
        }

        // Get Add Ons
        getAddOns();
    }


    /**
     * Build and return a Receipt object.  This entails computing the tax, and decorating the receipt
     * with the appropriate addOns.
     * @param shoppingCart - The shoppingCart of items that the user is purchasing
     * @param date - The date of sale
     * @return receipt - The receipt object with attached addOns and computed tax
     * @throws UnknownAddOnTypeException - In case of unimplemented addOn types
     * @throws UnknownStateTaxComputationException - In case of states with unimplemented tax calculation
     */
    public Receipt getReceipt(ShoppingCart shoppingCart, Calendar date) throws UnknownAddOnTypeException, UnknownStateTaxComputationException {

        // Initialize receipt
        Receipt receipt = new BasicReceipt(shoppingCart, date, storeID, storeAddress, storePhone, stateCode);

        // Determine the tax computation object and compute tax
        if (stateCode.equals("MD")) {
            ((BasicReceipt)receipt).setTaxComputation(new MDTaxComputation());
        } else if (stateCode.equals("MA")) {
            ((BasicReceipt)receipt).setTaxComputation(new MATaxComputation());
        } else if (stateCode.equals("CA")) {
            ((BasicReceipt)receipt).setTaxComputation(new CATaxComputation());
        } else if (stateCode.equals("DE")){
            ((BasicReceipt)receipt).setTaxComputation(null);
        } else {
            throw new UnknownStateTaxComputationException(stateCode);
        }

        // Determine the amount due for the receipt
        ((BasicReceipt)receipt).getAmountDue();

        // Iterate through addOns and determine the appropriate order
        for (AddOn a: addOns) {

            // If it is a greeting, then print it before nominal receipt
            if (a instanceof Greeting) {
                receipt = new PreDecorator(a, receipt);
            } else {
                if (a instanceof Applies && ((Applies)a).applies(shoppingCart)) {
                    if (a instanceof Rebate || a instanceof Coupon) {
                        receipt = new PostDecorator(a, receipt);
                    } else {
                    throw new UnknownAddOnTypeException();
                    }
                }
            }
        }

        return receipt;
    }


    /**
     * Get the various AddOns and put them in a list.
     */
    private void getAddOns() {

        addOns = new AddOn[6];
        addOns[0] = new LimitedOfferGreeting();
        addOns[1] = new RebateAppleMacBook();
        addOns[2] = new Coupon10PercentNextPurchase();
        addOns[3] = new CouponFreeComputerItemUnder50();
        addOns[4] = new NormalGreeting();
        addOns[5] = new RebateWhirlpoolRefrigerator();
    }
}


class UnknownAddOnTypeException extends Exception {

    public UnknownAddOnTypeException() {
        System.out.println("Invalid AddOn type");
    }
}


class UnknownStateTaxComputationException extends Exception {

    public UnknownStateTaxComputationException(String stateCode) {
        System.out.println("Cannot compute tax for state " + stateCode);
    }
}