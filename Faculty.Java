public class Faculty extends Member {
    public Faculty(String id, String name) {
        super(id, name);
    }

    public int getMaxLoans() {
        return 50;
    }
}