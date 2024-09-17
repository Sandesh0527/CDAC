package a6.q1;



import java.util.InputMismatchException;
import java.util.Scanner;

class Plane {
    private boolean[][] seats;
    private static final Scanner sc = new Scanner(System.in);

   
    public Plane() {
        this(6, 3);
    }

   
    public Plane(int rows, int columns) {
        this.seats = new boolean[rows][columns];
    }

    public boolean getSeat(int row, int col) {
        validateIndices(row, col);
        return seats[row][col];
    }

 
    public void setSeat(int row, int col, boolean booked) {
        validateIndices(row, col);
        seats[row][col] = booked;
    }

    private void validateIndices(int row, int col) {
        if (row < 0 || col < 0 || row >= seats.length || col >= seats[row].length) {
            throw new ArrayIndexOutOfBoundsException("Indices are out of bounds");
        }
    }

 
    public void manageSeats() {
        for (int row = 0; row < seats.length; row++) {
            for (int col = 0; col < seats[row].length; col++) {
                boolean booked = false;
                while (true) {
                    System.out.println("Enter booking status for row " + row + ", column " + col + " (true/false): ");
                    try {
                        booked = sc.nextBoolean();
                        setSeat(row, col, booked);
                        break;  
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Please enter true or false.");
                        sc.next();  
                    }
                }
            }
        }
    }

    public void displaySeats() {
        for (int row = 0; row < seats.length; row++) {
            for (int col = 0; col < seats[row].length; col++) {
                System.out.print((seats[row][col] ? "B" : "A") + " ");
            }
            System.out.println();
        }
    }

 
    public static int showMenu() {
        System.out.println("Select an option:");
        System.out.println("0. Exit");
        System.out.println("1. Manage seat bookings and cancellations");
        System.out.println("2. Display seating arrangement");
        return sc.nextInt();
    }

    
}

public class AirlineSeating {
    public static void main(String[] args) {
        Plane plane = new Plane();
        int choice;

        while ((choice = Plane.showMenu()) != 0) {
            switch (choice) {
                case 1:
                    plane.manageSeats();
                    break;
                case 2:
                    plane.displaySeats();
                    break;
                default:
                    System.out.println("Invalid option, please try again.");
                    break;
            }
        }

        System.out.println("Thank you for using the seat management system.");
        
    }
}
