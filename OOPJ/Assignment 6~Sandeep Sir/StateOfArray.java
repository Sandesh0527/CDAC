package a6.q1;

import java.util.Scanner;

public class StateOfArray {

	// Method to accept input from the user into the array
	public static void acceptRecord(int[] arr) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 integers: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter element " + (i + 1) + ": ");
			arr[i] = sc.nextInt();
		}
	}

	public static void printRecord(int[] arr) {
		System.out.println("Array elements are: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Element " + (i + 1) + ": " + arr[i]);
		}
	}

	public static void main(String[] args) {
		int[] arr = new int[5];

		acceptRecord(arr);

		printRecord(arr);
	}
}
