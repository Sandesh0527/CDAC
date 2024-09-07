package Short;

public class StringToWrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		h. Declare a method-local variable strNumber of type String with some short value
//		and convert it to the corresponding wrapper class using Short.valueOf(). (Hint:
//		Use Short.valueOf(String)).
		String strNumber = "123";
		short convertedNum = Short.valueOf(strNumber);
		System.out.println("Converted string to the corresonding wrapper class is:" +convertedNum);
		

	}

}
