package tollboth.assignment;


import java.util.Scanner;

class TollBoothRevenueManager {
    private double carTollRate;
    private double truckTollRate;
    private double motorcycleTollRate;

    private int numCars;
    private int numTrucks;
    private int numMotorcycles;

    private double totalRevenue;
    private int totalVehicles;

    public void setTollRates(Scanner sc) {
        System.out.println("Set Toll Rates:");

        System.out.print("Enter toll rate for Cars : ");
        carTollRate = sc.nextDouble();

        System.out.print("Enter toll rate for Trucks : ");
        truckTollRate = sc.nextDouble();

        System.out.print("Enter toll rate for Motorcycles : ");
        motorcycleTollRate = sc.nextDouble();
    }

    public void acceptRecord(Scanner sc) {
        System.out.println("Enter the number of vehicles passed:");

        System.out.print("Number of Cars: ");
        numCars = sc.nextInt();

        System.out.print("Number of Trucks: ");
        numTrucks = sc.nextInt();

        System.out.print("Number of Motorcycles: ");
        numMotorcycles = sc.nextInt();
    }
    public void calculateRevenue() {
        totalRevenue = (numCars * carTollRate) + (numTrucks * truckTollRate) + (numMotorcycles * motorcycleTollRate);
        totalVehicles = numCars + numTrucks + numMotorcycles;
    }

    public void printRecord() {
        System.out.println("\nToll Booth Revenue Summary:");
        System.out.println("Total number of vehicles: " + totalVehicles);
        System.out.printf("Total revenue collected" + totalRevenue);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TollBoothRevenueManager manager = new TollBoothRevenueManager();

        manager.setTollRates(sc);

        manager.acceptRecord(sc);

        manager.calculateRevenue();

        manager.printRecord();

        sc.close();
    }
}
