public class AudioBook extends Book{
    private int runTime;

    // extends keyword lets the compiler know that this class is a sublclass of the Book class
    // AudioBook inherits all the properties and methods from the parent class

    AudioBook(String title, String[] authors, int runTime) {
        super(title, 0, authors);

        // super keyword refers to the parent class

        this.runTime = runTime;
    }

    @Override
    public String length(){
        return String.format("%s is %d minutes long.", this.title, this.runTime);
    }
    // keyword @Override

}