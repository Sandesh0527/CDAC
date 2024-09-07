package practice;

public class BooleanValueString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		f. Declare a method-local variable strStatus of type String with the value "true"
//		and convert it to the corresponding wrapper class using Boolean.valueOf(). (Hint:
//		Use Boolean.valueOf(String))
		String strStatus = "true";
		boolean converted = Boolean.valueOf(strStatus);
		System.out.println("Converted is: " +converted);
	}

}
