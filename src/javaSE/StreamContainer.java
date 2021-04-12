package javaSE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamContainer {

	public static void main(String[] args) {
		
		List<Integer> larr = Arrays.asList(2,1,5,4);
		
		//Another way of converting int[] to List
		int[] nums = {2,1,5,4};
		List<Integer> second_larr = new ArrayList<>(nums.length);
		for(int i: nums)
			second_larr.add(i);
		System.out.println(second_larr); //[2, 1, 5, 4]
		
		//Another way of converting int[] to List
		List<Integer> third_larr = Arrays.stream(nums).boxed().collect(Collectors.toList());
		System.out.println(third_larr); //[2, 1, 5, 4]
		
		//Stream API uses INTERMEDIATE AND TERMINAL OPERATIONS. FOLLOWING ARE EXAMPLES
		//Intermediate operations examples - map, filter, sorted. Terminal operations examples - foreach, reduce, collect
		
		List<Integer> result_map = larr.stream().map(x -> x*x).collect(Collectors.toList());
		System.out.println(result_map); //[4, 1, 25, 16]
		
		List<Integer> result_filter = larr.stream().filter(y -> y%2 == 0).collect(Collectors.toList());
		System.out.println(result_filter);//[2, 4]
		
		List<Integer> result_sort = larr.stream().sorted().collect(Collectors.toList());
		System.out.println(result_sort); //[1, 2, 4, 5]
		
		larr.stream().map(x -> x*x).forEach(z -> System.out.print(z + " "));//4 1 25 16
		
		int result_reduce = larr.stream().reduce(0, (x,y)->x + y);
		System.out.println("\n" + result_reduce);//12

	}

}
