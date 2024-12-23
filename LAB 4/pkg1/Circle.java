package pkg1;
import pkg1.Shape;

public class Circle extends Shape{
	public void draw(){ // overriding on draw of Shape
		System.out.print(" drawing Circle ");
	}
}