package teluguittutorials.com;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Collections_Iterators {

	public static void main(String[] args) {
		//Lambda functions with Lists
		List<String> names=new ArrayList<>();
		names.add("Venkat");
		names.add("Balaji");
		names.add("John");
		names.add("Michel");
		//Iterating using forEach and Lambda
		names.forEach((name)->System.out.println(name));
		
		//Sorting using Comparator and Lambda
		Collections.sort(names,(v1,v2)->v1.compareTo(v2));
		names.forEach((name)->System.out.println(name));
		//Sorting List Reverse
		names.sort((v1,v2)->v2.compareTo(v1));
		names.forEach((name)->System.out.println(name));
		
		//Iterating a Map
		
		Map<String,Integer> items=new HashMap<>();
		items.put("Apples",1);
		items.put("Banana",2);
		items.put("FineApple", 3);
		items.forEach((value,key)->System.out.println("Item :" + key + ":" + value));
		
		
	}

}
