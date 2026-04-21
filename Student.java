public class Student extends Member {
    public Student(String id, String name) {
        super(id, name);
    }

    @Override
    public int getMaxLoans() {
        return 10;
    }
}