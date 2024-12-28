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
            System.out.println("4. Retreive Items IDs");
            System.out.println("5. Borrow Item");
            System.out.println("6. Return Item");
            System.out.println("7. Retreive Borrowed Items IDs");
            System.out.println("8. Delete Item");
            System.out.println("9. Display All Items");
            System.out.println("10. Add Client");
            System.out.println("11. Retrieve Client Details By ID");
            System.out.println("12. Delete Client");
            System.out.println("13. Update Client");
            System.out.println("14. Update Item");
            System.out.println("15. Retrieve All Client Details");
            System.out.println("16. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1: // Add Book
                boolean isValidd;
                int bookId=0;
                do{ 
                    //boolean ff = true;
                    isValidd =false;
                        try{
                            System.out.print("Enter Book ID: ");
                            bookId = scanner.nextInt(); // validation  
                            scanner.nextLine();                       
                            for(LibraryItem lii:library.itemList){ 
                                if(lii.id == bookId){
                                    System.out.println("Duplicate, Please enter another ID: ");
                                    System.out.print("Enter Book ID: ");
                                    //String clientNamee = scanner.nextLine();
                                    //ff = false;
                                    //return;
                                    isValidd=true; // found a duplicate
                                    break;
                                }
                            }
                    }
                    //scanner.nextLine(); 
                        
                    catch(Exception e){
                        //ff = false;
                        System.out.println("Please enter a positive number ");
                        scanner.nextLine();
                        //ff = false;
                    } 
                }while(isValidd);
                    System.out.print("Enter Book Title: ");
                    String bookTitle = scanner.nextLine();
                    System.out.print("Enter Book Author: ");
                    String bookAuthor = scanner.nextLine();
                    Book book = new Book(bookId, bookTitle, bookAuthor);
                    library.addBook(book);
                    System.out.println("Book added successfully.");
                    break;
                    

                case 2: // Add Magazine
                //boolean ff = true;
                boolean isValiddd;
                int magId=0;
                do{ 
                    //boolean ff = true;
                    isValiddd =false;
                    try{
                            System.out.print("Enter Magazine ID: ");
                            magId = scanner.nextInt();  // validation    
                            scanner.nextLine();                       
                            for(LibraryItem liii:library.itemList){ 
                                if(liii.id == magId){
                                    System.out.println("Duplicate, Please enter another ID: ");
                                    System.out.print("Enter Magazine ID: ");
                                    //String clientNamee = scanner.nextLine();
                                    //ff = false;
                                    //return;
                                    isValiddd=true; // found a duplicate
                                    break;
                                }
                            }
                        }
                        catch(Exception e){
                            //ff = false;
                            System.out.println("Please enter a positive number ");
                            scanner.nextLine();
                            //ff = false;
                        }
                    }while(isValiddd);
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
                        System.out.println(e.getMessage());
                    }
                    break;

                case 4: // Retrieve Item IDs
                    System.out.println("Items IDs => ");
                    library.displayItemsIDs();
                    break;

                case 5: // Borrow Item
                System.out.print("Enter Client ID: ");
                int clientIdd = scanner.nextInt();
                System.out.print("Enter item ID to borrow: ");
                int itemIdd = scanner.nextInt();
                library.borrowItem(clientIdd, itemIdd);
                break;
                    
                    // HENA //
            //         while (true) {
            //             System.out.print("Enter Client ID: ");
            //             int clientIdd = scanner.nextInt();
            //             try{
            //                 for(Integer cidd : library.clientIDs){
            //                     System.out.println("CLIENTSSSSSS");
            //                     if(cidd != clientIdd){
            //                         System.out.println("CLIENT ID UNAVAILABLE");
            //                         System.out.print("Enter Client ID: ");
            //                         int enterclient = scanner.nextInt();
            //                     }
            //        // }
            //         System.out.print("Enter item ID to borrow: ");
            //         int itemIdd = scanner.nextInt();
            //         library.borrowItem(clientIdd, itemIdd);
            //         break;
            //         }
            //     }
    
            //     catch(ItemNotFoundException ee){
            //         System.out.println("ITEM NOT FOUND !!");
            //     }                
            //         break;
            // }

                case 6: // Return item
                    System.out.print("Enter Client ID: ");
                    int ReturnUID = scanner.nextInt();
                    System.out.print("Enter item ID to return: ");
                    int itemIdReturn = scanner.nextInt();
                    library.returnItem(itemIdReturn, ReturnUID);
                    break;

                case 7: // Retreive Borrowed Items IDs
                    System.out.println("Borrowed Items IDs => ");
                    library.displayBorrowedItemsIDs();
                    break;

                case 8: // Delete Item
                    System.out.print("Enter Item ID to delete: ");
                    int delItemId = scanner.nextInt();
                    try{
                        library.removeID(delItemId);
                    }
                    catch(ItemNotFoundException ie){
                        System.out.println(ie.getMessage()); // changeeee
                    }
                    break;

                case 9: // Display All Items
                    System.out.println("Items => ");
                    library.displayAllItems();
                    break;

                case 10: // Add Client
                boolean isValid;
                int clientId=0;
                do{ 
                    //boolean ff = true;
                    isValid =false;
                        try{    
                            System.out.print("Enter Client ID: ");
                            clientId = scanner.nextInt();
                            scanner.nextLine(); 
                            //boolean flagc = true;                    
                            //System.out.println("hhhhh");
                            // if(library.clientIDs.isEmpty()){
                            //         int clientIdEnter = scanner.nextInt();
                            //         //flagc = false;
                            //         //return;
                            //         break;
                            //     }
                            for(Integer cli:library.clientIDs){ 
                                if(cli == clientId){
                                    System.out.println("Duplicate, Please enter another ID: ");
                                    System.out.print("Enter Client ID: ");
                                    //String clientNamee = scanner.nextLine();
                                    //ff = false;
                                    //return;
                                    isValid=true; // found a duplicate
                                    break;
                                }
                            }
                        }
                        catch(Exception e){
                            System.out.println("Please enter a positive number ");
                        }
                        }
                        while(isValid); // isValid = true so iterate again
                        System.out.print("Enter Client Name: ");
                        String clientName = scanner.nextLine();
                        System.out.print("Enter Client Email: ");
                        String clientEmail = scanner.nextLine();
                        library.addClient(clientId, clientName, clientEmail);
                        System.out.println("Client added successfully.");
                        //System.out.println("Duplicated ID, Please enter another ID");
                        
                    
                      // catch(Exception e){
                        //     //ff = false;
                        //     System.out.println("Please enter a positive number ");
                        //     scanner.next();
                        //     //ff = false;
                        // }
                    //}
                    break;

                case 11: // Retrieve Client Details
                    System.out.print("Enter Client ID to retrieve: ");
                    int clientSearchId = scanner.nextInt();
                    // boolean found = false;
                    // for (Client c : library.ClientList) {
                    //     if (c.ID == clientSearchId) {
                    //         System.out.println(c.getClientDetails());
                    //         found = true;
                    //         break;
                    //     }
                    // }
                    //  if (!found) {
                    //      System.out.println("Client not found.");
                    // }
                    try { // HEREEEEEEE
                       library.getAllClients(clientSearchId);
                       Client ccc = library.getAllClients(clientSearchId);
                       System.out.println("Client ID:"+" - "+ccc.ID+"Client email: "+" - "+ccc.email+"Client name: "+" - "+ccc.name);
                    } catch (ItemNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 12: // Delete Client
                    System.out.print("Enter Client ID to delete: ");
                    int delClientId = scanner.nextInt();
                    try{
                        library.deleteClient(delClientId);
                    }
                    catch(ItemNotFoundException ee){
                        System.out.println(ee.getMessage());
                    }
                    break;
                case 13: // Update Client
                    System.out.print("Enter Client ID to update: ");
                    int ClientIDtoUpdate = scanner.nextInt();
                    System.out.print("Enter option number: ");
                    int option = scanner.nextInt();
                    System.out.print("Enter the changed data: ");
                    scanner.nextLine();
                    String updatedData = scanner.next();
                    library.updateClient(ClientIDtoUpdate, option, updatedData);
                    break;

                case 14: // Update Item
                    System.out.print("Enter Item ID to update: ");
                    int ItemIDtoUpdatee = scanner.nextInt();
                    for(LibraryItem il:library.itemList){
                        if(library.itemList.size()==0 || il.id!=ItemIDtoUpdatee){
                            System.out.println("ID unavaiable !");  
                    }
                    else{
                    System.out.print("Enter the new title: ");
                    scanner.nextLine();
                    String updatedTitle = scanner.nextLine();
                    library.updateItem(ItemIDtoUpdatee, updatedTitle);
                    break;
                    }
                }break;

                case 15:
                    System.out.println("Client Details => ");
                    library.displayAllClients();
                    break;

                case 16: // Exit
                    System.out.println("Exiting the system. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
