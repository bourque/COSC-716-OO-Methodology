public class Book {

    public String name;
    public String type;
    public String availability;

    public Book (String name, String type, String availability){
        this.name = name;
        this.type = type;
        this.availability = availability;
    }

    public String toString(){
        return "\t" + name + " (" + type + "," + availability + ")";
    }
}