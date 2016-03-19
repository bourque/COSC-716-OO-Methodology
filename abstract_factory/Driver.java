class Driver {

    public static void main(String[] args) {

        // Create books to test with
        Book book0 = new Book("name0", "fiction", "ebook");
        Book book1 = new Book("name1", "non fiction", "ebook");
        Book book2 = new Book("name2", "fiction", "physical");
        Book book3 = new Book("name3", "non fiction", "physical");
        Book book4 = new Book("name4", "fiction", "both");
        Book book5 = new Book("name5", "non fiction", "both");

        // Add books to library
        BookFactory.addBook(book0);
        BookFactory.addBook(book1);
        BookFactory.addBook(book2);
        BookFactory.addBook(book3);
        BookFactory.addBook(book4);
        BookFactory.addBook(book5);

        // Get the factories
        BookFactory ebf = BookFactory.getBookFactory("ebook");
        BookFactory pbf = BookFactory.getBookFactory("physical");

        // Print out fiction and non fiction books for each factory
        System.out.println("\nFiction e-books:");
        while(ebf.hasNext("fiction")) {
            Book book = ebf.getFiction();
            System.out.println(book);
        }

        System.out.println("\nNon-fiction e-books:");
        while(ebf.hasNext("non fiction")) {
            Book book = ebf.getNonFiction();
            System.out.println(book);
        }

        System.out.println("\nFiction pysical books:");
        while(pbf.hasNext("fiction")) {
            Book book = pbf.getFiction();
            System.out.println(book);
        }

        System.out.println("\nNon-fiction pysical books:");
        while(pbf.hasNext("non fiction")) {
            Book book = pbf.getNonFiction();
            System.out.println(book);
        }
    }
}