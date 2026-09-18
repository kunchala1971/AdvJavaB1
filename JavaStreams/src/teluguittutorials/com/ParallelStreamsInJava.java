package teluguittutorials.com;
import java.util.Arrays;
import java.util.List;
public class ParallelStreamsInJava {

	public static void main(String[] args) {
		List<Integer> nums=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		//Sequential Stream
		//stream()
		nums.stream().forEach(num->System.out.print(num + ", "));
		System.out.println("");
		//Parallel Stream 
		nums.parallelStream().forEach(num->System.out.print(num + ","));
		System.out.println("");
		//Parallel Stream with Track order
		nums.parallelStream().forEachOrdered(num->System.out.print(num + ","));
	}

}
