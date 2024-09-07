package practice;

public class BooleanToString {

	public static void main(String[] args) {
//		b. Declare a method-local variable status of type boolean with the value true and
//		convert it to a String using the toString method. (Hint: Use
//		Boolean.toString(Boolean) )
		boolean status = true ;
		String converted = Boolean.toString(status);
		System.out.println("Boolean value as string :" +converted);
	}

}
