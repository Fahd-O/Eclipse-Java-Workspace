import java.util.Scanner;
public class CGPA {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		float result;
		
		System.out.println("Enter your CGPA here to know where you fall: ");
		
		result = reader.nextFloat();
		if (result > 4.49 && result <= 5.00) {
			System.out.println("You are on a 1st Class Division");
		}
		else if (result > 3.49 && result < 4.50) {
			System.out.println("You are on a 2nd Class Upper Division");
		}
		else if (result > 2.49 && result < 3.50) {
			System.out.println("You are on a 2nd Class Lower Division");
		}
		else if (result >= 1.50 && result < 2.50) {
			System.out.println("You are on a 3rd Class Division");
		}
		else if (result >= 0.00 && result < 1.50) {
			System.out.println("Adviced to Withdraw");
		}
		else {
			System.out.println("Invalid CGPA entered, please kindly enter a valid CGPA within the range of 0.00 to 5.00");
		}

	}

}
