import java.util.Scanner;

public class ShapeServices {
	private Scanner scan = new Scanner(System.in);
	private GeometricalShape geo;
	//default constructor
	public ShapeServices() {}
	
	//Parameterized constructor
	public ShapeServices(GeometricalShape geo) {
		this.geo = geo;
	}
	
	public void calculateArea() {
		geo.calculateArea();
	}
	
	public void calculatePerimeter() {
		geo.calculatePerimeter();
	}
	
	public void calculateArea(GeometricalShape shape) {
		shape.calculateArea();
	}
	
	public void calculatePerimeter(GeometricalShape shape) {
		shape.calculatePerimeter();
	}
	
	public void menu() {
		//Empty shape object
		GeometricalShape geo=null;
		
		
		while(true) {
			System.out.println("Geometrical Shapes App");
			System.out.println("Enter the side/radius of the Shape ");
			int side = scan.nextInt();
			System.out.println("\n\tPress 1 for calculate Area and Perimeter for a Circle");
			System.out.println("\tPress 2 for calculate Area and Perimeter for a Square");
			System.out.println("\n\n\tPlease Enter your choice ");
			int x = scan.nextInt();
			switch(x) {
			case 1 : geo = new Circle(side);break;
			case 2 : geo = new Square(side);break;
			case 9 : System.exit(x);
			default : geo = new GeometricalShape(side);
			}
			
			calculateArea(geo);
			calculatePerimeter(geo);
		}
	}
}
