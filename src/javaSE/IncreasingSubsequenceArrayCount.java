package javaSE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class IncreasingSubsequenceArrayCount {
	static int count = 0;
	static List<ArrayList<Integer>> finalarr = new ArrayList<ArrayList<Integer>>();
	static int inc_sub_recursive(int[] nums){
		
		int arrlen = nums.length;	
		int index = 0,findex=0, incindex=0;
		int element = nums[index];

		ArrayList<Integer> resultarr = new ArrayList<>();
		//List<ArrayList<Integer>> finalarr = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> copyarr = new ArrayList<>();

		if(arrlen < 2) return count;//basecase for recursion
		
		else {
			resultarr.add(nums[0]);

			while(arrlen > 1) {

			//if(element <= arr[++index]) {			
				//resultarr.add(arr[index-1]);
				
				resultarr.add(nums[++index]);	
				copyarr = (ArrayList<Integer>) resultarr.clone();
				//element = arr[index];
				count++;
			//}
			finalarr.add(findex,copyarr);
			
			
			//resultarr = new ArrayList<>();

			arrlen--; 
			}//end of while
		}
		System.out.println(finalarr);
		//count++;
		//remove the element 0 and convert arrlist to int[] pass the new array to recursion. so everytime arraysize is reduced
		//resultarr.remove(0);
		
		//List<Integer> newlist = Arrays.stream(arr).boxed().collect(Collectors.toList());
		resultarr.remove(resultarr.get(++incindex));
		int[] newarr = resultarr.stream().mapToInt(i->i).toArray();
		
		
		return inc_sub_recursive(newarr);	
	}

	public static void main(String[] args) {
		int[] num = {4,4,3,2,1};
		int len = num.length;
		while(len > 2) {
		List<Integer> larr = Arrays.stream(num).boxed().collect(Collectors.toList());
		int arrcount = IncreasingSubsequenceArrayCount.inc_sub_recursive(num);
		larr.remove(0);
		System.out.println("next time");
		num = larr.stream().mapToInt(i->i).toArray();	
		System.out.println("array count: " + arrcount);
		--len;
		}
		

	}

}
