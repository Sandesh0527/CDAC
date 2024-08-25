// Question 5: Student Pass/Fail Status with Nested Switch
// Write a program that determines whether a student passes or fails based on their grades in three
// subjects. If the student scores more than 40 in all subjects, they pass. If the student fails in one or
// more subjects, print the number of subjects they failed in. 
import java.util.Scanner;

public class StudentResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int subject1 = sc.nextInt();

        int subject2 = sc.nextInt();

        int subject3 = sc.nextInt();

        int failCount = 0;

        
        if (subject1 < 40) {
            failCount++;
        }
        if (subject2 < 40) {
            failCount++;
        }
        if (subject3 < 40) {
            failCount++;
        }

        switch (failCount) {
            case 0:
                System.out.println("Pass");
                break;
            case 1:
            case 2:
            case 3:
                System.out.println("Fail: Failed in " + failCount + " subject");
                break;
        
        }

       
    }
}
