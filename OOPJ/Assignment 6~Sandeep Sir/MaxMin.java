package a6.q1;

import java.util.Scanner;

public class MaxMin {

    public static void findMaxMin(int[] arr) {
        int max = arr[0]; 
        int min = arr[0]; 
                
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; 
            }
            if (arr[i] < min) {
                min = arr[i]; 
            }
        }
        
        
        System.out.println("Maximum value in the array: " + max);
        System.out.println("Minimum value in the array: " + min);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in  array: ");
        int n = sc.nextInt();

      
        int[] arr = new int[n];

        System.out.println("Enter " + n + " integers: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

     
        findMaxMin(arr);

        sc.close();
    }
}
