package pkg3;

import java.util.Scanner;

public class LibraryManagementSystem{
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Library Management System ===");
            System.out.println("1. Add Book");
            System.out.println("2. Add Magazine");
            System.out.println("3. Retrieve Item Details");
            System.out.println("4. Delete Item");
            System.out.println("5. Display All Items");
            System.out.println("6. Add Client");
            System.out.println("7. Retrieve Client Details");
            System.out.println("8. Delete Client");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1: // Add Book
                    System.out.print("Enter Book ID: ");
                    int bookId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Book Title: ");
                    String bookTitle = scanner.nextLine();
                    System.out.print("Enter Book Author: ");
                    String bookAuthor = scanner.nextLine();
                    Book book = new Book(bookId, bookTitle, bookAuthor);
                    library.addBook(book);
                    System.out.println("Book added successfully.");
                    break;

                case 2: // Add Magazine
                    System.out.print("Enter Magazine ID: ");
                    int magId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Magazine Title: ");
                    String magTitle = scanner.nextLine();
                    System.out.print("Enter Magazine Issue Number: ");
                    int magIssue = scanner.nextInt();
                    Magazine magazine = new Magazine(magId, magTitle, magIssue);
                    library.addMagazine(magazine);
                    System.out.println("Magazine added successfully.");
                    break;

                case 3: // Retrieve Item Details
                    System.out.print("Enter Item ID to retrieve: ");
                    int itemId = scanner.nextInt();
                    try {
                        library.getItem(itemId);
                    } catch (ItemNotFoundException e) {
                        System.out.println("ITEM NOT FOUND !!");
                    }
                    break;

                case 4: // Delete Item
                    System.out.print("Enter Item ID to delete: ");
                    int delItemId = scanner.nextInt();
                    try{
                    library.removeID(delItemId);
                    }
                    catch(ItemNotFoundException ie){
                        System.out.println(ie.getMessage()); // changeeee
                    }
                    break;

                case 5: // Display All Items
                    library.displayAllItems();
                    break;

                case 6: // Add Client
                    System.out.print("Enter Client ID: ");
                    int clientId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Client Name: ");
                    String clientName = scanner.nextLine();
                    System.out.print("Enter Client Email: ");
                    String clientEmail = scanner.nextLine();
                    library.addClient(clientId, clientName, clientEmail);
                    System.out.println("Client added successfully.");
                    break;

                case 7: // Retrieve Client Details
                    System.out.print("Enter Client ID to retrieve: ");
                    int clientSearchId = scanner.nextInt();
                    boolean found = false;
                    for (Client c : library.ClientList) {
                        if (c.ID == clientSearchId) {
                            System.out.println(c.getClientDetails());
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Client not found.");
                    }
                    break;

                case 8: // Delete Client
                    System.out.print("Enter Client ID to delete: ");
                    int delClientId = scanner.nextInt();
                    try{
                        library.deleteClient(delClientId);
                    }
                    catch(ItemNotFoundException ee){
                        System.out.println("ITEM NOT FOUND !!");
                    }
                    break;

                case 9: // Exit
                    System.out.println("Exiting the system. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
