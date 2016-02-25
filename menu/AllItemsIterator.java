public class AllItemsIterator implements MenuIterator {

    public void next(){
        System.out.println("here");
    }

    public boolean hasNext(){
        return true;
    }

    public MenuItem getItem(){
        MenuItem item = new MenuItem("test", 1, false, 99.99f);
        return item;
    }
}