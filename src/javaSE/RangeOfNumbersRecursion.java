package javaSE;

//given a start and end number, print all numbers within the range(exclusive)

public class RangeOfNumbersRecursion {
	static void range_recursion(int a, int b) {
		if(a+1 == b) {
			return ;
		}
		else {	
			 a = a + 1;
			 range_recursion(a, b);	
			 System.out.println(a);
		}
	}

	public static void main(String[] args) {
		range_recursion(15,23);

	}

}
