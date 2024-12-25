import pkg.ThreeMethods;
import pkg.OutOfRangeException;

public class main{
	public static void main(String[] args){
		ThreeMethods methods = new ThreeMethods();
		try{
		//methods.IdWithinRange(200);
		
		methods.IdWithinRange(400);
		
		//methods.IdNegative(200);
		
		methods.IdNegative(65);
		
		//methods.IdZero(32);
		
		methods.IdZero(0);
		}
		catch(IllegalArgumentException exc3){
			System.out.println(exc3.getMessage());
		}
		catch(OutOfRangeException exc1){
			System.out.println(exc1.getMessage());
		}
		catch(UnsupportedOperationException exc2){
			System.out.println(exc2.getMessage());
		}
		finally{
			System.out.println("finally block");
		}
		
		
		/*try{
		//methods.IdNegative(200);
		methods.IdNegative(-1);
		}
		catch(MyOwnException exc2){
			System.out.println(exc2.getMessage());
		}
		finally{
			System.out.println("finally of block 2");
		}*/
		/*try{
		//methods.IdZero(32);
		methods.IdZero(0);
		}
		catch(MyOwnException exc3){
			System.out.println(exc3.getMessage());
		}
		finally{
			System.out.println("finally of block 3");
		}*/
	}
}