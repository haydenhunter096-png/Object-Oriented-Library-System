// This class represents a book in the library system, 
// extending the LibraryItem class
public class Book extends LibraryItem {
    private final String author;

    public Book(String id, String title, String author) {
        super(id, title);
        this.author = author;
    } // constructor end

    // return the author of the book
    public String getAuthor() {
        return author;
    } // end getAuthor
} // class end