package assignment5;
import java.util.Scanner;

class Employee {
    private static int totalEmployees = 0;
    private static double totalSalaryExpense = 0;

    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        totalEmployees++;
        totalSalaryExpense += salary;
    }

    public static int getTotalEmployees() {
        return totalEmployees;
    }

    public static double calculateTotalSalaryExpense() {
        return totalSalaryExpense;
    }

    public void applyRaise(double percentage) {
        double raiseAmount = this.salary * percentage / 100;
        this.salary += raiseAmount;
        totalSalaryExpense += raiseAmount;
    }

    public void updateSalary(double newSalary) {
        totalSalaryExpense = totalSalaryExpense - this.salary + newSalary;
        this.salary = newSalary;
    }

    public String toString() {
        return "Employee ID: " + id + ", Name: " + name + ", Salary: ₹" + salary;
    }
}

public class ManageEmployee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee emp1 = new Employee(101, "John", 50000);
        Employee emp2 = new Employee(102, "Jane", 60000);
        Employee emp3 = new Employee(103, "Mark", 55000);

        int choice;
        do {
            System.out.println("\nSelect an option:");
            System.out.println("1. View total employees");
            System.out.println("2. View total salary expense");
            System.out.println("3. Apply raise to an employee");
            System.out.println("4. Update employee salary");
            System.out.println("5. View employee details");
            System.out.println("0. Exit");

            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Total Employees: " + Employee.getTotalEmployees());
                    break;
                case 2:
                    System.out.printf("Total Salary Expense: ₹%.2f\n", Employee.calculateTotalSalaryExpense());
                    break;
                case 3:
                    System.out.println("Enter employee ID for raise (101/102/103):");
                    int idRaise = sc.nextInt();
                    System.out.println("Enter raise percentage:");
                    double percentage = sc.nextDouble();
                    if (idRaise == 101) {
                        emp1.applyRaise(percentage);
                    } else if (idRaise == 102) {
                        emp2.applyRaise(percentage);
                    } else if (idRaise == 103) {
                        emp3.applyRaise(percentage);
                    }
                    break;
                case 4:
                    System.out.println("Enter employee ID for salary update (101/102/103):");
                    int idUpdate = sc.nextInt();
                    System.out.println("Enter new salary:");
                    double newSalary = sc.nextDouble();
                    if (idUpdate == 101) {
                        emp1.updateSalary(newSalary);
                    } else if (idUpdate == 102) {
                        emp2.updateSalary(newSalary);
                    } else if (idUpdate == 103) {
                        emp3.updateSalary(newSalary);
                    }
                    break;
                case 5:
                    System.out.println("Enter employee ID to view details (101/102/103):");
                    int idView = sc.nextInt();
                    if (idView == 101) {
                        System.out.println(emp1);
                    } else if (idView == 102) {
                        System.out.println(emp2);
                    } else if (idView == 103) {
                        System.out.println(emp3);
                    }
                    break;
                case 0:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 0);

        sc.close();
    }
}
