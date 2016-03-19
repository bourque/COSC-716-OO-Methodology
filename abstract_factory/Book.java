public class Book {

    public String name;
    public String type;
    public String availability;

    /**
     * Constructor method
     * @param name - the name of the book
     * @param type - the book type (fiction or non-fiction)
     * @param available - what the book is available in (ebook, physical, or both)
     */
    public Book (String name, String type, String availability){

        // Make sure the attributes are valid
        if (!type.matches("fiction|non fiction")) {
            throw new IllegalArgumentException("Type must be 'fiction' or 'non fiction'");
        }
        if (!availability.matches("ebook|physical|both")) {
            throw new IllegalArgumentException("Availability must be 'ebook' or 'pysical'");
        }

        this.name = name;
        this.type = type;
        this.availability = availability;
    }

    /**
     * Overrides the toString method
     */
    public String toString(){
        return "\t" + name + " (" + type + "," + availability + ")";
    }
}