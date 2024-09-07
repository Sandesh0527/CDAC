package question4;

public class NumberFormatException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		f. Declare a method-local variable strNumber of type String with the value
//		"Ab12Cd3" and attempt to convert it to an int value. (Hint: parseInt method will
//		throw a NumberFormatException).
		String strNumber = "Ab12Cd3";
		int parsedValue = Integer.parseInt(strNumber);
		System.out.println(parsedValue);
		
		

	}

}
