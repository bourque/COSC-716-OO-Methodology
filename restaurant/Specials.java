import java.util.ArrayList;

public class Specials {

    public ArrayList<Special> specials;

    public Specials() {
        specials = new ArrayList<Special>();
    }

    public void addSpecial(Special special) {
        specials.add(special);
    }

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