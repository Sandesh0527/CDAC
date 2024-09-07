package question8;

public class ToString {

	
		// TODO Auto-generated method stub
//		Conversion between Primitive Types and Strings
//		Initialize a variable of each primitive type with a user-defined value and convert it
//		into String:
//		o First, use the toString method of the corresponding wrapper class. (e.g.,
//		Integer.toString()).
//		o Then, use the valueOf method of the String class. (e.g.,
//		String.valueOf()).
	public static void main(String[] args) {
        // Initialize primitive variables
        int intValue = 42;
        double doubleValue = 3.14159;
        float floatValue = 9.99f;
        long longValue = 123456789L;
        boolean booleanValue = true;
        char charValue = 'A';
        byte byteValue = 10;
        short shortValue = 500;

        // Conversion using toString() method of the wrapper class
        String intString1 = Integer.toString(intValue);
        String doubleString1 = Double.toString(doubleValue);
        String floatString1 = Float.toString(floatValue);
        String longString1 = Long.toString(longValue);
        String booleanString1 = Boolean.toString(booleanValue);
        String charString1 = Character.toString(charValue);
        String byteString1 = Byte.toString(byteValue);
        String shortString1 = Short.toString(shortValue);

        // Conversion using String.valueOf() method
        String intString2 = String.valueOf(intValue);
        String doubleString2 = String.valueOf(doubleValue);
        String floatString2 = String.valueOf(floatValue);
        String longString2 = String.valueOf(longValue);
        String booleanString2 = String.valueOf(booleanValue);
        String charString2 = String.valueOf(charValue);
        String byteString2 = String.valueOf(byteValue);
        String shortString2 = String.valueOf(shortValue);

        // Print the converted Strings
        System.out.println("Using toString():");
        System.out.println("int: " + intString1);
        System.out.println("double: " + doubleString1);
        System.out.println("float: " + floatString1);
        System.out.println("long: " + longString1);
        System.out.println("boolean: " + booleanString1);
        System.out.println("char: " + charString1);
        System.out.println("byte: " + byteString1);
        System.out.println("short: " + shortString1);

        System.out.println("\nUsing String.valueOf():");
        System.out.println("int: " + intString2);
        System.out.println("double: " + doubleString2);
        System.out.println("float: " + floatString2);
        System.out.println("long: " + longString2);
        System.out.println("boolean: " + booleanString2);
        System.out.println("char: " + charString2);
        System.out.println("byte: " + byteString2);
        System.out.println("short: " + shortString2);
    }
}
//		

	


