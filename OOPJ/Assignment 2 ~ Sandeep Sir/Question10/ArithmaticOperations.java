package question10.switchcase;

public class ArithmeticOperations {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Please provide two integers and an arithmetic operator (+, -, *, /).");
            return;
        }

        try {
            // Parse the input arguments
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            char operator = args[2].charAt(0);

            // Perform the arithmetic operation using switch-case
            switch (operator) {
                case '+':
                    System.out.println("Result: " + (num1 + num2));
                    break;
                case '-':
                    System.out.println("Result: " + (num1 - num2));
                    break;
                case '*':
                    System.out.println("Result: " + (num1 * num2));
                    break;
                case '/':
                    if (num2 != 0) {
                        System.out.println("Result: " + (num1 / num2));
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;
                default:
                    System.out.println("Error: Invalid operator. Please use +, -, *, or /.");
                    break;
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input. Please enter valid integers.");
        }
    }
}
