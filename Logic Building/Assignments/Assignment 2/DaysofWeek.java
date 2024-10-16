//Question 2: Days of the Week
//Write a program that uses a nested switch statement to print out the day of the week based on an
//integer input (1 for Monday, 2 for Tuesday, etc.). Additionally, within each day, print whether it
//is a weekday or weekend

public class DaysofWeek {
    public static void main(String[] args) {
        int day = 7; // You can change this value to test different days

        switch (day) {
            case 1 : {
                System.out.println("Monday");
                System.out.println("Weekday");
                break;
            }
            case 2 : {
                System.out.println("Tuesday");
                System.out.println("Weekday");
                break;
            }
            case 3 : {
                System.out.println("Wednesday");
                System.out.println("Weekday");
                break;
            }
            case 4 : {
                System.out.println("Thursday");
                System.out.println("Weekday");
                break;
            }
            case 5 : {
                System.out.println("Friday");
                System.out.println("Weekday");
                break;
            }
            case 6 : {
                System.out.println("Saturday");
                System.out.println("Weekend");
                break;
            }
            case 7 : {
                System.out.println("Sunday");
                System.out.println("Weekend");
                break;
            }
            default : System.out.println("Invalid day. Please enter a number between 1 and 7.");
        }
    }
}
