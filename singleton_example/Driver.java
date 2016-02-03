// Assignment: Create a class in which only one instance is allowed
// to be created by an outside class.

public class Driver{

    public static void main(String[] args) {

        Coords coord1 = Coords.getInstance();
        Coords coord2 = Coords.getInstance();
    }
}