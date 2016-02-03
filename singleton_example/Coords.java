public class Coords {

    private int x;
    private int y;
    private static Coords instance = null;

    public static Coords getInstance(){
        if(instance == null){
            instance = new Coords();
        }
        return instance;
    }

    private void coords(){
        x = 0;
        y = 0;
    }
}