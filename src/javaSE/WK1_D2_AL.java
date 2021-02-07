package javaSE;

import java.util.*;

/*
 * What is an efficient way to create an array for first 50 integers?
Write individual methods for each question below

You've been tasked to do this week's grocery shopping. 
As you arrive at Times Supermarket, Kanye pings you to get a bottle of Hendricks gin. 
Add this to the existing shoppingList.
shoppingList = [  "cool ranch doritos",  "kings hawaiian sweet bread",  "peanut butter oreos",  
"fruit loops cereal"];

Use the force, or in this case the reverse method to help Yoda make some sense with his motivational 
talk to the young Jedi interns.
yoda = ["try", "no", "is", "there", "not", "do", "or", "do"];

People been lining up for hours to get the newest iphone release. 
Help manage the unruly crowd of privileged customers by serving them one at a time and assigning 
it to a variable named `nowServing`. Print this new variable as well as the waitList.
waitList = [ "Chance the Rapper", "Khalid", "Tay-Tay", "Barry Manilow", "Piko Taro" ];

Help Nike sell more overpriced sneakers by changing their slogan from an array into a string. 
Convert the shoe array and assign it to a variable named `shoeString`. Return the new variable.
var shoe = ["just", "do", "it"];

Given a list of colors, create a map that keeps count of the number of occurrences of each color. 
Colors = [red, green, red, blue, yellow, red, blue]
Color_count = { red: 3, green: 1, blue: 2, yellow: 1} 
create a user profile using map where following keys. 
user1 = {
first_name: "";
last_name: "";
company: "";
department: "";
};*/

public class WK1_D2_AL {
	static void addItem(String[] arr, String str) {
		
	}

	public static void main(String[] args) {
		
System.out.println("***************Efficient Way to create Array of 50 integers");
int arr[] = new int[50];

System.out.println("***************Add item method*****************************");
ArrayList<String> items = new ArrayList<String>();
items.add("cool ranch doritos");
items.add("kings hawaiian sweet bread");
items.add("peanut butter oreos");
items.add("fruit loops cereal");
items.add("Hendricks gin");

System.out.println("*****another way to initialize array list is below method:***");
//another way to initialize array list is below method:
ArrayList<String> items2 = new ArrayList<String>(
	Arrays.asList("doritos", "bread", "oreos")); 
items2.add("gin");
System.out.println("Updated shopping list is: " + items2);

//another way to intialize string array is below
System.out.println("***************Reverse Yoda*****************************");
String[] yoda = {"try", "no", "is", "there", "not", "do", "or", "do"};
Collections.reverse(Arrays.asList(yoda));
System.out.println("Reversed Array is: " + Arrays.toString(yoda));

System.out.println("***************Now Serving and Waitlist array*****************************");
String[] givenList = {"Chance the Rapper", "Khalid", "Tay-Tay", "Barry Manilow", "Piko Taro"};
int len = givenList.length;
for(int j = 0; j<len; j++) {
	System.out.println("\nNow Serving: "+ givenList[j]);
	System.out.print("Waitlist:" );
	for(int k = j+1; k<len; k++)
		System.out.print(givenList[k]+",");
}
System.out.println("**********************NIKE*************************************");
//we can use StringBuffer or StringJoiner objects
String[] shoe = {"just ", "do ", "it "};
StringBuffer sb = new StringBuffer();
for(int m = 0; m < shoe.length; m++)
	sb.append(shoe[m]);
String str3 =sb.toString();
System.out.println("Individual Strings are joined as: " + str3);

System.out.println("******Number of occurences of each color using MAP**************");
//Colors = [red, green, red, blue, yellow, red, blue]
String[] givenColors = {"red", "green", "red", "blue", "yellow", "red", "blue"};
HashMap<Integer,String> colors = new HashMap<>();
colors.put(1,"red");
colors.put(2,"green");
colors.put(3,"red");
colors.put(4,"blue");
colors.put(5,"yellow");
colors.put(6,"red");
colors.put(7,"blue");
System.out.println("The colors array:"+colors);

	}
}
