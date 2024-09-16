package question5.tollbooth;

import java.util.Scanner;

public class TollBoothRevenueManager {
    
    private double carRate;
    private double truckRate;
    private double motorcycleRate;
    private int carCount;
    private int truckCount;
    private int motorcycleCount;

    public TollBoothRevenueManager() {
        this.carRate = 50.00;
        this.truckRate = 100.00;
        this.motorcycleRate = 30.00;
        this.carCount = 0;
        this.truckCount = 0;
        this.motorcycleCount = 0;
    }

    
    public TollBoothRevenueManager(double carRate, double truckRate, double motorcycleRate) {
        this.carRate = carRate;
        this.truckRate = truckRate;
        this.motorcycleRate = motorcycleRate;
        this.carCount = 0;
        this.truckCount = 0;
        this.motorcycleCount = 0;
    }

   
    public double getCarRate() { 
    	return carRate; 
    	}
    public void setCarRate(double carRate) { 
    	this.carRate = carRate; 
    	}

    public double getTruckRate() {
return truckRate;
}
    public void setTruckRate(double truckRate) {
    	this.truckRate = truckRate;
    	}

    public double getMotorcycleRate() { 
    	return motorcycleRate; 
    	}
    public void setMotorcycleRate(double motorcycleRate) { 
    	this.motorcycleRate = motorcycleRate; 
    	}

    public int getCarCount() {
    	return carCount;
    	}
    public void setCarCount(int carCount) { 
    	this.carCount = carCount; 
    	}

    public int getTruckCount() { 
    	return truckCount; 
    	}
    public void setTruckCount(int truckCount) { 
    	this.truckCount = truckCount; 
    	}

    public int getMotorcycleCount() { 
    	return motorcycleCount; 
    	}
    public void setMotorcycleCount(int motorcycleCount) { 
    	this.motorcycleCount = motorcycleCount; 
    	}

    @Override
    public String toString() {
        return "Toll Rates: Car: ₹" + carRate + ", Truck: ₹" + truckRate + ", Motorcycle: ₹" + motorcycleRate + "\n" +
               "Vehicle Counts: Car: " + carCount + ", Truck: " + truckCount + ", Motorcycle: " + motorcycleCount;
    }

    public double calculateTotalRevenue() {
        return (carRate * carCount) + (truckRate * truckCount) + (motorcycleRate * motorcycleCount);
    }

  
    public int calculateTotalVehicles() {
        return carCount + truckCount + motorcycleCount;
    }

    public void acceptRecord(Scanner sc) {
        System.out.println("Enter toll rates for different vehicle types:");
        System.out.print("Car Rate: ₹");
        setCarRate(sc.nextDouble());
        System.out.print("Truck Rate: ₹");
        setTruckRate(sc.nextDouble());
        System.out.print("Motorcycle Rate: ₹");
        setMotorcycleRate(sc.nextDouble());

        System.out.println("Enter the number of vehicles passing through:");
        System.out.print("Number of Cars: ");
        setCarCount(sc.nextInt());
        System.out.print("Number of Trucks: ");
        setTruckCount(sc.nextInt());
        System.out.print("Number of Motorcycles: ");
        setMotorcycleCount(sc.nextInt());
    }

    public void printRecord() {
        System.out.println(this);
        System.out.printf("Total Revenue Collected: ₹%.2f\n", calculateTotalRevenue());
        System.out.println("Total Number of Vehicles: " + calculateTotalVehicles());
    }


    public int menuList(Scanner sc) {
        System.out.println("Select Option:");
        System.out.println("0. Exit");
        System.out.println("1. Set Toll Rates and Vehicle Counts");
        System.out.println("2. Print Revenue and Vehicle Details");
        System.out.print("Enter your choice: ");
        return sc.nextInt();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TollBoothRevenueManager manager = new TollBoothRevenueManager();
        int choice;

        while ((choice = manager.menuList(sc)) != 0) {
            switch (choice) {
                case 1:
                    manager.acceptRecord(sc);
                    break;
                case 2:
                    manager.printRecord();
                    break;
                default:
                    System.out.println("Invalid Choice. Please try again.");
            }
        }
        System.out.println("Thank you!");
        sc.close();
    }
}

