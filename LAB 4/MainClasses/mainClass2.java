import pkg2.ComplexNum;

class mainClass2{
	public static void main(String[] args){
		ComplexNum<Double> c1 = new ComplexNum<Double>(2.0,3.0);
		ComplexNum<Double> c2 = new ComplexNum<Double>(4.0,5.0);
		
		ComplexNum<Integer> c3 = new ComplexNum<Integer>(5,3);
		ComplexNum<Integer> c4 = new ComplexNum<Integer>(10,2);
		
		/*ComplexNum<Double> result = new ComplexNum<Double>(); noo new just the addition
		result = c1.addition(c2);*/
		
		ComplexNum<Double> resultA = c1.addition(c2);
		System.out.println("Addition => "+resultA.toString());
		ComplexNum<Double> resultS = c1.subtraction(c2);
		System.out.println("Subtraction => "+resultS.toString());
		
		ComplexNum<Double> result2a = c3.addition(c4);
		System.out.println("Addition => "+result2a.toString());
		ComplexNum<Double> result2s = c3.subtraction(c4);
		System.out.print("Subtraction => "+result2s.toString());
	}
}