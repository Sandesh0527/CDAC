package calculate.discount.assignment;
//4. Discount Calculation for Retail Sales
//Design a system to calculate the final price of an item after applying a discount. The system
//should:
//1. Accept the original price of an item and the discount percentage from the user.
//2. Calculate the discount amount and the final price using the following formulas:
//o Discount Amount Calculation: discountAmount = originalPrice *
//(discountRate / 100)
//o Final Price Calculation: finalPrice = originalPrice -
//discountAmount
//3. Display the discount amount and the final price of the item, in Indian Rupees (₹).
//Define class DiscountCalculator with methods acceptRecord, calculateDiscount
//& printRecord and test the functionality in main method.

import java.util.*;
public class DiscountCalculator {
	
	private float originalPrice;
	private float discountPercentage;
	private float discountAmount;
	private float finalPrice;
	//private int discount;
	
	public void acceptRecord() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Original Price :");
		originalPrice = sc.nextFloat();
		System.out.println("Enter Discount Amount Percentage :");
		discountPercentage = sc.nextFloat();
//		System.out.println("Final Price is :");
		
	}
	public void calculateDiscount() {
		discountAmount = originalPrice * (discountPercentage/100);
	}
	public void finalPrice() {
		finalPrice = originalPrice - discountAmount;
		
	}
	public void printRecord() {
		System.out.printf("Discount Amount:  "+ discountAmount + "₹");
        System.out.printf("Final Price after Discount: " +finalPrice +"₹");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DiscountCalculator discount = new DiscountCalculator();
		discount.acceptRecord();
		discount.calculateDiscount();
		discount.finalPrice();
		discount.printRecord();

	}

}
