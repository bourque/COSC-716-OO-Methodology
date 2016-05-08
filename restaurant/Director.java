public class Director {

    private SpecialBuilder sb;

    public Director(SpecialBuilder sb) {
        this.sb = sb;
    }

    public void build() {

        this.sb.buildMain();
        this.sb.buildVegetable();
        this.sb.buildSide();
        this.sb.buildName();
        this.sb.buildPrice();
    }

    public Special getSpecial() {
        return this.sb.getSpecial();
    }
}