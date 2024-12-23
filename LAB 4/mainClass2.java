import pkg2.ComplexNum;

class mainClass2{
	public static void main(String[] args){
		ComplexNum<Double> c1 = new ComplexNum<Double>(2.0,3.0);
		ComplexNum<Double> c2 = new ComplexNum<Double>(4.0,5.0);
		/*ComplexNum<Double> result = new ComplexNum<Double>(); noo new just the addition
		result = c1.addition(c2);*/
		ComplexNum<Double> resultA = c1.addition(c2);
		System.out.println(resultA.toString());
		ComplexNum<Double> resultS = c1.subtraction(c2);
		System.out.print(resultS.toString());
	}
}