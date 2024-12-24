package pkg3;
import pkg3.LibraryItem;
import java.lang.String;
import java.util.*;

public class Magazine extends LibraryItem{
	int issueNum;
	public Magazine(int IDm, String titleM, int issueNum){
		super(IDm, titleM);
		this.issueNum = issueNum;
	}
	@Override
	public void display1Item(){ 
		super.display1Item();
		System.out.println(issueNum);
	}
	@Override
	public String getItemDetails(){
		// get id & title //
		return "ID: "+id+"Title: "+title+" Issue Number: "+issueNum;
	}
}

// CRUD --> create, read, update, delete //
