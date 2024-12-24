package pkg3;
import java.util.ArrayList;
import java.util.List;

import pkg3.LibraryItem;

public class Book extends LibraryItem{
	String author;
	public Book(int ID, String title, String authorr){
		super(ID, title);
		this.author = authorr;
	}
	@Override
	public void display1Item(){
		super.display1Item();
		System.out.println(author);
	}
	@Override
	public String getItemDetails(){
		// get id & title //
		return "ID: "+id+" Title: "+title+" Author: "+author;
	}
}

// CRUD --> create, read, update, delete //