import java.util.Scanner;
public class AddNumbers2 {

	public static void main(String[] args) {
		Scanner Egg = new Scanner(System.in);
		
		System.out.println("Enter an integer number here: ");
		
		int A, B, C, result ;
		
		A = Egg.nextInt();
		
		System.out.println("Enter a second integer number here: ");
		
		B = Egg.nextInt();
		
		System.out.println("Enter a third integer number here: ");
		
		C = Egg.nextInt();
		
		result = A + B + C;
		
		System.out.println("The result is: " + result);

	}

}
