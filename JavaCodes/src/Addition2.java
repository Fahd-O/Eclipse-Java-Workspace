import java.util.Scanner;

public class Addition2 
	{
	
		public static int Add(int a, int c) 
		{
			return a + c;
		}

	public static void main(String[] args) 
	{
		int z, y;
		 
		Scanner beef = new Scanner(System.in);
		
		System.out.println("Enter the 1st number: ");
		z = beef.nextInt();
		
		System.out.println("Enter the 2nd number: ");
		y = beef.nextInt();
		
		//calling of the method
		int result = Add(z, y);
		System.out.println("The result of the addition of the two numbers entered is " + result);

	}

}
