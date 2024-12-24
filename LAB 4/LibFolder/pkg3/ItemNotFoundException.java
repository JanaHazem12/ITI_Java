package pkg3;
import pkg3.LibraryItem;

public class ItemNotFoundException extends Exception{
	public ItemNotFoundException(String msg){
		super(msg);
	}
}

// THROWN WHEN A LibraryItem IS NOT FOUND //