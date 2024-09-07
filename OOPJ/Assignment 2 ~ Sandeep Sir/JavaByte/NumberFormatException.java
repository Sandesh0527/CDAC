package bytes;

public class NumberFormatException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		f. Declare a method-local variable strNumber of type String with the value
//		"Ab12Cd3" and attempt to convert it to a byte value. (Hint: parseByte method will
//		throw a NumberFormatException)
		String strNumber = "Ab12Cd3";
		byte converted = Byte.parseByte(strNumber);
		System.out.println(converted);

	}

}
