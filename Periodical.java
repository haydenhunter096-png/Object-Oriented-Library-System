// this class represents a periodical in the library system,
// extending the LibraryItem class
public class Periodical extends LibraryItem {
    private final int issueNumber;

    public Periodical(String id, String title, int issueNumber) {
        super(id, title);
        this.issueNumber = issueNumber;
    } // constructor end

    public int getIssueNumber() {
        return issueNumber;
    } // end getIssueNumber
} // end class