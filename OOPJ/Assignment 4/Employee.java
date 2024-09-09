package emp.assignment4;

class Employee {
    // Fields
    int empId;
    String name;
    double salary;

    // Constructor
    public Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    // Method
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
        System.out.println("------------------------");
    }

    public static void main(String[] args) {
        
        Employee emp1 = new Employee(101, "Sandesh Bharambe", 50000);
        Employee emp2 = new Employee(102, "Diksha Pimpalkar", 60000);

        emp1.displayEmployeeDetails();
        emp2.displayEmployeeDetails();
    }
}
