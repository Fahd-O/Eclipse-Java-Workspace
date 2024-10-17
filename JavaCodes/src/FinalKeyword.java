
public class FinalKeyword {

	public static void main(String[] args) {
		
		final String matricNumber ;
		// System.out.println(matricNumber);
		
		matricNumber = "CSC/2018/1114";
		System.out.println(matricNumber);
		
		matricNumber = "CEE/2018/1114";// ERROR, cannot be assigned to after initialization...
		System.out.println(matricNumber);

	}

}
