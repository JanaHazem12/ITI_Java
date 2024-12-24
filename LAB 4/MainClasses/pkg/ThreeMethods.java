package pkg;
import pkg.OutOfRangeException;


public class ThreeMethods{
	public void IdWithinRange(int id) throws OutOfRangeException{
		if(id > 100 && id < 300){
			System.out.println("ID within the range");
		}
		else{
			//System.out.println("elseee");
			throw new OutOfRangeException("ID out of range");
		}
	}
	public void IdNegative(int id) throws UnsupportedOperationException{
		if(id > 0){
			System.out.println("ID within the range");
		}
		else{
			throw new UnsupportedOperationException("ID is negative");
		}
	}
	public void IdZero(int id) throws IllegalArgumentException{
		if(id != 0){
			System.out.println("ID within the range");
		}
		else{
			throw new IllegalArgumentException("ID is = zero");
		}
	}
}