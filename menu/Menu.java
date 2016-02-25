import java.util.ArrayList;

public class Menu{

    public static final int APPETIZERS = 1;
    public static final int MAIN_DISH = 2;
    public static final int DESSERT = 3;

    public ArrayList<MenuItem> list = new ArrayList();
    public int last;

    public String toString(){

        StringBuilder sb = new StringBuilder();
        sb.append("Menu:\n\n");
        sb.append("\tItem\tCategory\tHeart Healthy?\tPrice\n");
        for (int i=0; i<this.list.size(); i++){
            MenuItem menuItem = this.list.get(i);
            sb.append("\t" + menuItem + "\n");
        }

        return sb.toString();
    }

    public void append(MenuItem menuItem){
        this.list.add(menuItem);
    }

    public MenuIterator getAllItemsIterator(){
        MenuIterator itr = new AllItemsIterator();
        return itr;
    }

    public MenuIterator getItemIterator(){
        MenuIterator itr = new ItemIterator();
        return itr;
    }

    public MenuIterator getHeartHealthyIterator(){
        MenuIterator itr = new HeartHealthyIterator();
        return itr;
    }

    public MenuIterator getPriceIterator(){
       MenuIterator itr = new PriceIterator();
       return itr;
    }
}