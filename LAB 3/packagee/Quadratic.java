package packagee;
import java.util.function.Function;
import java.lang.Math;

public class Quadratic implements Function<Double[],String>{ // array has 3 nums

	 // a helper function is better in edits instead of changing this formula inside every method
	private Double getSqrt(double a, double b, double c){
		Double complex = Math.sqrt((b*b)-4*(b*c));
		return complex;
	}
	@Override
	public String apply(Double []arr){
		// arr[0] = a;
		// arr[1] = b;
		// arr[2] = c;
		String result = " ";
		//Double complex = Math.sqrt((arr[1]*arr[1])-4*(arr[0]*arr[2]));
		Double complexx = getSqrt(arr[0], arr[1], arr[2]);
		double res1P = -arr[1]+complexx;
		double res1L = -arr[1]-complexx;
		double res2 = 2*arr[0];
		if(complexx.isNaN()){ // if complex = NULL thennn invalid numm
			result = "complex number !!";
			return result;
		}
		else{
		double finalresP = res1P/res2;
		double finalresS = res1L/res2;
		result = result + "PLUS: " + finalresP + " , " + "SUBTRACT: " + finalresS;
		return result;
		}
	}
}