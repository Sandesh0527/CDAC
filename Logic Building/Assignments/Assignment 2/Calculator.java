//Question 3: Calculator
//Write a program that acts as a simple calculator. It should accept two numbers and an operator
//(+, -, *, /) as input. Use a switch statement to perform the appropriate operation.
// Use nested ifelse to check if division by zero is attempted and display an error message. 

import java.util.*;
public class Calculator {
public static void main(String [] args) {
Scanner sc = new Scanner(System.in);
int num1 = sc.nextInt();
char operator = sc.next().charAt(0);
int num2 = sc.nextInt();


int result = 0;

switch(operator){
case '+':
result = num1 + num2;
 break;
 
 case '-':
 result = num1 - num2;
 break;
 
 case '*':
 result = num1 * num2 ;
 break;
 
 case '/':
 
 if(num2 == 0) {
 System.out.println("You cannot divide by 0");
 }
 else {
 result = num1/num2 ;
 }
 break;
 
 
}
System.out.println("Output is :" +result);
}
}