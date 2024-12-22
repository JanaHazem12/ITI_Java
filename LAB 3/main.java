import java.util.function.Function;
import packagee.CentigradeToFahrenheit;
import packagee.Quadratic;
import packagee.Swap;
import packagee.MyInt;


class main{
	public static void main(String[] args){
		Function<Float, Float> functionn = new CentigradeToFahrenheit();
		System.out.println(functionn.apply(5f)); // 5 without f it's a double and double > float
		Double dd[]={2.0,10.0,2.0};
		Function<Double[],String> ff = new Quadratic();
		System.out.println(ff.apply(dd));
		MyInt a = new MyInt(); // Integer is a wrapper class, so it'streated as an obj
		MyInt b = new MyInt();
		a.x = 5;
		b.x = 10;
		Swap swapp = new Swap();
		System.out.println("a: "+a.x+" b: "+b.x);
		swapp.SwapInts(a,b);
		System.out.println("a: "+a.x+" b: "+b.x);
	}
}