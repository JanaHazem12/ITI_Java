import pkg1.Rectangle;
import pkg1.Circle;
import pkg1.Shape;
import pkg1.Test;
import java.util.ArrayList;
import java.util.List;


public class mainClass{
	public static void main(String [] args){
		Rectangle r = new Rectangle();
		Circle c = new Circle();
		List<Rectangle> list1 = new ArrayList<Rectangle>();
		list1.add(r);
		//list1.add(c); // I can't do this cause Circle does NOT extend from Rectangle so COMPILER ERROR
		//System.out.print(list1);
		List<Shape> list2 = new ArrayList<Shape>();
		list2.add(c);
		list2.add(r); // gave list 2 a Circle & a Rectangle cause they both extend Shape
		Test testt = new Test();
		System.out.print("List 1 => ");
		testt.drawAll(list1);
		System.out.print("\n");
		System.out.print("List 2 => ");
		testt.drawAll(list2);
	}
}