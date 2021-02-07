package javaSE;
//import java.lang.*;

public class WK1_D1_AL {

	public static void main(String[] args) {
/*
Using a while loop, print each char of a string ‘Hello World’
Java Program to find duplicate characters in a String
Use a while loop to add up the numbers 1 to 20 into one variable. Print out the sum at the end
Use a while loop to print out the even number from 1 to 20. (You'll need Modulus for this. And an IF Statement.) 
Write a for loop for the given output:
 1, 3, 5, 7, 9
 2, 4, 6, 8, 10
write a for loop that iterates between 0 and 10 and prints all even numbers. 
HINT: Read on Module/Remainder operator. 
Write a for loop that iterates from 1 - 20. 
Prints “prime” for all prime numbers, “even” for all even numbers, and “odd” for all odd numbers. 
Treat 2 as an even number and 1 & 3 as odd
*/
System.out.println("************Printing each Character in a String*****************************");
String str = "Hello World";
int len = str.length();
System.out.printf("Length of the given string is: %d \n", len);
int place = 0;
while(len > 0)
{
	System.out.println(str.charAt(place));
	len --;
	place++;
}

System.out.println("*********** Duplicate Characters in a String *****************************");
String str2 = "Beautiful World";
System.out.printf("The string is: %s and the duplicate characters are: ",str2);
char[] chars = str2.toCharArray();
for(int i=0; i< str2.length(); i++) {
	for(int j=i+1; j < str2.length(); j++) {
		
		if(chars[i] == chars[j])
		{
			System.out.print(chars[i]+",");
			break;
		}
			
	}
}
System.out.println("\n\n***************While Loop to add up numbers 1 to 20 ***********************");		
int k = 1, sum=0;
while(k <= 20) {
	sum += k;
	++k;
}
System.out.printf("Sum of numbers from 1 to 20 is: %d", sum);

System.out.println("\n\n***************Sum of even numbers from 1 to 20 ***********************");
int m = 1, sum2=0;
while(m <= 20) {
	if(m%2 == 0)sum2 = sum2 + m;
	++m;
}
System.out.printf("Sum of even numbers from 1 to 20 is %d",sum2);

System.out.println("\n\n***************for loop for given output ***********************");
for(int r =1;r<=10;r++) {
	if(r%2 != 0)System.out.print(r + " ");
}
System.out.println("\n");
for(int s = 1; s<=10; s++) {
	if(s%2 == 0) System.out.print(s + " ");
}
System.out.println("\n***************for loop for printing even numbers between 0 and 10 *************");	
for(int t = 1; t<=10; t++) {
	if(t%2 == 0) System.out.print(t + " ");
}
System.out.println("\n***************for loop for printing prime numbers between 1 and 20(inclusive) Writing this logic for any given range ***********");
System.out.println("This program is written for any range of numbers so conditions for divisibles by 5 & 7 are added");
for(int num = 1; num <= 20; num++) {
	if(num == 1 || num == 3)System.out.println(num +" is Odd");
	else if(num % 2 == 0) System.out.println(num + " is Even");
	else if(num % 3 == 0 || num % 5 == 0 || num % 7 == 0) System.out.println(num + " is Odd");
	else System.out.println(num + " is Prime");
}
	}
}
