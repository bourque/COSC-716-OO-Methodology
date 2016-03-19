public abstract class BookFactory {

    public abstract Book getFiction();
    public abstract Book getNonFiction();

    public abstract BookFactory getBookFactory(String type) {
        if (type.equals(BookFactory.E_BOOK)) {
            return new EBookFactory();
        }
        if (type.equals(BookFactory.PHYSICAL_BOOK)) {
            return new PhysicalBookFactory();
        }
        return new EBookFactory();
    }
}