// This abstract class represents a library item,
// which can be a book or a periodical
public abstract class LibraryItem {
    private final String id;
    private final String title;
    private boolean available = true;

    protected LibraryItem(String id, String title) {
        this.id = id;
        this.title = title;
    } // constructor end

    public String getId() {
        return id;
    } // end getId

    public String getTitle() {
        return title;
    } // end getTitle

    public boolean isAvailable() {
        return available;
    } //  end isAvailable

    public void setAvailable(boolean available) {
        this.available = available;
    } //  end setAvailable
} // class end 