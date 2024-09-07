package bytes;

public class NumberToByte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		e. Declare a method-local variable strNumber of type String with some value and
//		convert it to a byte value using the parseByte method. (Hint: Use
//		Byte.parseByte(String)).
         String strNumber = "123";
         byte converted = Byte.parseByte(strNumber);
         System.out.println("Converted is" +converted);
	}

}
