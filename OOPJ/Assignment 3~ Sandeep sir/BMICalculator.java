package calculate.BMI.question3;

//3. BMI (Body Mass Index) Tracker
//Create a system to calculate and classify Body Mass Index (BMI). The system should:
//1. Accept weight (in kilograms) and height (in meters) from the user.
//2. Calculate the BMI using the formula:
//o BMI Calculation: BMI = weight / (height * height)
//3. Classify the BMI into one of the following categories:
//o Underweight: BMI < 18.5
//o Normal weight: 18.5 ≤ BMI < 24.9
//o Overweight: 25 ≤ BMI < 29.9
//o Obese: BMI ≥ 30
//4. Display the BMI value and its classification.
//Define class BMITracker with methods acceptRecord, calculateBMI, classifyBMI &
//printRecord and test the functionality in main method.
import java.util.*;

public class BMICalculator {
	
		private double Weight;
		private double Height;
		private double BMI;

		public void acceptRecord() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Weight");
			Weight = sc.nextDouble();
			System.out.println("Enter Height");
			Height = sc.nextDouble();

		}

		public void calculateBMI() {
			BMI = Weight / (Height * Height);

		}

		public void printRecord() {
			if (BMI < 18.5) {
				System.out.println("Underweight");
			} else if (BMI >= 18.5 && BMI < 24.9) {
				System.out.println("Normal eight");
			} else if (BMI >= 25 && BMI < 29.9) {
				System.out.println("Over weight");
			} else {
				System.out.println("Obese");
			}
		}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BMICalculator calculator = new BMICalculator();
		calculator.acceptRecord();
		calculator.calculateBMI();
		calculator.printRecord();
	}

}
