package a6.q1;

import java.util.Scanner;

class ArrayDemo {
    private int[] arr;  

    public ArrayDemo(int size) {
        arr = new int[size];  
    }

    public void acceptRecord(Scanner sc) {
        System.out.println("Enter " + arr.length + " integer values:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();  
        }
    }

 
    public void printRecord() {
        System.out.println("The elements in the array are:");
        for (int value : arr) {
            System.out.print(value + " ");  
        }
        System.out.println();  
    }
}

public class ArrayFunctionality {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayDemo arrayDemo = new ArrayDemo(5);

        
        arrayDemo.acceptRecord(sc);

 
        arrayDemo.printRecord();

        sc.close();
    }
}
