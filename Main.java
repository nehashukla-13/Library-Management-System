import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Library library = new Library();
        int choice;

        System.out.println("====================================");
        System.out.println("     LIBRARY MANAGEMENT SYSTEM");
        System.out.println("====================================");

        do {
            System.out.println("\n========== MENU ==========");
            System.out.println("1. Add Book");
            System.out.println("2. Add User");
            System.out.println("3. Display All Books");
            System.out.println("4. Display All Users");
            System.out.println("5. Issue Book");
            System.out.println("6. Return Book");
            System.out.println("7. Exit");
            System.out.println("==========================");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    System.out.println("\n----- ADD BOOK -----");

                    System.out.print("Enter Book ID: ");
                    int bookId = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Book Title: ");
                    String title = scanner.nextLine();

                    System.out.print("Enter Author Name: ");
                    String author = scanner.nextLine();

                    Book book = new Book(bookId, title, author);
                    library.addBook(book);
                    break;

                case 2:
                    System.out.println("\n----- ADD USER -----");

                    System.out.print("Enter User ID: ");
                    int userId = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter User Name: ");
                    String name = scanner.nextLine();

                    User user = new User(userId, name);
                    library.addUser(user);
                    break;

                case 3:
                    library.displayAllBooks();
                    break;

                case 4:
                    library.displayAllUsers();
                    break;

                case 5:
                    System.out.println("\n----- ISSUE BOOK -----");

                    System.out.print("Enter Book ID: ");
                    int issueBookId = scanner.nextInt();

                    System.out.print("Enter User ID: ");
                    int issueUserId = scanner.nextInt();

                    library.issueBook(issueBookId, issueUserId);
                    break;

                case 6:
                    System.out.println("\n----- RETURN BOOK -----");

                    System.out.print("Enter Book ID: ");
                    int returnBookId = scanner.nextInt();

                    library.returnBook(returnBookId);
                    break;

                case 7:
                    System.out.println(
                        "\nThank you for using Library Management System!"
                    );
                    break;

                default:
                    System.out.println(
                        "Invalid choice! Please try again."
                    );
            }

        } while (choice != 7);

        scanner.close();
    }
}
