package question1.loan.calculator;

import java.util.Scanner;

public class LoanAmortizationCalculator {

    // Fields for principal, interest rate, and loan term
    private double principal;
    private double annualInterestRate;
    private float loanTerm;

    // Default constructor
    LoanAmortizationCalculator() {
    }

    // Parameterized constructor
    LoanAmortizationCalculator(double principal, double annualInterestRate, float loanTerm) {
        this.principal = principal;
        this.annualInterestRate = annualInterestRate;
        this.loanTerm = loanTerm;
    }

    // Setters and Getters
    public void setPrincipal(double principal) {
        this.principal = principal;
    }

    public double getPrincipal() {
        return principal;
    }

    public void setLoanTerm(float loanTerm) {
        this.loanTerm = loanTerm;
    }

    public float getLoanTerm() {
        return loanTerm;
    }

    public void setRateOfInterest(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getRateOfInterest() {
        return annualInterestRate;
    }

    // Method to calculate monthly payment
    public double calculateMonthlyPayment() {
        double monthlyInterestRate = annualInterestRate / 1200;
        double numberOfMonths = loanTerm * 12;
        return principal * (monthlyInterestRate * Math.pow((1 + monthlyInterestRate), numberOfMonths)) /
                (Math.pow((1 + monthlyInterestRate), numberOfMonths) - 1);
    }

    // Method to accept loan details from the user
    public void acceptRecord(Scanner sc) {
        System.out.println("Enter Principal Amount: ");
        setPrincipal(sc.nextDouble());

        System.out.println("Enter Annual Interest Rate: ");
        setRateOfInterest(sc.nextDouble());

        System.out.println("Enter Loan Term (years): ");
        setLoanTerm(sc.nextFloat());
    }

    // Method to print the loan details and calculated amounts
    public void printRecord() {
        double monthlyPayment = calculateMonthlyPayment();
        System.out.printf("Monthly Payment: ₹ %.2f\n", monthlyPayment);
        System.out.printf("Total Amount Paid: ₹ %.2f\n", (monthlyPayment * loanTerm * 12));
        System.out.println();
    }

    // Menu list for user interaction
    public int menuList(Scanner sc) {
        System.out.println("Select Option:");
        System.out.println("0. Exit");
        System.out.println("1. Accept Record");
        System.out.println("2. Print Record");
        System.out.println();
        return sc.nextInt();
    }

    // Main method to run the menu-driven program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LoanAmortizationCalculator calculator = new LoanAmortizationCalculator();
        int choice;

        // Menu 
        while ((choice = calculator.menuList(sc)) != 0) {
            switch (choice) {
                case 1:
                    calculator.acceptRecord(sc);
                    break;
                case 2:
                    calculator.printRecord();
                    break;
                default:
                    System.out.println("Wrong Choice");
            }
        }

        
        sc.close();
    }
}
