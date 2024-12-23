package pkg2;
import java.lang.Math;

public class ComplexNum<T extends Number>{ 
// WHY NOT ?? <T extends Number, U extends Number> --> if I did this then I want 2 different types,
// but T only means only 1 datatype for everything inside this class
	public T real;
	public T img;
	
	public ComplexNum(T reall, T imgg){ // parametrized
        this.real=reall;
        this.img=imgg;
    }
	
	public ComplexNum <Double> addition(ComplexNum<T> c2){
		//    adding 2 complex numbers //
		Double realPartA = real.doubleValue() + c2.real.doubleValue();
		Double imgPartA = img.doubleValue() + c2.img.doubleValue();
		
		return new ComplexNum<Double>(realPartA,imgPartA);
	}
	public ComplexNum <Double> subtraction(ComplexNum<Double> c2){
		//    subtracting 2 complex numbers //
		Double realPartS = real.doubleValue() - c2.real.doubleValue();
		Double imgPartS = img.doubleValue() - c2.img.doubleValue();
		
		return new ComplexNum<Double>(realPartS,imgPartS);
	}
	public String toString(){
		String res = " ";
		res = "ComplexNum= "+real+"+"+img+"j";
		return res;
	}
}