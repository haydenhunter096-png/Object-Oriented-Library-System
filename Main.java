// import Scanner class
import java.util.Scanner;
// This is the main class that runs the library application, 
// providing a command-line interface for users to interact with the library system
public class Main {
    public static void main(String[] args) {
        Library lib = new Library();
        seedInventory(lib);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println();
            System.out.println("Library menu:");
            System.out.println("1) Add a new book");
            System.out.println("2) Show inventory");
            System.out.println("0) Exit");
            System.out.print("> ");

            String choice = scanner.nextLine().trim();
            switch (choice) {
                case "1" -> addBook(lib, scanner);
                case "2" -> lib.printInventory();
                case "0" -> {
                    System.out.println("Goodbye.");
                    scanner.close();
                    return;
                } // end case 0
                default -> System.out.println("Invalid choice, try again.");
            } // end switch
        } // end while
    } // end main

    private static void seedInventory(Library lib) {
        lib.addItem(new Book("B1", "Dune", "Frank Herbert"));
        lib.addItem(new Book("B2", "1984", "George Orwell"));
        lib.addItem(new Book("B3", "The Road", "Cormac McCarthy"));
        lib.addItem(new Periodical("P1", "Rolling Stone", 12));
    } // end seedInventory

    private static void addBook(Library lib, Scanner scanner) {
        System.out.print("Book ID: ");
        String id = scanner.nextLine().trim();

        System.out.print("Title: ");
        String title = scanner.nextLine().trim();

        System.out.print("Author: ");
        String author = scanner.nextLine().trim();

        lib.addItem(new Book(id, title, author));
        System.out.println("Added book: " + title);
    } // end addBook
} // class end