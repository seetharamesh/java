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
	
	static void addItem(ArrayList<String> items, String str) {
		items.add("Hendricks gin");
		System.out.println("Updated ArrayList with New Item:" + items);
	}
	
	static void reverseArray(String[] arr) {
		Collections.reverse(Arrays.asList(arr));
		System.out.println("\nReversed Array is: " + Arrays.toString(arr));		
	}
	
	static void waitListArray(String[] givenList) {
		int len = givenList.length;
		for(int j = 0; j<len; j++) {
			System.out.println("\nNow Serving: "+ givenList[j]);
			System.out.print("Waitlist:" );
			for(int k = j+1; k<len; k++)
				System.out.print(givenList[k]+",");
		}
	}
	
	static void appendStrings(String[] shoe) {
		StringBuffer sb = new StringBuffer();
		for(int m = 0; m < shoe.length; m++)
			sb.append(shoe[m]);
		String str3 =sb.toString();
		System.out.println("Individual Strings are joined as: " + str3);
	}
	
	static void countColors(String[] str) {
		int[] redCounter = {0};
		int[] blueCounter = {0};
		int[] greenCounter = {0};
		int[] yellowCounter = {0};
		HashMap<Integer,String> colors = new HashMap<>();
		colors.put(1,str[0]);
		colors.put(2,str[1]);
		colors.put(3,str[2]);
		colors.put(4,str[3]);
		colors.put(5,str[4]);
		colors.put(6,str[5]);
		colors.put(7,str[6]);
		System.out.println("The given colors array:"+colors);
		colors.forEach((key,value)->{
		    if("red".equals(value)){ 
		       ++redCounter[0];
		    }
		    if("green".equals(value)) {
		    	++greenCounter[0];
		    }
		    if("blue".equals(value)) {
		    	++blueCounter[0];
		    }
		    if("yellow".equals(value)) {
		    	++yellowCounter[0];
		    }
		 }); 
		System.out.print("red:" + redCounter[0] + " Green:" + greenCounter[0] +" blue:" + blueCounter[0] + " Yellow: " + yellowCounter[0]);
	}
	
	static void createUserProfile(String[] str) {
		//you can write it as either Map or HashMap
		HashMap<Integer,String> userProfile = new HashMap<>();
		for(int k = 0; k < str.length; k++) 
		userProfile.put(k, str[k]);
		// using for-each loop for iteration over Map.entrySet() 
        for (Map.Entry<Integer,String> printUser : userProfile.entrySet())  
            System.out.println("Key = " + printUser.getKey() + 
                             ", Value = " + printUser.getValue()); 
	}

	public static void main(String[] args) {
		
//System.out.println("***************Efficient Way to create Array of 50 integers\n");
int arr[] = new int[50];

System.out.println("\n***************Add item method*****************************");
ArrayList<String> items = new ArrayList<String>();
items.add("cool ranch doritos");
items.add("kings hawaiian sweet bread");
items.add("peanut butter oreos");
items.add("fruit loops cereal");
//call the method to add the new item
addItem(items, "Henderics gin");
System.out.println("\n***************End of Add New item *****************************\n");

System.out.println("\n*****another way to initialize array list is below method:***");
//another way to initialize array list is below method:
ArrayList<String> items2 = new ArrayList<String>(
	Arrays.asList("doritos", "bread", "oreos")); 
items2.add("gin");
System.out.println("\nUpdated shopping list is: " + items2);
System.out.println("\n***************End of alternative way to add Item****************");


//another way to intialize string array is below
System.out.println("\n***************Reverse Yoda*****************************");
String[] yoda = {"try", "no", "is", "there", "not", "do", "or", "do"};
System.out.print("Given array: ");
for(int i = 0 ; i < yoda.length ; i++)
System.out.print(yoda[i] + ",");
//call reverse method
reverseArray(yoda);
System.out.println("\n***************End of Reverse Yoda*****************************");


System.out.println("\n***************Now Serving and Waitlist array*****************************");
String[] givenList = {"Chance the Rapper", "Khalid", "Tay-Tay", "Barry Manilow", "Piko Taro"};
//call the waitListArray method
waitListArray(givenList);
System.out.println("\n***************End of Serving and Waitlist array*****************************");

System.out.println("\n**********************NIKE*************************************");
//we can use StringBuffer or StringJoiner objects
String[] shoe = {"just ", "do ", "it "};
//call appendString method
appendStrings(shoe);
System.out.println("\n**********************End of NIKE*************************************");

System.out.println("\n******Number of occurences of each color using MAP**************");
//Colors = [red, green, red, blue, yellow, red, blue]
String[] givenColors = {"red", "green", "red", "blue", "yellow", "red", "blue"};
//call countColors method
countColors(givenColors);
System.out.println("\n\n******End of color count using MAP**************");

String first_name = "Seetha";
String last_name = "Ramesh";
String company = "PerScholas";
String department = "Software Engineering";
String[] userProfile = {first_name, last_name, company, department};
createUserProfile(userProfile);
System.out.println("\n*******************End of User Profile ************************");
	}
}
