package javaSE;

import java.util.*;

/*
Write a method maxOfTwoNumbers that takes two numbers as arguments and returns the largest of them.
Write a function maxOfThree that takes three numbers as arguments and returns the largest of them.
Write a function isCharacterAVowel that takes a character (i.e. a string of length 1) 
and returns true if it is a vowel, false otherwise.
Write a function charCount that takes a string and returns the length of the string.
Write a function vowelCount that takes a String and returns the number of vowels in the String. 
add a check for the string to be of 10 or less characters. 
*/
public class WK1_D2_ML {
//Max of 2 numbers
	static double maxOfTwoNumbers(double num1, double num2) {
		return Math.max(num1, num2);
	}
	static double maxOfThreeNumbers(double num3, double num4, double num5) {
		if(num3 > num4 && num3 > num5) return num3;
		else if(num4 > num5 && num4 > num3)return num4;
		else if(num5 > num3 && num5 > num4)return num5;
		else return 0;
	}
	static boolean isCharacterVowel(char c) {
		if(Character.toLowerCase(c) == 'a' || Character.toLowerCase(c) =='e'|| Character.toLowerCase(c) =='i'|| Character.toLowerCase(c) =='o'|| Character.toLowerCase(c) =='u')
			return true;
		else return false;
	}
	static int charCount(String str) {
		return str.length();
	}
	static int vowelCount(String str) {
		char a[] = str.toCharArray();
		int count=0;
		for(int i = 0;i<a.length;i++) {
			char c = a[i];
			if(Character.toLowerCase(c) == 'a' || Character.toLowerCase(c) =='e'|| Character.toLowerCase(c) =='i'|| Character.toLowerCase(c) =='o'|| Character.toLowerCase(c) =='u')
				++count;
		}
		return count;
	}
	
	public static void main(String[] args) {
	//call Max of 2 numbers method
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number 1: ");
		double num1 = sc.nextDouble();
		System.out.println("Enter number 2: ");
		double num2 = sc.nextDouble();
		
		System.out.println("\n****************Maximum of Two numbers************************");
		double res1 = maxOfTwoNumbers(num1,num2);
		System.out.printf("Max of %f , %f is %f ", num1,num2,res1);
		System.out.println("\n****************Maximum of Three numbers***********************");
		System.out.println("Enter number 1: ");
		double num3 = sc.nextDouble();
		System.out.println("Enter number 2: ");
		double num4 = sc.nextDouble();
		System.out.println("Enter number 3: ");
		double num5 = sc.nextDouble();
		double res2 = maxOfThreeNumbers(num3,num4,num5);
		if(res2 == 0) System.out.println("The numbers are equal");
		else System.out.printf("Max of %f, %f, %f is %f",num3,num4,num5,res2);
		System.out.println("\n****************Is Character a Vowel?**************************");
		System.out.println("Enter a Character:");
		char c = sc.next().charAt(0);
		boolean res3 = isCharacterVowel(c);
		if(res3 == true)
		System.out.printf("%c is a Vowel",c);
		else System.out.printf("%c is a Consonant",c);

		System.out.println("\n****************Length of the String**************************");	
	    String str = "The World is Beautiful";
     	int len = charCount(str);
		System.out.println("Character count of the string is " + len);
		if(len <= 10)
		System.out.println("Vowel count of the String is " + vowelCount(str));
		else System.out.println("Vowel cannot be found as String length is greater than 10");
	}
	

}
