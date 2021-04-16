package javaSE;

public class FibonacciRecursion {
	static int n1,n2,n3;
	static {
		
		 n1=0;
		 n2=1;
		 n3=0;
}
	
	static int fibonacci(int n) {	
		if(n == 0 || n == 1) return n;
		else
//			if(n > 0) {	
			//System.out.print(n1 + " " + n2 + " ");

//			n3 = n1 + n2;
//			n1=n2;
//			n2=n3;
//			n--;
			//System.out.println(n3);
			n3 = fibonacci(n-1) + fibonacci(n-2);
			return n3;			
//		}
//		else {
//			return 0;
//		}
				
//		without recursion	
//		int n1=0, n2 = 1,n3=0;
//		for(int i = 2; i < n; i++) {
//			n3 = n1 + n2;
//			n1=n2;
//			n2=n3;
//		}
		
	}

	public static void main(String[] args) {
		int result = fibonacci(6);
		System.out.println(result);
	}

}
