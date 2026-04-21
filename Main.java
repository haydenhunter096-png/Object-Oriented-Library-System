public class Main {
    public static void main(String[] args) {
        Library lib = new Library();

        lib.addItem(new Book("B1", "Clean Code", "Robert Martin"));
        lib.addItem(new Periodical("P1", "Science Weekly", 12));

        lib.addMember(new Student("S1", "Alice"));
        lib.addMember(new Faculty("F1", "Dr. Smith"));

        lib.checkout("B1", "S1");
        lib.returnItem("B1", "S1");

        System.out.println("System running successfully");
    }
}