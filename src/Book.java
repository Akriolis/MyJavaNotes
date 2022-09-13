import java.util.ArrayList;

public class Book {
    String title;
    ArrayList<String> authors = new ArrayList<String>(); // books often have multiple authors

    public String toString(){
        return String.format("%s by %s", this.title, this.authors.toString());
    }
    //overwritten toString() method
}
