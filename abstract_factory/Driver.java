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
        EBookFactory ebf = new EBookFactory();
        PhysicalBookFactory pbf = new PhysicalBookFactory();
        ebf.addBook(book1);
        ebf.addBook(book2);
        ebf.addBook(book3);
        ebf.addBook(book4);
        ebf.addBook(book5);
        ebf.addBook(book6);

        System.out.println(ebf);

        // ebf.getFictionBook();
        // ebf.getNonFictionBook();
        // pbf.getFictionBook();
        // pbf.getNonFictionBook();
    }
}