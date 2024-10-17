
public class Shapes {
	
	public void area() {
		System.out.println("The area is: ");
	}
	
	class Triangle extends Shapes{
		public double area(double b,  double h) {
			return 0.5 * b * h;
		}
	}
	
	class Rectangle extends Shapes{
		public double area(double l,  double b) {
			return l * b;
		}
	}
	
	class Circle extends Shapes{
		public double area(double r) {
			return 3.14 * r * r;
		}
	}
	
	class Sphere extends Shapes{
		public double area(double r) {
			return 4 * 3.14 * r * r;
		}
	}

	public static void main(String[] args) {

		Shapes myShape = new Shapes(); //create shape object
		Shapes myTriangle = new Triangle();
		Shapes myRectangle = new Rectangle();
		Shapes myCircle = new Circle();
		Shapes mySphere = new Sphere();
		
		myShape.area();
		myTriangle.area(2.5, 3.55);
		myRectangle.area(5, 6);
		myCircle.area(4.50);
		mySphere.area(0.8);

		

	}
}