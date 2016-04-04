import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Scanner;

public class BasicReceipt implements Receipt {

    private int storeID;
    private String storeAddress;
    private String storePhoneNumber;
    private String stateCode;
    private ShoppingCart items;
    private Date date;
    private TaxComputation tc;
    private double totalSale;
    private double amountDue;

    public BasicReceipt(ShoppingCart items, Date date) {

        this.items = items;
        this.date = date;

        // Read in the config file and set the store parameters
        try {

            // Read in the config file
            Scanner scanner = new Scanner(new File("config.dat"));
            this.storeID = Integer.parseInt(scanner.nextLine());
            this.storeAddress = scanner.nextLine();
            this.storePhoneNumber = scanner.nextLine();
            this.stateCode = scanner.nextLine();
            scanner.close();

        } catch(FileNotFoundException e) {
            System.out.println("Error " + e.toString());
        }
    }

    public void setTaxComputation(TaxComputation tc) {
        this.tc = tc;
    }

    public void printReceipt() {
        // logic
    }
}