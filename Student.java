//this class represents a student member of the library,
// extending the Member class

public class Student extends Member {
    public Student(String id, String name) {
        super(id, name);
    } // constructor end

    @Override
    protected int getMaxLoans() {
        return 5;
    } // end getMaxLoans
} // class end