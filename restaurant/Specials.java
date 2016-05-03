import java.util.ArrayList;

public class Specials {

    public ArrayList<Special> specials;

    public Specials() {
        specials = new ArrayList<Special>();
    }

    public void addSpecial(Special special) {
        specials.add(special);
    }
}