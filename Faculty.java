// This class represents a faculty member in the library system, 
// extending the Member class
public class Faculty extends Member {
    public Faculty(String id, String name) {
        super(id, name);
    } // constructor end

    // Overrides to return the int
    @Override
    protected int getMaxLoans() {
        return 10;
    } // end getMaxLoans
} // class end