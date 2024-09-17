package a6.q1;
import java.util.*;
public class RemoveDuplicate {
	public static int removeDuplicates(int[] a) {
		int i = 0;
		for (int j = 1; j < a.length; j++) {
			if (a[i] != a[j]) {
				i++;
				a[i] = a[j];
			}
		}
		return i + 1;
	}

	public static void main(String[] args) {
		int[] a = { 7,8,8,9,4,5,9,8 };
		System.out.println("array before removing duplicates " + Arrays.toString(a));
		Arrays.sort(a);
		int k = removeDuplicates(a);
		System.out.print("array after removing duplicates ");
		for (int i = 0; i < k; i++) {
			System.out.print(a[i] + " ");
		}
	}

}