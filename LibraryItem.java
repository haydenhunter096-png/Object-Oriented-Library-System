public abstract class LibraryItem {
    protected String id;
    protected String title;
    protected boolean available = true;

    public LibraryItem(String id, String title) {
        this.id = id;
        this.title = title;
    }

    public String getId() { return id; }
    public String getTitle() { return title; }
    public boolean isAvailable() { return available; }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public abstract int getLoanPeriod();
}