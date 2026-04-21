public abstract class Member {
    protected String id;
    protected String name;
    protected int loans = 0;

    public Member(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getLoans() {
        return loans;
    }

    public void addLoan() {
        loans++;
    }

    public void removeLoan() {
        if (loans > 0) loans--;
    }

    public abstract int getMaxLoans();

    public boolean canBorrow() {
        return loans < getMaxLoans();
    }
}