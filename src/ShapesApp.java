
public class ShapesApp {
	public static void main(String[] args) {
		//ShapeServices service = new ShapeServices();
		//service.menu();
		
		GeometricalShape c = new Circle(12);
		ShapeServices service = new ShapeServices(c);
		service.calculateArea();
		//service.calculatePerimeter();
	}
}
