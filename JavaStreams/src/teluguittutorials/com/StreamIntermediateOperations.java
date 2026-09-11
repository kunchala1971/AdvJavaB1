package teluguittutorials.com;

import java.util.Arrays;
import java.util.List;

public class StreamIntermediateOperations {

	public static void main(String[] args) {
		List<String> names=Arrays.asList("Michel","John","Ram","Karan","Abhi","Charan","Arun","Chandu","John");
		List <Integer> nums=Arrays.asList(1,2,3,4,5);
		System.out.println("Original Names:" + names);
		System.out.println("Original Nums:" + nums);
		
		//Intermediate Operations
		//1. Filter - Filter the elements based on condition
		System.out.println("Names starts with A");
		names.stream()
		.filter(name->name.startsWith("A"))
		.forEach((name)->System.out.print(name + ", "));
		
		System.out.println("\nNames Ends with n");
		names.stream()
		.filter(name->name.endsWith("n"))
		.forEach((name)->System.out.print(name + ", "));
		
		//Print Capital Names
		System.out.println("All names Print in Capitals");
		names.stream()
		.map(String::toUpperCase)
		.forEach((name)->System.out.println(name));
		
		//print distinct names
		System.out.println("Print Distinct Names");
		names.stream()
		.distinct()
		.forEach((name)->System.out.println(name));
		
		//print distinct names with sorted order
		System.out.println("Print Distinct Names with Sorted Order");
		names.stream()
		.distinct()
		.sorted()
		.forEach((name)->System.out.println(name));
		//print distinct names with sorted order and limit
		System.out.println("Print Distinct Names with Sorted Order");
		names.stream()
		.distinct()
		.sorted()
		.limit(4)
		.forEach((name)->System.out.println(name));
		//print distinct names with sorted order and skip
		System.out.println("Print Distinct Names with Sorted Order");
		names.stream()
		.distinct()
		.sorted()
		.skip(2)
		.forEach((name)->System.out.println(name));
		//FlatMap - It transforms each element into a stream of elements , then flat into a single stream
		List<List<String>> listofLists=Arrays.asList(
				Arrays.asList("a","b"),
				Arrays.asList("c","d"),
				Arrays.asList("e","f")
				);
		listofLists.stream()
		.flatMap(list->list.stream())
		.forEach(str->System.out.print(str+ " "));
				
	}

}
