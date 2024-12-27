package pkg3;
import pkg3.LibraryItem;
import pkg3.Client;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import pkg3.ItemNotFoundException;
import java.util.stream.*;


public class Library{
	// array of objects of type Library //
	public List <LibraryItem> itemList = new ArrayList<>(); // array of objects of LI obj.
	public List<Client> ClientList = new ArrayList<>();
	public List<LibraryItem> ClientBorrowedItems = new ArrayList<>();
	public List<Integer> itemsIDs = new ArrayList<>();
	public List<Integer> borrowedItemsIDs = new ArrayList<>();
	public List<Integer> clientIDs = new ArrayList<>();
	public List<Integer> clientIDBorrowed = new ArrayList<>();

	/*public List<Magazine> MagazineList = new ArrayList<>();
	public List <Book> BookList = new ArrayList<>();*/

	public <T extends LibraryItem> void addItem(T LibraryItemm){
		itemList.add(LibraryItemm);
	} // DONE
	public LibraryItem getItem(int searchID) throws ItemNotFoundException{
		//int ff = 0;
		for(LibraryItem bb : itemList){
				if(bb.id == searchID){
					System.out.println("ID: "+bb.id+" Found Successfully");
					bb.display1Item();
					//ff=1;
					return bb;
			}
		}
			throw new ItemNotFoundException("ID unavailable, Please Enter a valid ID ! ");
	}
	// public LibraryItem getItem(int searchID) throws ItemNotFoundException{
	// 	//int ff = 0;
	// 	for(LibraryItem bb : itemList){
	// 			if(bb.id == searchID){
	// 				System.out.println("ID: "+bb.id+" Found Successfully");
	// 				bb.display1Item();
	// 				//ff=1;
	// 				return bb;
	// 		}
	// 	}
	// 		throw new ItemNotFoundException("ID unavailable, Please Enter a valid ID ! ");
	// }
	public void addClient(int ClientID, String ClientName, String ClientEmail ){
	 // create an obj in main including all client deets & pass it in the addClient func

		Client c = new Client(ClientID, ClientName, ClientEmail); // params ??
		ClientList.add(c);
		clientIDs.add(ClientID);
	} // DONE
	public void deleteClient(int RemoveID) throws ItemNotFoundException{ // check if I've this ID is available or NOT
		/*if(ClientList.contains(RemoveID)){
			ClientList.remove();
		}*/
		for(Client c: ClientList){
			//System.out.println("delete 1");
			int fc=0;
			if(c.ID == RemoveID){
				//System.out.println("delete 2");
				fc=1;
				ClientList.remove(c);
				for(Integer xx:clientIDs){
					//System.out.println("delete 3");
					if(xx == RemoveID){
					clientIDs.remove(xx);
					}				
					System.out.println("ID: "+c.ID+" Removed Successfully");
					return;
				}
				//return;
			}
			if(fc==0){
				throw new ItemNotFoundException("ID unavailable, Please Enter a valid ID ! ");
			}
		//}
	}
 } // DONE
	public Client getAllClients(int searchIClientID) throws ItemNotFoundException{
		int fff = 0;
		Client clientGetter = ClientList.stream().filter(Client->Client.ID==searchIClientID).findFirst().orElse(null);
		// orElse --> law mal2ash haga yraga3 NULL
		//for(Client ccc : ClientList){
				//if(ccc.ID == searchIClientID){
					// System.out.println("ID: "+ccc.ID+" Found Successfully");
					// System.out.println(ccc.getClientDetails());
					// fff=1;
					// return ccc;
			//}
			if(clientGetter == null){
				throw new ItemNotFoundException("Client ID unavailable, Please Enter a valid ID ! ");
			}
			return clientGetter;
			// if(fff==1){
			// 	return;
			// }
	}
	public void addMagazine(Magazine m){
		//Magazine m = new Magazine(MagazineID, MagazineTitle, MagazineIssueNum);
		itemList.add(m);
		itemsIDs.add(m.id);
	}
	public void addBook(Book b){
		//Book b = new Book(BookID, BookTitle, BookAuthor);
		itemList.add(b);
		itemsIDs.add(b.id);
	}	
	public void removeID(int RemoveBookId) throws ItemNotFoundException{
		//int f = 0;
		for(LibraryItem b : itemList){
			System.out.println("HENAA");
			if(b.id == RemoveBookId){
				itemList.remove(b);
				//f=1;
				System.out.println("ID: "+b.id+" Removed Successfully");
				for(int i=0;i<itemsIDs.size();i++){
					if(itemsIDs.get(i)== RemoveBookId)
					{
						itemsIDs.remove(i);
					}
				}
				return;
			}
		}
		// System.out.println("sfcedtfgdexsg"+itemsIDs.size());
		
		for(int i=0;i<itemsIDs.size();i++)
		{
			if(itemsIDs.get(i)== RemoveBookId)
			{
				itemsIDs.remove(i);
			}
		}
		//if(f==0){
		//System.out.println("Unavailable ID");*/
			//throw new ItemNotFoundException("ID unavailable, Please Enter a valid ID ! ");
		//}
	}
	public void borrowItem(int userID, int itemID){
		// add the item ID in the borrowed items array //
		// DO NOT BORROW IF IT'S IN THE BORROWED ITEMS IDs LIST //
		// for(Integer cidd : clientIDs){
		// 	System.out.println("clientIDs =>" +cidd);
		// 		if(cidd == userID){
			// for(Integer cidd : clientIDs){
			// 	System.out.println("CLIENTSSSSSS");
			// 	if(cidd != userID){
			// 		System.out.println("CLIENT ID UNAVAILABLE");
			// }
		for(Integer bitems : borrowedItemsIDs){
			System.out.println(bitems);
			if(itemID == bitems){
				System.out.println("Sorry, this item is borrowed at the moment !");
				return;
			}
		}
		for(Integer bii : itemsIDs){
			if(itemID == bii){
				//System.out.print("Borrowed Items ID => "+itemID);
				borrowedItemsIDs.add(itemID);
				try{
					LibraryItem licc = getItem(itemID);
					for(Client cl : ClientList){
						if(cl.ID == userID){
							ClientBorrowedItems.add(licc);
							clientIDBorrowed.add(userID);
						}
					}
				}
				catch(ItemNotFoundException ie){
					System.out.println("ID"+itemID+" unavailable, Please Enter a valid ID ! ");
				}
			}
		}
	//}	
	//}

	}
	public void displayAllItems(){
		for(LibraryItem i:itemList){
			// System.out.println("ID, Title, ");
			i.display1Item();
		}
	}
	public void returnItem(int returnItemId, int ReturnuserId){
		// if the client who borrowed is the one who returned //
		for(Integer x:borrowedItemsIDs){
			if(x == returnItemId){
				System.out.println("Item returned successfully !");
				borrowedItemsIDs.remove(x);
				for(Integer cx:clientIDBorrowed){
					if(cx == ReturnuserId){
					//System.out.println("SECOND");
					clientIDBorrowed.remove(cx);
					//System.out.println("CX: "+cx); 
					return;
					}
				}
				for(LibraryItem lix:ClientBorrowedItems){
					if(lix.id == returnItemId){
						ClientBorrowedItems.remove(lix);
						//System.out.println("LIX: "+lix);					
						return;
					}
				}
				
			}
			//System.out.println("Item returned successfully !");
		}
		System.out.println("UNAVAILABLE RETURN !");

		// 	for(LibraryItem cbi: ClientBorrowedItems){
		// 		if(cbi.id == returnItemId){  // checking if the ID is in ClientBorrowedIDs
		// 			for(Integer h:clientIDBorrowed){
		// 				if(h == ReturnuserId){ // checking if the returnUserID is included in ClientIDBorrowed
		// 					ClientBorrowedItems.remove(h);
		// 					System.out.println("Item returned successfuly");
		// 					for(Integer bbbb:borrowedItemsIDs){
		// 						if(bbbb==returnItemId){
		// 							borrowedItemsIDs.remove(returnItemId);
		// 						}
		// 					}
		// 				}
		// 			}
		// 			System.out.println("ClientID unavailable");
		// 		}
		// }
	}
	public void updateClient(int updateClientID, int Option, String s){
		if(Option == 1){ // change name
			for(Client cu:ClientList){
				if(cu.ID == updateClientID){
					cu.name = s;
					System.out.println("Updated successfully !");
				}
			}
		}
		else if(Option == 2){ // change email
			for(Client cu:ClientList){
				if(cu.ID == updateClientID){
					cu.email = s;
					System.out.println("Client Updated successfully !");
				}
			}
		}
	}
	public void updateItem(int itemmIDD, String changeTitle){
		//if(OptionItem == 1){ // change title
			for(LibraryItem il:itemList){
				if(il.id == itemmIDD){
					//LibraryItem lii;
					il.title = changeTitle;
					System.out.println("Item Updated successfully !");
				}
			}
		//}
	}
		public void displayBorrowedItemsIDs(){
			for(Integer bi:borrowedItemsIDs){
				System.out.println(bi);
			}
		}
		public void displayItemsIDs(){
			for(Integer v:itemsIDs){
				System.out.println(v);
		}
		//Book.display1Item();
	}
	public void displayAllClients(){
		for(Client allC:ClientList){
			System.out.println("Client ID:"+" - "+allC.ID+" Client email: "+" - "+allC.email+" Client name: "+" - "+allC.name);
	//Book.display1Item();
		}
	}
}

// MANAGING A COLLECTION OF LibraryItem OBJECTS //
// Use generics & wildcards to allow adding & retreiving items of any subclass of LibraryItem //
// Implement methods to add, retreive, display items //