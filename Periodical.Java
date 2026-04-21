public class Periodical extends LibraryItem {
    private int issueNumber;

    public Periodical(String id, String title, int issueNumber) {
        super(id, title);
        this.issueNumber = issueNumber;
    }

    @Override
    public int getLoanPeriod() {
        return 7;
    }
}