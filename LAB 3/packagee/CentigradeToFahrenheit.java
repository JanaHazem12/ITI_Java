package packagee;
import java.util.function.Function;

public class CentigradeToFahrenheit implements Function<Float, Float>{
	private Float getFormula(Float v){
		Float value = v*(9.0f/5.0f)+32.0f;
		return value;
	}
	@Override
	public Float apply(Float d){ // d = T
		/*float x = 9/5*f+32;
		return x;*/ // I can NOT return x cause x is a float NOT a class and I'm returning a CLASS here
		Float res = getFormula(d);
		System.out.print("C to F: ");
		return res; // without f it's a double and double > float , at least wahda f
	}		
}
