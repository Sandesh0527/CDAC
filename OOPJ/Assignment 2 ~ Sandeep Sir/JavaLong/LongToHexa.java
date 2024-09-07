package javalong;

public class LongToHexa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		k. Declare a long variable with the value 7. Convert it to binary, octal, and
//		hexadecimal strings using methods from the Long class. (Hint: Use
//		Long.toBinaryString(long), Long.toOctalString(long), and
//		Long.toHexString(long)).
		long num = 7;
		System.out.println("Binary Conversion:"+Long.toBinaryString(num));
		System.out.println("Octal Conversion: "+Long.toOctalString(num));
		System.out.println("Hexa Conversion:"+Long.toHexString(num));


	}

}
