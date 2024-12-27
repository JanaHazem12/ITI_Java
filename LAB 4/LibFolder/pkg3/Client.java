package pkg3;

public class Client{
	int ID;
	String name;
	String email;
	
	public Client(int IDc, String nameC, String emailC){
		ID = IDc;
		name = nameC;
		email = emailC;
	}
	public String getClientDetails(){
		return "Client Id: "+ID+" - "+ "Client Name: "+name+" - "+" Client Email: "+email;
	}
}

// CRUD --> create, read/retreive, update, delete //