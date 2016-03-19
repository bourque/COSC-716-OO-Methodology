import java.util.ArrayList;

public abstract class BookFactory {

    public static final String E_BOOK = "ebook";
    public static final String PHYSICAL_BOOK = "physical";
    public static ArrayList<Book> library = new ArrayList();

    public abstract Book getFiction();
    public abstract Book getNonFiction();
    public abstract boolean hasNext(String type);

    public static BookFactory getBookFactory(String type) {
        if (type.equals(BookFactory.E_BOOK)) {
            return new EBookFactory();
        }
        if (type.equals(BookFactory.PHYSICAL_BOOK)) {
            return new PhysicalBookFactory();
        }
        return new EBookFactory();
    }

    public static void addBook(Book book) {
        library.add(book);
    }
}