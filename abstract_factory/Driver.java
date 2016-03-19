class Driver {

    public static void main(String[] args) {

        // Create books to test with
        Book book1 = new Book(true, "ebook");
        Book book2 = new Book(false, "ebook");
        Book book3 = new Book(true, "physical");
        Book book4 = new Book(false, "physical");
        Book book5 = new Book(true, "both");
        Book book6 = new Book(false, "both");

        // Add books to library
        BookFactory.addBook(book1);
        BookFactory.addBook(book2);
        BookFactory.addBook(book3);
        BookFactory.addBook(book4);
        BookFactory.addBook(book5);
        BookFactory.addBook(book6);

        // Get the factories
        BookFactory ebf = BookFactory.getBookFactory("ebook");
        BookFactory pbf = BookFactory.getBookFactory("pysical book");

        // // Print out fiction and non fiction books for each factory
        // ebf.getFictionBook();
        // ebf.getNonFictionBook();
        // pbf.getFictionBook();
        // pbf.getNonFictionBook();
    }
}