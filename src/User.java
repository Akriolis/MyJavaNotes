import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class User {
    String name;
    LocalDate birthDay;

    ArrayList<Book> borrowedBooks = new ArrayList<Book>();

    // what is method?
    // this keyword represents the current instance of the class (useful to
    // not being confused with parameters and properties with the same name)

    /*
    public class Main {
    int x = 10;

    // Constructor with a parameter
    public Main(int x) {
    this.x = x;
    }

    // Call the constructor
    public static void main(String[] args) {
    Main myObj = new Main(5);
    System.out.println("Value of x = " + myObj.x);
        }
    }
    current output is 5, but if you omit this keyword in Main, output will be 10
     */

    int age(){
        return Period.between(this.birthDay, LocalDate.now()).getYears();
        // returns the difference between current date and the date of birth in years
    }

    // methods can also accept parameters

    void borrow(Book book){
        this.borrowedBooks.add(book);
    }





}
