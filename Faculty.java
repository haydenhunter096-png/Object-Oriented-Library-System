public class Faculty extends Member {
    public Faculty(String id, String name) {
        super(id, name);
    }

    @Override
    protected int getMaxLoans() {
        return 10;
    }
}