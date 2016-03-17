import java.util.ArrayList;

public class Menu{

    public static final int APPETIZER = 1;
    public static final int MAIN_DISH = 2;
    public static final int DESSERT = 3;
    public ArrayList<MenuItem> menu = new ArrayList();

    /**
     * Overrides the toString method
     */
    public String toString(){

        StringBuilder sb = new StringBuilder();
        sb.append("Menu:\n\n");
        sb.append("\tItem\tCategory\tHeart Healthy?\tPrice\n");
        for (int i=0; i<this.menu.size(); i++){
            MenuItem menuItem = this.menu.get(i);
            sb.append("\t" + menuItem + "\n");
        }

        return sb.toString();
    }


    /**
     * Append a menuItem to the ArrayList
     * @param menuItem - the menuItem to append
     */
    public void append(MenuItem menuItem){
        this.menu.add(menuItem);
    }

    /**
     * Return an AllItemsIterator
     * @return allItemsIterator - A MenuIterator that iterates over all
     *         menu items
     */
    public MenuIterator getAllItemsIterator(){
        MenuIterator allItemsIterator = new AllItemsIterator();
        return allItemsIterator;
    }

    /**
     * Return an ItemIterator
     * @param category - The item category to iterate over
     * @return itemsIterator - A MenuIterator that iterates over all
     *         menu items of a given category
     */
    public MenuIterator getItemIterator(int category){
        MenuIterator itemIterator = new ItemIterator(category);
        return itemIterator;
    }

    /**
     * Return a HeartHealthyIterator
     * @return heartHealthyIterator - A MenuIterator that iterates over
     *         all heart healthy items
     */
    public MenuIterator getHeartHealthyIterator(){
        MenuIterator heartHealthyIterator = new HeartHealthyIterator();
        return heartHealthyIterator;
    }

    /**
     * Return a Price Iterator
     * @param price - The threshold price under which items will be
     *        displayed
     * @return priceIterator - A MenuIterator that iterates over all
     *         menu items under the given price that are main dishes
     */
    public MenuIterator getPriceIterator(float price){
       MenuIterator priceIterator = new PriceIterator(price);
       return priceIterator;
    }


    private class AllItemsIterator implements MenuIterator {

        private int index = 0;
        private int menuSize = menu.size() - 1;

        public void next(){
            this.index += 1;
        }

        public boolean hasNext(){
            if (this.index > this.menuSize) {
                return false;
            } else {
                return true;
            }
        }

        public MenuItem getItem(){
            return menu.get(this.index);
        }
    }


    private class ItemIterator implements MenuIterator {

        private int category;
        private int index = 0;
        private int menuSize = menu.size() - 1;

        public ItemIterator(int category){
            this.category = category;
            this.index = getStartingIndex();
        }

        public void next(){

            this.index += 1;
            int tempIndex = this.index;
            while (this.index < this.menuSize && menu.get(tempIndex).category != this.category) {
                this.index += 1;
                tempIndex += 1;
            }
        }

        public boolean hasNext(){

            if (this.index > this.menuSize){
                return false;
            } else{
                int tempIndex = this.index;
                while (tempIndex <= this.menuSize) {
                    if (menu.get(tempIndex).category != this.category) {
                        tempIndex += 1;
                    } else {
                        return true;
                    }
                }
                return false;
            }
        }

        public MenuItem getItem(){
            return menu.get(this.index);
        }

        private int getStartingIndex(){

            int startingIndex = 0;
            while (menu.get(startingIndex).category != this.category && startingIndex < this.menuSize) {
                startingIndex += 1;
            }
            return startingIndex;
        }
    }


    private class HeartHealthyIterator implements MenuIterator {

        private int index = 0;
        private int menuSize = menu.size() - 1;

        public HeartHealthyIterator(){
            this.index = getStartingIndex();
        }

        public void next(){

            this.index += 1;
            int tempIndex = this.index;
            while (this.index < this.menuSize && menu.get(tempIndex).heartHealthy != true) {
                this.index += 1;
                tempIndex += 1;
            }
        }

        public boolean hasNext(){

            if (this.index > this.menuSize){
                return false;
            } else{
                int tempIndex = this.index;
                while (tempIndex <= menuSize) {
                    if (menu.get(tempIndex).heartHealthy != true) {
                        tempIndex += 1;
                    } else {
                        return true;
                    }
                }
                return false;
            }
        }


        public MenuItem getItem(){
            return menu.get(this.index);
        }

        private int getStartingIndex(){

            int startingIndex = 0;
            while (menu.get(startingIndex).heartHealthy != true && startingIndex < this.menuSize) {
                startingIndex += 1;
            }
            return startingIndex;
        }
    }


    private class PriceIterator implements MenuIterator {

        private float price;
        private int index = 0;
        private int menuSize = menu.size() - 1;

        public PriceIterator(float price){
            this.price = price;
            this.index = getStartingIndex();
        }

        public void next(){

            this.index += 1;
            int tempIndex = this.index;
            while (this.index < this.menuSize && menu.get(tempIndex).price >= this.price) {
                this.index += 1;
                tempIndex += 1;
            }
        }

        public boolean hasNext(){

            if (this.index > this.menuSize){
                return false;
            } else{
                int tempIndex = this.index;
                while (tempIndex <= menuSize) {
                    if (menu.get(tempIndex).price >= this.price) {
                        tempIndex += 1;
                    } else {
                        return true;
                    }
                }
                return false;
            }
        }

        public MenuItem getItem(){
            return menu.get(this.index);
        }

        private int getStartingIndex(){

            int startingIndex = 0;
            while (menu.get(startingIndex).price >= this.price && startingIndex < this.menuSize) {
                startingIndex += 1;
            }
            return startingIndex;
        }
    }
}