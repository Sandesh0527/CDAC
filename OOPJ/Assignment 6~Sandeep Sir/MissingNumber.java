package a6.q1;

import java.util.Scanner;

public class MissingNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the value of N : ");
		int N = sc.nextInt();

		int[] arr = new int[N - 1];

		for (int i = 0; i < N - 1; i++) {
			arr[i] = sc.nextInt();
		}

		int missingNumber = findMissingNumber(arr, N);
		System.out.println("The missing number is: " + missingNumber);

		sc.close();
	}

	public static int findMissingNumber(int[] arr, int N) {

		int expectedSum = N * (N + 1) / 2;

		int currentSum = 0;
		for (int num : arr) {
			currentSum += num;
		}

		return expectedSum - currentSum;
	}
}
