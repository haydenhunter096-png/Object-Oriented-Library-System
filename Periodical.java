public class Periodical extends LibraryItem {
    private final int issueNumber;

    public Periodical(String id, String title, int issueNumber) {
        super(id, title);
        this.issueNumber = issueNumber;
    }

    public int getIssueNumber() {
        return issueNumber;
    }
}