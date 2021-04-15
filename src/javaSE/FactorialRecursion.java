package javaSE;

public class FactorialRecursion {
	
	static int factorial(int n) {
		//base case
		if(n < 1) {
			return 1;
		}
		else {
		int result = n * (factorial(n-1));
		System.out.println(result);
		return result;
		}
			
	}

	public static void main(String[] args) {
		int result = factorial(4);
		//System.out.println(result);
	}

}
