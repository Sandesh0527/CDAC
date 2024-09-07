package practice;

public class BooleanParse {

	public static void main(String[] args) {
//		c. Declare a method-local variable strStatus of type String with the value "true"
//		and convert it to a boolean using the parseBoolean method. (Hint: Use
//		Boolean.parseBoolean(String)).
        String strStatus = "true" ;
        boolean converted = Boolean.parseBoolean(strStatus);
        System.out.println("Converted Boolean is:" +converted);
	}

}
