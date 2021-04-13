package javaSE;
//streams
import java.util.ArrayList;
import java.util.HashMap;
//testing advjava branch if the changes gets into that branch instead of main branch
public class JavaSyntax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 int arr[]={1,2,3,4,5};
		   //traversing the array with for-each loop  
		   for(int i:arr){  
		     System.out.println(i);  
		   }  

		System.out.println("**************************************************");
		int randnum = (int) (Math.random()*10); 
		System.out.println(randnum);
		switch (randnum) {
		case 1 : System.out.println("monday");
			break;
		case 2 : System.out.println("tuesday");
			break;
		case 3 : System.out.println("wednesday");
			break;
		case 4 : System.out.println("thursday");
			break;
		case 5 : System.out.println("friday");
			break;
		case 6 : System.out.println("saturday");
			break;
		case 7 : System.out.println("sunday");
			break;
		default: System.out.println("not valid");
	}
		//Arraylist testing
		ArrayList<String> color1 = new ArrayList<String>();
		color1.add("blue");
		color1.add("red");
		ArrayList<String> color2 = new ArrayList<String>();
		color2.add("yello");
		color1.addAll(color2);
		System.out.println(color1.size());
		
		//Hashmap
		HashMap<String,String> map1 = new HashMap<>(3);
		map1.put("key1", "red");
		map1.put("key2", "blue");	
		map1.put("key3", "yellow");	
		System.out.println(map1);
		
} 
	
	
}
