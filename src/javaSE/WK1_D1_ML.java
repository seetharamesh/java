package javaSE;

import java.util.*;

/* 
Write a Java program that display the larger of two integers
Write an if/else statement for the following requirements:
If student gets 90 or higher: console log  A
If students get 80 or above: console log B
If students get 70 or above: console log C
If students get 55 or above: console log D
Any grade lower than 55 is F
Write a java  program that displays "Good Morning" if time is between 5AM-11:59 |
"Good Afternoon" if time is between 12 - 16 | otherwise "Hey there" 
*/
public class WK1_D1_ML {

	public static void main(String[] args) {
		// 1. Larger of two numbers
		Scanner sc= new Scanner(System.in);
        System.out.print("Enter a First Number: ");
        double num1 =sc.nextDouble(); 
        System.out.print("Enter the Second Number");
        double num2 = sc.nextDouble();
        double maxNum = Math.max(num1, num2);
        //use %f for doubles
        System.out.printf("Max of %f , %f is %f ", num1,num2,maxNum);
        
        System.out.println("\n*******************************************");
        System.out.println("Enter Student's score(max 100): ");
        int score = sc.nextInt();
        sc.close();
        if(score >= 90) System.out.println("You have Scored Grade A");
        else if(score >= 80 && score < 90) System.out.println("You have Scored Grade B");
        else if(score >= 70 && score < 80) System.out.println("You have Scored Grade C");
        else if(score >= 55 && score < 70) System.out.println("You have Scored Grade D");
        else System.out.println("You have Scored Grade F");
        System.out.println("\n*******************************************");
        /*Depending on the system time the output is shown. Note: getDate() of Date object is deprecated so using Calendar*/
        Date dt = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dt);
        int hours = calendar.get(Calendar.HOUR_OF_DAY);
        if(hours >= 5 && hours < 12) System.out.println("Good morning!");
        else if(hours >=12 && hours < 16) System.out.println("Good Afternoon!");
        else System.out.println("Hey there!");

	}

}
