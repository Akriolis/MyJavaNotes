public class Ebook extends Book{
    private String format;

    Ebook (String title, int pageCount, String[] authors, String format){
        super (title, pageCount, authors);

        this.format = format;
    }
}
