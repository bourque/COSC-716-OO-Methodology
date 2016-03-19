import java.util.ArrayList;

public abstract class BookFactory {

    public static final String E_BOOK = "ebook";
    public static final String PHYSICAL_BOOK = "physical book";
    public ArrayList<Book> library = new ArrayList();

    // public abstract Book getFiction();
    // public abstract Book getNonFiction();

    // public static BookFactory getBookFactory(String type) {
    //     if (type.equals(BookFactory.E_BOOK)) {
    //         return new EBookFactory();
    //     }
    //     if (type.equals(BookFactory.PHYSICAL_BOOK)) {
    //         return new PhysicalBookFactory();
    //     }
    //     return new EBookFactory();
    // }

    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("Library:\n");
        sb.append("\tFiction?\tebook/pysical\n");
        for (int i=0; i<library.size(); i++){
            Book book = library.get(i);
            sb.append("\t" + book.isFiction + "\t" + book.type + "\n");
        }
        return sb.toString();
    }

    public void addBook(Book book) {
        library.add(book);
    }
}