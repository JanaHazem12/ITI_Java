package pkg3;

import java.util.ArrayList;
import java.util.List;

public abstract class LibraryItem{
	int id;
	String title;
	//boolean isBorrowed = false; // NOT borrowed yet
//public List <LibraryItem> itemListt = new ArrayList<>(); // array of objects of LI obj.

	public LibraryItem(int id, String title){
		this.id = id;
		this.title = title;
	}
	public abstract String getItemDetails();
	public void display1Item(){ // override in Book & Magazine
			System.out.print("ID: "+id+" - "+"Title: "+title+" - "+"Author/Issue Number: ");			
	} // DONE
}
