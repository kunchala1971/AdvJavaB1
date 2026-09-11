package teluguittutorials.com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamCreation {

	public static void main(String[] args) {
		
		//Collection(List,Set)
		List<String> list=Arrays.asList("Apple","Bannan","Cherry");
		Stream<String> streamFromList=list.stream();
		System.out.println("Stream From List Count "+ streamFromList.count());
		System.out.println("Stream From List Hascode "+ streamFromList.hashCode());
		
		//From an Array
		String[] array= {"onge","two","three"};
		Stream<String> streamFromArray=Arrays.stream(array);
		System.out.println("Stream From Array Count "+ streamFromArray.count());
		
		//From Individual Values using stream.of()
		Stream<Integer> streamOfValues=Stream.of(1,2,3,4,5,6);
		System.out.println("Stream From Individual elements Count "+ streamOfValues.count());
		
		//Stream.generate() for infinite streams (need limit)
		Stream<Double> randomStream=Stream.generate(Math::random).limit(5);
		randomStream.forEach(value->System.out.print(value + ", "));
		System.out.println(" ");
	
	}

}
