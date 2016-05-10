import java.util.ArrayList;

/**
 * Object that contains a list of specials.
 */
public class Specials {

    public ArrayList<Special> specials;

    /**
     * Constructor method.  Initializes the list.
     */
    public Specials() {
        specials = new ArrayList<Special>();
    }

    /**
     * Add a special to the list.
     * @param Special - The special.
     */
    public void addSpecial(Special special) {
        specials.add(special);
    }

    /**
     * Return a special in the specials list that matches the given
     * name.
     * @param String - The name of the special.
     * @return Special - The special that matches the given name.
     */
    public Special getSpecial(String name) {

        Special foundSpecial = null;
        for (Special special:specials) {
            if (special.name.equals(name)) {
                foundSpecial = special;
                break;
            }
        }

        return foundSpecial;
    }
}