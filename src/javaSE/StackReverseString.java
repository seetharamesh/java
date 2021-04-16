package javaSE;

import java.util.Stack;

public class StackReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Geeks for Geeks";
		//1. first create empty stack and push all chars to the stack
		Stack<Character> chst = new Stack<>();
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			chst.push(c);
		}
		//pop the chars out into string
		String result = "";
		for(int i = 0; i < s.length(); i++)
			result += chst.pop(); 
		
		System.out.println(result);
	}

}
