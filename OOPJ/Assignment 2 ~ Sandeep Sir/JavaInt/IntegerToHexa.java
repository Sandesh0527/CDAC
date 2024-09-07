package question4;

public class IntegerToHexa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		k. Declare an integer variable with the value 7. Convert it to binary, octal, and
//		hexadecimal strings using methods from the Integer class. (Hint: Use
//		Integer.toBinaryString(int), Integer.toOctalString(int), and
//		Integer.toHexString(int))
		int num = 7;
		System.out.println("Hexadecimal: "+ Integer.toHexString(num));
		System.out.println("Binary:  "+Integer.toBinaryString(num));
		System.out.println("Octal: "+Integer.toOctalString(num));

	}

}
