
public class Car {
	
	int noOfdoors;
	String colour;
	int speed;
	String Brand;
	String Gear;
	
	public Car() {
		this.noOfdoors = 0;
		this.colour = "Chrome";
		this.speed = 20;
		this.Brand = "Generic";
		this.Gear = "Automatic";
	}
	
	public Car(int D, String C, int S, String B, String G) {
		this.noOfdoors = D;
		this.colour = C;
		this.speed = S;
		this.Brand = B;
		this.Gear = G;
	}

	public static void main(String[] args) {
		
		Car Ferrari = new Car();
		System.out.println(Ferrari.noOfdoors);
		System.out.println(Ferrari.colour);
		System.out.println(Ferrari.speed);
		System.out.println(Ferrari.Brand);
		System.out.println(Ferrari.Gear);

	}

}
