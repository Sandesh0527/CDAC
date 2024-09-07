package bytes;

public class ByteToStringWrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		h. Declare a method-local variable strNumber of type String with some byte value
//		and convert it to the corresponding wrapper class using Byte.valueOf(). (Hint: Use
//		Byte.valueOf(String)).
		String strNumber = "121";
		
        System.out.println(Byte.valueOf(strNumber));
	}

}
