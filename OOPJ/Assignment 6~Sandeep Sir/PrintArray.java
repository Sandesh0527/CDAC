package a6.q1;

import java.util.*;

public class PrintArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		for (int i = 0; i < arr.length; i++) {
			if (i == 1)
				System.out.print("Enter " + i + "st value: ");
			else if (i == 2)
				System.out.print("enter " + i + "nd value: ");
			else if (i == 3)
				System.out.print("Enter " + i + "rd value: ");
			else
				System.out.print("enter " + i + "th value: ");
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
	}

}