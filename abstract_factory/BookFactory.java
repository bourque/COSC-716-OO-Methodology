import java.util.ArrayList;

public abstract class BookFactory {

    private static final String E_BOOK = "ebook";
    private static final String PHYSICAL_BOOK = "physical";
    public static ArrayList<Book> library = new ArrayList();

    public abstract Book getFiction();
    public abstract Book getNonFiction();
    public abstract boolean hasNext(String type);

    /**
     * Return the appropriate BookFactory for the given type
     * @param factoryType - The type of factory to return
     * @return BookFactory - either an EBookFactory, or a PhysicalBookFactory
     */
    public static BookFactory getBookFactory(String factoryType) throws InvalidFactoryTypeException {

        if (factoryType.equals(BookFactory.E_BOOK)) {
            return new EBookFactory();
        } else if (factoryType.equals(BookFactory.PHYSICAL_BOOK)) {
            return new PhysicalBookFactory();
        } else {
            throw new InvalidFactoryTypeException();
        }
    }

    /**
     * Add a book to the library (i.e. the list of books)
     * @param book - the book to add
     */
    public static void addBook(Book book) {
        library.add(book);
    }
}

class InvalidFactoryTypeException extends Exception {

    public InvalidFactoryTypeException() {
        System.out.println("Invalid Factory Type.  Must be 'ebook' or 'physical'");
    }
}