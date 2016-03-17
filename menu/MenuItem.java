public class MenuItem{

    public String itemName;
    public int category;
    public boolean heartHealthy;
    public double price;


    public MenuItem(String itemName, int category, boolean heartHealthy, double price){

        this.itemName = itemName;
        this.category = category;
        this.heartHealthy = heartHealthy;
        this.price = price;
    }


    public String toString(){

        return this.itemName + ":\t\t" + this.category + "\t" + this.heartHealthy + "\t" + this.price;
    }


    public double getPrice(){
        return this.price;
    }


    public int getCategory(){
        return this.category;
    }


    public String getName(){
        return this.itemName;
    }


    public boolean getHeartHealthy(){
        return this.heartHealthy;
    }
}