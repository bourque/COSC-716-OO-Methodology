import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Scanner;

public class BasicReceipt implements Receipt {

    public ShoppingCart items;
    public Date date;
    public int storeID;
    public String storeAddress;
    public String storePhoneNumber;
    public String stateCode = new String();
    public TaxComputation tc;
    public double totalSale;
    public double amountDue;

    public BasicReceipt(ShoppingCart items, Date date) {

        this.items = items;
        this.date = date;
        this.totalSale = items.getTotal();

        // Read in the config file and set the store parameters
        try {
            Scanner scanner = new Scanner(new File("config.dat"));
            this.storeID = Integer.parseInt(scanner.nextLine());
            this.storeAddress = scanner.nextLine();
            this.storePhoneNumber = scanner.nextLine();
            this.stateCode = scanner.nextLine();
            scanner.close();
        } catch(FileNotFoundException e) {
            System.out.println("Error " + e.toString());
        }

        // Determine the tax computation object
        if (this.stateCode.equals("MD")) {
            this.tc = new MDTaxComputation();
        } else if (this.stateCode.equals("MA")) {
            this.tc = new MATaxComputation();
        } else if (this.stateCode.equals("CA")) {
            this.tc = new CATaxComputation();
        } else {
            this.tc = null;
        }
    }

    public void printReceipt() {
        System.out.println(stateCode);
    }
}