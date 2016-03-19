import java.util.ArrayList;

public abstract class BookFactory {

    public static final String E_BOOK = "ebook";
    public static final String PHYSICAL_BOOK = "physical";
    public static ArrayList<Book> library = new ArrayList();

    public abstract Book getFiction();
    public abstract Book getNonFiction();
    public abstract boolean hasNext(String type);

    public static BookFactory getBookFactory(String availability) throws InvalidBookTypeException {

        if (availability.equals(BookFactory.E_BOOK)) {
            return new EBookFactory();
        } else if (availability.equals(BookFactory.PHYSICAL_BOOK)) {
            return new PhysicalBookFactory();
        } else {
            throw new InvalidBookTypeException();
        }
    }

    public static void addBook(Book book) {
        library.add(book);
    }
}

class InvalidBookTypeException extends Exception {

    public InvalidBookTypeException() {
        System.out.println("Invalid Book Type.  Must be 'ebook' or 'physical'");
    }
}