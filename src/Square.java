
public class Square extends GeometricalShape{

	public Square(double side) {
		super(side);
	}
	
	public void calculateArea() {
		area = side * side;
		super.calculateArea();
	}
	
	public void calculatePerimeter() {
		perimeter = 4 * side;
		super.calculatePerimeter();
	}
}
