package interest.compound.assignment;

//2. Compound Interest Calculator for Investment
//Develop a system to compute the future value of an investment with compound interest. The
//system should:
//1. Accept the initial investment amount, annual interest rate, number of times the
//interest is compounded per year, and investment duration (in years) from the user.
//2. Calculate the future value of the investment using the formula:
//o Future Value Calculation:
//▪ futureValue = principal * (1 + annualInterestRate /
//numberOfCompounds)^(numberOfCompounds * years)
//o Total Interest Earned: totalInterest = futureValue - principal
//3. Display the future value and the total interest earned, in Indian Rupees (₹).
//Define class CompoundInterestCalculator with methods acceptRecord ,
//calculateFutureValue, printRecord and test the functionality in main method.
import java.util.*;
import java.util.Scanner;

class CompoundInterestCalculator {

	private double principal;
	private double annualInterestRate;
	private int numberOfCompounds;
	private int years;
	private double futureValue;
	private double totalInterest;

	public void acceptRecord() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the initial investment amount (₹): ");
		principal = sc.nextDouble();

		System.out.print("Enter the annual interest rate (as a percentage): ");
		annualInterestRate = sc.nextDouble() / 100; //

		System.out.print("Enter the number of times the interest is compounded per year: ");
		numberOfCompounds = sc.nextInt();

		System.out.print("Enter the investment duration (in years): ");
		years = sc.nextInt();
	}

	public void calculateFutureValue() {
		futureValue = principal * Math.pow((1 + annualInterestRate / numberOfCompounds), numberOfCompounds * years);
		totalInterest = futureValue - principal;
	}

	public void printRecord() {
		System.out.printf("Future Value of Investment: ₹%.2f%n", futureValue);
		System.out.printf("Total Interest Earned: ₹%.2f%n", totalInterest);
	}

	public static void main(String[] args) {
		CompoundInterestCalculator calculator = new CompoundInterestCalculator();

		calculator.acceptRecord();

		calculator.calculateFutureValue();

		calculator.printRecord();
	}
}
