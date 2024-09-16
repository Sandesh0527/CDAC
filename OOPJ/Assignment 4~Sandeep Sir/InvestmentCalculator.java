package question2.compound.interest;

import java.util.Scanner;

class CompoundInterestSystem {
    private double principal;
    private double annualInterestRate;
    private int numberOfCompounds;
    private int years;

    // Default constructor
    CompoundInterestSystem() {
    }

    // Parameterized constructor
    CompoundInterestSystem(double principal, double annualInterestRate, int numberOfCompounds, int years) {
        this.principal = principal;
        this.annualInterestRate = annualInterestRate;
        this.numberOfCompounds = numberOfCompounds;
        this.years = years;
    }

    // Setters and getters
    public void setPrincipal(double principal) {
        this.principal = principal;
    }

    public double getPrincipal() {
        return principal;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setNumberOfCompounds(int numberOfCompounds) {
        this.numberOfCompounds = numberOfCompounds;
    }

    public int getNumberOfCompounds() {
        return numberOfCompounds;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public int getYears() {
        return years;
    }

    // Calculate future value
    public double calculateFutureValue() {
        return principal * Math.pow(1 + (annualInterestRate / numberOfCompounds), numberOfCompounds * years);
    }

    // Calculate total interest earned
    public double calculateTotalInterest() {
        return calculateFutureValue() - principal;
    }

    @Override
    public String toString() {
        return "Principal: " + principal + " Interest Rate: " + annualInterestRate +
               " Compounded: " + numberOfCompounds + " Times per year, Years: " + years;
    }
}

class CompoundInterestSystemUtil {
    CompoundInterestSystem investment = new CompoundInterestSystem();

    public void acceptRecord(Scanner sc) {
        System.out.println("Enter Principal Amount: ");
        investment.setPrincipal(sc.nextDouble());

        System.out.println("Enter Interest Rate (%): ");
        investment.setAnnualInterestRate(sc.nextDouble() / 100);

        System.out.println("Enter Number of Times Interest is Compounded per Year: ");
        investment.setNumberOfCompounds(sc.nextInt());

        System.out.println("Enter Investment Duration (Years): ");
        investment.setYears(sc.nextInt());
    }

    public void printRecord() {
        System.out.printf("Future Value: ₹ %.2f\n", investment.calculateFutureValue());
        System.out.printf("Total Interest Earned: ₹ %.2f\n", investment.calculateTotalInterest());
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

public class InvestmentCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CompoundInterestSystemUtil calculatorUtil = new CompoundInterestSystemUtil();
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
        System.out.println("Thanks ....");
        sc.close();
    }
}

