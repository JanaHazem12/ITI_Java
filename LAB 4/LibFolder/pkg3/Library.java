package pkg3;
import pkg3.LibraryItem;
import pkg3.Client;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import pkg3.ItemNotFoundException;


public class Library{
	// array of objects of type Library //
	public List <LibraryItem> itemList = new ArrayList<>(); // array of objects of LI obj.
	public List<Client> ClientList = new ArrayList<>();
	/*public List<Magazine> MagazineList = new ArrayList<>();
	public List <Book> BookList = new ArrayList<>();*/

	public <T extends LibraryItem> void addItem(T LibraryItemm){
		itemList.add(LibraryItemm);
	} // DONE
	public void getItem(int searchID) throws ItemNotFoundException{
		int ff = 0;
		for(LibraryItem bb : itemList){
				if(bb.id == searchID){
					System.out.println("ID: "+bb.id+" Found Successfully");
					bb.display1Item();
					ff=1;
			}
			if(ff==1){
				return;
			}
		}
		if(ff==0){
			throw new ItemNotFoundException(" NO ");
		}
	}
	public void addClient(int ClientID, String ClientName, String ClientEmail ){
	 // create an obj in main including all client deets & pass it in the addClient func
		Client c = new Client(ClientID, ClientName, ClientEmail); // params ??
		ClientList.add(c);
	} // DONE
	public void deleteClient(int RemoveID) throws ItemNotFoundException{ // check if I've this ID is available or NOT
		/*if(ClientList.contains(RemoveID)){
			ClientList.remove();
		}*/
		for(Client c: ClientList){
			int fc=0;
			if(c.ID == RemoveID){
				fc=1;
				System.out.println("ID: "+c.ID+" Removed Successfully");
				ClientList.remove(c);
				return;
			}
			if(fc==0){
				throw new ItemNotFoundException(" NO ");
			}
		}
	} // DONE
	public void addMagazine(Magazine m){
		//Magazine m = new Magazine(MagazineID, MagazineTitle, MagazineIssueNum);
		itemList.add(m);
	}
	public void addBook(Book b){
		//Book b = new Book(BookID, BookTitle, BookAuthor);
		itemList.add(b);
	}	
	public void removeID(int RemoveBookId) throws ItemNotFoundException{
		int f = 0;
		for(LibraryItem b : itemList){
			if(b.id == RemoveBookId){
				itemList.remove(b);
				f=1;
				System.out.println("ID: "+b.id+" Removed Successfully");
				return;
			}
		}
		if(f==0){
		//System.out.println("Unavailable ID");
			throw new ItemNotFoundException(" NO ");
		}
	}
	public void displayAllItems(){
		for(LibraryItem i:itemList){
			i.display1Item();
		}
		//Book.display1Item();
	}
}

// MANAGING A COLLECTION OF LibraryItem OBJECTS //
// Use generics & wildcards to allow adding & retreiving items of any subclass of LibraryItem //
// Implement methods to add, retreive, display items //