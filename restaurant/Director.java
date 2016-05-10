/**
 * Director object that directs the building of a special.  It builds
 * the components of a special: main, vegetable, side, name, and price.
 */
public class Director {

    private SpecialBuilder sb;

    /**
     * Constructor method.  Links the SpecialBuilder
     * @param SpecialBuilder - The SpecialBuilder.
     */
    public Director(SpecialBuilder sb) {
        this.sb = sb;
    }

    /**
     * Build the components of a special.
     */
    public void build() {

        this.sb.buildMain();
        this.sb.buildVegetable();
        this.sb.buildSide();
        this.sb.buildName();
        this.sb.buildPrice();
    }

    /**
     * Return the special.
     * @return Special - the special.
     */
    public Special getSpecial() {
        return this.sb.getSpecial();
    }
}