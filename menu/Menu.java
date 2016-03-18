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
    public void addItem(MenuItem menuItem){
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
    public MenuIterator getPriceIterator(double price){
       MenuIterator priceIterator = new PriceIterator(price);
       return priceIterator;
    }


    private class AllItemsIterator implements MenuIterator {

        private int index = 0;
        private int menuSize = menu.size() - 1;

        /**
         * Iterate to the next MenuItem
         */
        public void next(){
            index += 1;
        }

        /**
         * Determine if there is a next MenuItem
         * @return true if there is a next item, false if there is not
         */
        public boolean hasNext(){
            if (index > this.menuSize) {
                return false;
            } else {
                return true;
            }
        }

        /**
         * Return the MenuItem of the current index
         * @return MenuItem - The MenuItem of the current index
         */
        public MenuItem getItem(){
            return menu.get(index);
        }
    }


    private class ItemIterator implements MenuIterator {

        private int category;
        private int index = 0;
        private int menuSize = menu.size() - 1;

        /**
         * Constructor method
         * @param category - the item category. Can be 1 (Appetizer),
         *        2 (main dish), or 3 (dessert)
         */
        public ItemIterator(int category){
            this.category = category;
            index = getStartingIndex();
        }

        /**
         * Iterate to the next MenuItem of the given category
         */
        public void next(){

            index += 1;
            while (index < this.menuSize && menu.get(index).category != this.category) {
                index += 1;
            }
        }

        /**
         * Determine if there is a next MenuItem of the given category
         * @return true if there is a next item, false if there is not
         */
        public boolean hasNext(){

            // If we have reached the end of the menu, there is no next item regardless
            if (index > this.menuSize){
                return false;

            // If there are still items in the menu, check to see if any of them are of
            // the given category
            } else{
                int tempIndex = index;
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

        /**
         * Return the MenuItem of the current index
         * @return MenuItem - The MenuItem of the current index
         */
        public MenuItem getItem(){
            return menu.get(index);
        }

        /**
         * Determine the first index in which there is a MenuItem of the given category
         * @return startingIndex - The index of the first MenuItem of the given category
         */
        private int getStartingIndex(){

            int startingIndex = 0;
            while (startingIndex <= this.menuSize && menu.get(startingIndex).category != this.category) {
                startingIndex += 1;
            }
            return startingIndex;
        }
    }


    private class HeartHealthyIterator implements MenuIterator {

        private int index = 0;
        private int menuSize = menu.size() - 1;

        /**
         * Constructor method
         */
        public HeartHealthyIterator(){
            index = getStartingIndex();
        }

        /**
         * Iterate to the next heart healthy MenuItem
         */
        public void next(){

            index += 1;
            while (index < this.menuSize && menu.get(index).heartHealthy != true) {
                index += 1;
            }
        }

        /**
         * Determine if there is a next heart healthy MenuItem
         * @return true if there is a next item, false if there is not
         */
        public boolean hasNext(){

            if (index > this.menuSize){
                return false;
            } else{
                int tempIndex = index;
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

        /**
         * Return the MenuItem of the current index
         * @return MenuItem - The MenuItem of the current index
         */
        public MenuItem getItem(){
            return menu.get(index);
        }

        /**
         * Determine the first index in which there is a heart healty MenuItem
         * @return startingIndex - The index of the first heart healthy MenuItem
         */
        private int getStartingIndex(){

            int startingIndex = 0;
            while (startingIndex <= this.menuSize && menu.get(startingIndex).heartHealthy != true) {
                startingIndex += 1;
            }
            return startingIndex;
        }
    }


    private class PriceIterator implements MenuIterator {

        private double price;
        private int index = 0;
        private int menuSize = menu.size() - 1;

        /**
         * Constructor method
         * @param price - the price under which menu items will be displayed
         */
        public PriceIterator(double price){
            this.price = price;
            index = getStartingIndex();
        }

        /**
         * Iterate to the next main dish MenuItem that is under the given price
         */
        public void next(){

            index += 1;
            while (menu.get(index).price >= this.price || menu.get(index).category != MAIN_DISH) {
                if (index >= this.menuSize) {
                    break;
                }
                index += 1;
            }
        }

        /**
         * Determine if there is a next main dish MenuItem under the given price
         * @return true if there is a next item, false if there is not
         */
        public boolean hasNext(){

            if (index > this.menuSize){
                return false;
            } else{
                int tempIndex = index;
                while (tempIndex <= menuSize) {
                    if (menu.get(tempIndex).price >= this.price || menu.get(tempIndex).category != MAIN_DISH) {
                        tempIndex += 1;
                    } else {
                        return true;
                    }
                }
                return false;
            }
        }

        /**
         * Return the MenuItem of the current index
         * @return MenuItem - The MenuItem of the current index
         */
        public MenuItem getItem(){
            return menu.get(index);
        }

        /**
         * Determine the first index in which there is a main dish
         * MenuItem under the given price
         * @return startingIndex - The index of the first main dish
         *         MenuItem under the given price
         */
        private int getStartingIndex(){

            int startingIndex = 0;
            while (startingIndex < this.menuSize && menu.get(startingIndex).price >= this.price || menu.get(startingIndex).category != MAIN_DISH) {
                startingIndex += 1;
            }
            return startingIndex;
        }
    }
}