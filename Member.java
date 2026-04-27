// This abstract class represents a library member,
// which can be a student or a faculty member
public abstract class Member {
    private final String id;
    private final String name;
    private int activeLoans;

    protected Member(String id, String name) {
        this.id = id;
        this.name = name;
    } // constructor end

    public String getId() {
        return id;
    } // end getId

    public String getName() {
        return name;
    } // end getName    

    public boolean canBorrow() {
        return activeLoans < getMaxLoans();
    } // end canBorrow

    public void addLoan() {
        if (canBorrow()) {
            activeLoans++;
        } // else do nothing, cannot borrow more
    } // end addLoan

    public void removeLoan() {
        if (activeLoans > 0) {
            activeLoans--;
        } // else do nothing, no active loans to remove
    } // end removeLoan

    protected abstract int getMaxLoans();
} // class end