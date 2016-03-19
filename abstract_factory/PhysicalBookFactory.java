public class PhysicalBookFactory extends BookFactory {

    private int index = 0;
    private int librarySize = library.size() - 1;

    /**
     * Return the next occurance of a fiction book in the library
     * @return book - The next fiction book
     */
    public Book getFiction(){

        Book book = getNextBook("fiction");
        return book;
    }

    /**
     * Return the next occurance of a non-fiction book in the library
     * @return book - The next non-fiction book
     */
    public Book getNonFiction(){

        Book book = getNextBook("non fiction");
        return book;
    }

    /**
     * Determine if there is another physical in the library of the given type
     * @param type - The type of book (fiction or non-fiction)
     * @return true if there is another book, false if there is not
     */
    public boolean hasNext(String type){

        for (int i=index; i<=librarySize; i++){
            Book book = library.get(i);
            if (book.type.equals(type) && book.availability.matches("physical|both")) {
                return true;
            }
        }

        // We have reached the end. Reset the index for potential future iterations
        index = 0;

        return false;
    }

    /**
     * Return the next book in the libray of the given type
     * @param type - The type of book (fiction or non-fiction)
     * @return The next book
     */
    private Book getNextBook(String type){

        int tempIndex = index;
        for (int i=index; i<=librarySize; i++){
            Book book = library.get(i);
            if (book.type.equals(type) && book.availability.matches("physical|both")) {
                tempIndex = i;
                break;
            }
        }
        index = tempIndex + 1;

        return library.get(tempIndex);
    }
}