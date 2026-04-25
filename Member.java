public abstract class Member {
    private final String id;
    private final String name;
    private int activeLoans;

    protected Member(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean canBorrow() {
        return activeLoans < getMaxLoans();
    }

    public void addLoan() {
        if (canBorrow()) {
            activeLoans++;
        }
    }

    public void removeLoan() {
        if (activeLoans > 0) {
            activeLoans--;
        }
    }

    protected abstract int getMaxLoans();
}