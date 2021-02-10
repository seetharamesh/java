package javaSE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

/*
Write a Java program to copy one array list into another
Write a Java program to extract a portion of a array list
Write a Java program of swap two elements in an array list
Write a Java program to test an array list is empty or not
Write a Java program to replace the second element of a ArrayList with the specified element.
Write a Java program to trim the capacity of an array list the current list size
 Write a Java program to test a hash set is empty or not.
Write a Java program to get the number of elements in a hash set
Write a Java program to iterate through all elements in a hash list.
Write a Java program to convert a hash set to an array.
Write a Java program to compare two sets and retain elements which are same on both sets.
*/
public class WK1_HW2 {

	public static void main(String[] args) {
	
		//copy one ArrayList to another. First create an array list and populate with data
		ArrayList<String> arrList1 = new ArrayList<String>(
				Arrays.asList("doritos", "bread", "oreos")); 
		System.out.println("Original Arraylist is: " + arrList1);
		//create another array list to copy the data from previous step. Remember to initialize the new array with "" (string)
		ArrayList<String> arrList2 = new ArrayList<String>(
				Arrays.asList("","",""));
		//use Collections to copy the data 
		Collections.copy(arrList2, arrList1);	
		System.out.println("Copying the original array list to new ArrayList: " + arrList2);
		System.out.println("**************************************************************");
		//extracting portion from arrayList. start index(inclusive)
		ArrayList<String> arrList3 = new ArrayList<String>(
				Arrays.asList("one","two","three","four","five","six"));
		System.out.println("Given array is: " + arrList3);
		System.out.println("I want to extract from second item to last time" + arrList3.subList(2, 6));
		System.out.println("**************************************************************");
		//swap 2 elements in the arraylist
		ArrayList<Integer> intArr = new ArrayList<Integer>(
				Arrays.asList(1,2,3,4,5));
		//swap the elements using Collections
		System.out.println("Original Array List is:" + intArr);
		Collections.swap(intArr, 2, 3);
		System.out.println("Swaping elements(at position 2 and 3)in arrayList: " + intArr );
		System.out.println("**************************************************************");

		//test an arraylist if empty or not
		ArrayList<Integer> intArr2 = new ArrayList<Integer>(
				Arrays.asList(10,20,30,40,50));
		System.out.println("Given List is: " + intArr2);
		System.out.println("The given arrayList is empty(true) or not empty(false): " + intArr2.isEmpty());
		ArrayList<Integer> intArr3 = new ArrayList<Integer>(
				Arrays.asList());
		System.out.println("Given List is: " + intArr3);
		System.out.println("The given arrayList is empty(true) or not empty(false): " + intArr3.isEmpty());
		//replace the second element of a ArrayList with the specified element
		ArrayList<String> arrList4 = new ArrayList<String>(
				Arrays.asList("HTML","JAVA","JAVASCRIPT","CSS"));
		System.out.println("Swaping elements(at position 2 and 3)in arrayList: " + intArr );
		System.out.println("**************************************************************");
		System.out.println("Original ArrayList: " + arrList4);		
		arrList4.set(2, "REACT_REDUX");
		System.out.println("The second element is replaced here: " + arrList4);
		System.out.println("**************************************************************");
		// trim the capacity of an array list the current list size
		// I am declaring the length of ArrayList to be 5 and adding only 2 elements
		ArrayList<Integer> intArr4 = new ArrayList<Integer>(5);
		intArr4.add(10);
		intArr4.add(20);
		//now i want to trim its original size from 5 to 2
		intArr4.trimToSize();
		//print now to see if its size is reduced from 5 to 2
		for(Integer num: intArr4) {
			System.out.println("Array List = " + num);
		}
		System.out.println("**************************************************************");
		//test a hash set is empty or not.
		HashSet<String> hset = new HashSet<>(3);
		//will print true if hashmap is emppty
		System.out.println("Hash Set empty(true) / not empty(false): " + hset.isEmpty());
		System.out.println("**************************************************************");
		//get the number of elements in a hash set
		hset.add("flowers");
		hset.add("plants");
		hset.add("roses");
		System.out.println("The size of Hash Set is: " + hset.size());
		System.out.println("**************************************************************");
		//iterate through all elements in a hash list.
		for(String i : hset) {
			System.out.println("items in the set are: " + i);
		}
		System.out.println("**************************************************************");
		//convert a hash set to an array.
		//Let us convert the above hash set to an array
		String[] arr = new String[hset.size()];
		hset.toArray(arr); //converting the set to array
		//print the array
		for(String s: arr) {
			System.out.println("The item in the array is: " + s);
		}
		System.out.println("**************************************************************");
	
	}

}
