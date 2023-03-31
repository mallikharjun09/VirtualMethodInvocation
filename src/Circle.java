
public class Circle extends GeometricalShape{
	
	public Circle(double side) {
		super(side);
	}
	
	public void calculateArea() {
		area = PI * side * side;
		super.calculateArea();
	}
	
	public void calculatePerimeter() {
		perimeter = 2 * PI * side;
		super.calculatePerimeter();
	}
}
