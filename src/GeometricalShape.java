
public class GeometricalShape {
	protected double area,perimeter, side;
	protected double PI = 3.14;
	
	public GeometricalShape(double side) {
		this.side = side;
	}
	
	public void calculateArea() {
		System.out.println("The area of a "+this.getClass().getSimpleName()+" is "+area);
	}
	
	public void calculatePerimeter() {
		System.out.println("The perimeter of a "+this.getClass().getSimpleName()+" is "+perimeter);
	}
}
