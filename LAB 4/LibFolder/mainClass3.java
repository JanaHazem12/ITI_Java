// import pkg3.LibraryItem;
// import pkg3.Book;
// import pkg3.Magazine;
// import pkg3.ItemNotFoundException;
// import pkg3.Library;
// import pkg3.Client;

// public class mainClass3{
// 	public static void main(String[] args){
// 		Library lib = new Library();
// 		// LibraryItem libI = new LibraryItem();
// 		Book book = new Book(1111, "Book 1", "Author of Book 1");
// 		Book book1 = new Book(15, "Book 1", "Author of Book 1");
// 		Magazine magazine = new Magazine(32, "Magazine 1", 1234);
// 		Client client = new Client(22, "Jana Hazem", "janahazem123@gmail.com");
// 		lib.addBook(book);
// 		lib.addBook(book1);
// 		lib.addMagazine(magazine);
// 		lib.displayAllItems();
// 		//System.out.println("AFTER DELETING");
// 		//lib.removeID(456);
// 		//lib.displayAllItems();
// 		String str = book.getItemDetails();
// 		System.out.println(str);
// 		System.out.println("DETAILS: "+str);
// 		/*lib.addClient(6666,"Ahmed Samir","ahmedsam@yahoo.com");
// 		String strC = client.getClientDetails(); 
// 		System.out.println(strC);
// 		lib.deleteClient(6666);*/
// 		//lib.removeID(2222);
// 		//lib.displayAllItems();
// 		System.out.print("GET ITEM BY ID ");
// 		lib.getItem(15);
// 	}
// }

// // create instances of Book, Magazine, Client;

// /*Create a program that integrates OOP, exception handling, generics, and wildcards. Follow these steps:
// 1. Design a class hierarchy for a simple Library
// Management System:
// - Create an abstract class 'Libraryltem' with properties like 'id' and 'title'.- DONE
// - Extend 'Libraryltem' to create subclasses 'Book' and
// 'Magazine' - DONE
// - Add a method 'getltemDetails() ' to return item details. - DONE
// 2. Implement a custom exception
// 'ItemNotFoundException' that is thrown when a library item is not found. - DONE
// 3. Create a 'Library' class to manage a collection of
// 'Libraryltem' objects:
// - Use generics and wildcards to allow adding and retrieving items of any subclass of 'Libraryltem'. - DONE
// - Implement methods to add, retrieve, and display items.
// 4. Design a class hierarchy for library clients:
// - Create a 'Client' class with properties like 'id',
// 'name', and 'email'
// - Add a method 'getClientDetails) ' to display client information.
// 5. Implement a menu system to provide CRUD (Create, Read, Update, Delete) functionalities for:
// - Library items (e.g., add books/magazines, retrieve item details, update or delete items).
// - Library clients (e.g., add clients, retrieve client details, update or delete clients).
// 6. In the main method:
// - Create instances of 'Book', 'Magazine', and 'Client'.
// - Use the menu system to demonstrate CRUD operations for both library items and clients.*/