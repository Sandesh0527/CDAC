package question4.discount.calculate;

import java.util.Scanner;


class DiscountCalculator {
 private double originalPrice;
 private double discountRate;


 public DiscountCalculator() {
 }


 public DiscountCalculator(double originalPrice, double discountRate) {
     this.originalPrice = originalPrice;
     this.discountRate = discountRate;
 }

 public void setOriginalPrice(double originalPrice) {
     this.originalPrice = originalPrice;
 }

 public double getOriginalPrice() {
     return originalPrice;
 }

 public void setDiscountRate(double discountRate) {
     this.discountRate = discountRate;
 }

 public double getDiscountRate() {
     return discountRate;
 }


 public double calculateDiscountAmount() {
     return originalPrice * (discountRate / 100);
 }

 
 public double calculateFinalPrice() {
     return originalPrice - calculateDiscountAmount();
 }

 @Override
 public String toString() {
     return "Original Price: ₹" + originalPrice + ", Discount Rate: " + discountRate + "%";
 }
}


class DiscountCalculatorUtil {
 DiscountCalculator discountCalculator = new DiscountCalculator();


 public void acceptRecord(Scanner sc) {
     System.out.println("Enter Original Price : ");
     discountCalculator.setOriginalPrice(sc.nextDouble());

     System.out.println("Enter Discount Rate (%): ");
     discountCalculator.setDiscountRate(sc.nextDouble());
 }


 public void printRecord() {
     double discountAmount = discountCalculator.calculateDiscountAmount();
     double finalPrice = discountCalculator.calculateFinalPrice();
     System.out.printf("Discount Amount: ₹ %.2f\n", discountAmount);
     System.out.printf("Final Price: ₹ %.2f\n", finalPrice);
     System.out.println();
 }


 public int menuList(Scanner sc) {
     System.out.println("Select Option:");
     System.out.println("0. Exit");
     System.out.println("1. Accept Record");
     System.out.println("2. Print Record");
     System.out.println();
     return sc.nextInt();
 }
}


public class DiscountProgram {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     DiscountCalculatorUtil calculatorUtil = new DiscountCalculatorUtil();
     int choice;
     while ((choice = calculatorUtil.menuList(sc)) != 0) {
         switch (choice) {
             case 1:
                 calculatorUtil.acceptRecord(sc);
                 break;
             case 2:
                 calculatorUtil.printRecord();
                 break;
             default:
                 System.out.println("Wrong Choice");
         }
     }
   
     sc.close();
 }
}

