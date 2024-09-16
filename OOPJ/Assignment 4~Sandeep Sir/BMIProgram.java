package question3.bmi.claculate;

import java.util.Scanner;

class BMITracker {
	private double weight;
	private double height;

	// Default constructor
	BMITracker() {
	}

	// Parameterized constructor
	BMITracker(double weight, double height) {
		this.weight = weight;
		this.height = height;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getWeight() {
		return weight;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getHeight() {
		return height;
	}


	public double calculateBMI() {
		return weight / (height * height);
	}

	public String classifyBMI() {
		double bmi = calculateBMI();
		if (bmi < 18.5) {
			return "Underweight";
		} else if (bmi >= 18.5 && bmi < 24.9) {
			return "Normal weight";
		} else if (bmi >= 25 && bmi < 29.9) {
			return "Overweight";
		} else {
			return "Obese";
		}
	}

	@Override
	public String toString() {
		return "Weight: " + weight + " kg, Height: " + height + " m";
	}
}


class BMITrackerUtil {
	BMITracker bmiTracker = new BMITracker();

	public void acceptRecord(Scanner sc) {
		System.out.println("Enter Weight (in kilograms): ");
		bmiTracker.setWeight(sc.nextDouble());

		System.out.println("Enter Height (in meters): ");
		bmiTracker.setHeight(sc.nextDouble());
	}

	public void printRecord() {
		double bmi = bmiTracker.calculateBMI();
		String classification = bmiTracker.classifyBMI();
		System.out.printf("BMI Value: %.2f\n", bmi);
		System.out.println("BMI Classification: " + classification);
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

public class BMIProgram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BMITrackerUtil trackerUtil = new BMITrackerUtil();
		int choice;
		while ((choice = trackerUtil.menuList(sc)) != 0) {
			switch (choice) {
			case 1:
				trackerUtil.acceptRecord(sc);
				break;
			case 2:
				trackerUtil.printRecord();
				break;
			default:
				System.out.println("Wrong Choice");
			}
		}

		sc.close();
	}
}
