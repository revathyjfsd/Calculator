package Calculator;

import java.util.Scanner;
//Author
public class Calculator {
	public static void main(String[] args) {
	      double num1;
	      double num2;
	      double value;
	      char operation;
	      Scanner input = new Scanner(System.in);
	      System.out.println("Enter the first number: ");
	      num1 = input.nextDouble();
	      System.out.println("Choose one of the operation '+' or '-' or '*' or '/'");
	      input.nextLine();
	      operation = input.next().charAt(0);
	      System.out.println("Enter the second number: ");
	      num2 = input.nextDouble();
	      switch(operation) {
	         case '+': 
	        	 value = num1 + num2;
	            break;
	         case '-': 
	        	 value = num1 - num2;
	            break;
	         case '*': 
	        	 value = num1 * num2;
	            break;
	         case '/': 
	        	 value = num1 / num2;
	            break;
	         default: 
	        	 System.out.println("You have eneterd the wrong operation");
	         return;
	      }
	      System.out.println("The value of "+ num1 + " " + operation + " " + num2 + " = " + value);
	   }
}
