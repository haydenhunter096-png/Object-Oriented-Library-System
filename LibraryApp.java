import java.util.Scanner;

public class LibraryApp {
    private final Library library = new Library();
    private final Scanner scanner = new Scanner(System.in);

    public void run() {
        seedData();
        while (true) {
            System.out.println();
            System.out.println("Library Menu");
            System.out.println("1) Checkout B1 to S1");
            System.out.println("2) Checkout P1 to F1");
            System.out.println("3) Return B1 from S1");
            System.out.println("4) Return P1 from F1");
            System.out.println("0) Exit");
            System.out.print("> ");

            String choice = scanner.nextLine().trim();
            switch (choice) {
                case "1" -> checkout("B1", "S1");
                case "2" -> checkout("P1", "F1");
                case "3" -> returnItem("B1", "S1");
                case "4" -> returnItem("P1", "F1");
                case "0" -> {
                    System.out.println("Exiting.");
                    return;
                }
                default -> System.out.println("Invalid option.");
            }
        }
    }

    private void seedData() {
        library.addItem(new Book("B1", "Dune", "Frank Herbert"));
        library.addItem(new Periodical("P1", "1984", 1));
        library.addMember(new Faculty("F1", "Mr. Jones"));
        library.addMember(new Student("S1", "Francis Webb"));
    }

    private void checkout(String itemId, String memberId) {
        library.checkout(itemId, memberId);
        System.out.println("Tried checkout: " + itemId + " -> " + memberId);
    }

    private void returnItem(String itemId, String memberId) {
        library.returnItem(itemId, memberId);
        System.out.println("Tried return: " + itemId + " <- " + memberId);
    }
}