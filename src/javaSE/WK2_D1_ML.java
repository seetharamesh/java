package javaSE;
import java.util.*;
/*Create a simple calculator program that has following four methods
Addition of two numbers
Subtraction of two numbers. Smaller number is always subtracted from larger one. 
Multiplication of two numbers
Division of two numbers. 
Introduce three to four logical errors. Make sure your program compiles
20 minutes: Exchange your code with a classmate. 
Run the program in debugger mode and find the logical or computational errors
*/
public class WK2_D1_ML {
	static void performAddition(int n1, int n2){
		System.out.printf("Adding %d and %d resulted in %d", n1,n2,(n1+n2));	
	}
	static void performSubtraction(int n1, int n2){
		int diff = 0;
		if(n1 > n2) diff = n1 - n2;
		else  diff = n2 - n1;
		System.out.printf("Subtracting %d and %d resulted in %d", n1,n2,diff);	
	}
	static void performMultiplication(int n1, int n2){
		System.out.printf("Multiplying %d and %d resulted in %d", n1,n2,(n1*n2));	
	}
	static void performDivision(int n1, int n2){
		System.out.printf("Dividing %d and %d resulted in %d", n1,n2,(n1/n2));	
	}
	public static void main(String[] args) {
		
		// First lets accept 2 numbers from users and an operator( + or - or * or / )
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number 1: ");
		int num1 = sc.nextInt();
		System.out.println("Enter number 2: ");
		int num2 = sc.nextInt();
		System.out.println("Enter an operator: ");
		sc.nextLine();//this is from enter key
		String s = sc.nextLine();
		sc.close();
		if(s.equalsIgnoreCase("+")) performAddition(num1,num2);
		else if(s.equalsIgnoreCase("-")) performSubtraction(num1,num2);
		else if(s.equalsIgnoreCase("*")) performMultiplication(num1,num2);
		else if(s.equalsIgnoreCase("/")) performDivision(num1,num2);
	}

}
