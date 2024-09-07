package JavaFloat;

public class FloatParse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		e. Declare a method-local variable strNumber of type String with some value and
//		convert it to a float value using the parseFloat method. (Hint: Use
//		Float.parseFloat(String)).
		String strNumber="6889.78";
		float converted = Float.parseFloat(strNumber);
		System.out.println("Parsed Float is: "+converted);
		

	}

}
