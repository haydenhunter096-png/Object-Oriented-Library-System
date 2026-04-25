public class Student extends Member {
    public Student(String id, String name) {
        super(id, name);
    }

    @Override
    protected int getMaxLoans() {
        return 5;
    }
}