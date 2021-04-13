package javaSE;

public class RecursiveEuclideanAlgorithm {

	static int recursivegcd(int x, int y) {
		//1. this is a recursive method.
		//2. first item we should write is the basecase so the method can be terminated and value can be returned back to the calling method
		if(y == 0) {
			return x;
		}
		else {
			int remainder = x % y;
			return recursivegcd(y,remainder);//the return here is necessary to see the results. 
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//call recursive method
		int result = RecursiveEuclideanAlgorithm.recursivegcd(1482, 819);
		System.out.println("GCD of 1482 and 819 is : " + result);

	}

}
