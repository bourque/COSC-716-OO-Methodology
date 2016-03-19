public class EBookFactory extends BookFactory {

    private int index = 0;
    private int librarySize = library.size() - 1;

    public Book getFiction(){

        Book book = getNextBook("fiction");
        return book;
    }

    public Book getNonFiction(){

        Book book = getNextBook("non fiction");
        return book;
    }

    public boolean hasNext(String type){

        for (int i=index; i<=librarySize; i++){
            Book book = library.get(i);
            if (book.type.equals(type) && book.availability.matches("ebook|both")) {
                return true;
            }
        }

        // We have reached the end. Reset the index for potential future iterations
        index = 0;

        return false;
    }

    private Book getNextBook(String type){

        int tempIndex = index;
        for (int i=index; i<=librarySize; i++){
            Book book = library.get(i);
            if (book.type.equals(type) && book.availability.matches("ebook|both")) {
                tempIndex = i;
                break;
            }
        }
        index = tempIndex + 1;

        return library.get(tempIndex);
    }
}