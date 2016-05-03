import java.util.Date;

public class InventoryItem {

    public String name;
    public String type;
    public int quantity;
    public Date expiration;

    public InventoryItem(String name, String type, int quantity, Date expiration) {
        this.name = name;
        this.type = type;
        this.quantity = quantity;
        this.expiration = expiration;
    }
}