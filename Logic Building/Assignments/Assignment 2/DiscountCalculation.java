//Question 4: Discount Calculation
//Write a program to calculate the discount based on the total purchase amount. Use the following
//criteria:
// If the total purchase is greater than or equal to Rs.1000, apply a 20% discount.
// If the total purchase is between Rs.500 and Rs.999, apply a 10% discount.
// If the total purchase is less than Rs.500, apply a 5% discount.
import java.util.Scanner;

public class DiscountCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

   
        double totalPurchase = sc.nextDouble();

       
        boolean hasMembership = sc.nextBoolean();

      
        double discount;

       
        if (totalPurchase >= 1000) {
            discount = 20.0;
        } else if (totalPurchase >= 500) {
            discount = 10.0;
        } else {
            discount = 5.0;
        }

        
        if (hasMembership) {
            discount += 5.0;
        }

        double discountAmount = (discount / 100) * totalPurchase;

        double finalAmount = totalPurchase - discountAmount;

        System.out.println("Discount Applied: " + discount + "%");
        System.out.println("Discount Amount: Rs." + discountAmount);
        System.out.println("Final Amount to Pay: Rs." + finalAmount);

        sc.close();
    }
}