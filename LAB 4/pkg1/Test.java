package pkg1;
import java.util.List;

public class Test{
	// ? extends Shape --> List accepts anything that extends shape
	public void drawAll(List<? extends Shape> listt){ 
		for(Shape t : listt){ // for each Shape 't' in listt
			//System.out.print("gg");
			t.draw(); // call draw function of t (Circle OR Rectangle)
		}
	} // UPPER BOUND (using 'super' is lower bound)
}