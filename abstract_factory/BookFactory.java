import java.util.ArrayList;

public abstract class BookFactory {

    private static final String E_BOOK = "ebook";
    private static final String PHYSICAL_BOOK = "physical";
    public static ArrayList<Book> library = new ArrayList();

    public abstract Book getFiction();
    public abstract Book getNonFiction();
    public abstract boolean hasNext(String type);

    public static BookFactory getBookFactory(String availability) throws InvalidFactoryTypeException {

        if (availability.equals(BookFactory.E_BOOK)) {
            return new EBookFactory();
        } else if (availability.equals(BookFactory.PHYSICAL_BOOK)) {
            return new PhysicalBookFactory();
        } else {
            throw new InvalidFactoryTypeException();
        }
    }

    public static void addBook(Book book) {
        library.add(book);
    }
}

class InvalidFactoryTypeException extends Exception {

    public InvalidFactoryTypeException() {
        System.out.println("Invalid Factory Type.  Must be 'ebook' or 'physical'");
    }
}