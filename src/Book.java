import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Book {
    protected String title;
    protected int pageCount;
    private ArrayList<String> authors = new ArrayList<String>(); // books often have multiple authors

    public String getTitle(){
        return this.title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getAuthors(){
        return this.authors.toString();
    }

    public void setTitle (String[] authors){
        this.authors = new ArrayList<String>(Arrays.asList(authors));
    }

    // Constructors in Java
    Book(String title, int pageCount, String[] authors){
        this.title = title;
        this.authors = new ArrayList<String>(Arrays.asList(authors));
    }

    public String length(){
        return String.format ("%s is %d pages long.", this.title, this.pageCount);
    }

    public String toString(){
        return String.format("%s by %s", this.title, this.authors.toString());
    }
    //overwritten toString() method
}
