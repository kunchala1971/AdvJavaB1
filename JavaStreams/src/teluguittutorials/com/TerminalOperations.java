package teluguittutorials.com;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TerminalOperations {

	public static void main(String[] args) {
		
		List<Integer> nums=Arrays.asList(10,20,30,40,50);
		System.out.println("Numbers are ");
		nums.stream().forEach((num)->System.out.print(num + " "));

		//Accumulates elements into a collection
		List<Integer> filteredNums=nums.stream()
				.filter(num-> num>30)
				.collect(Collectors.toList());
		System.out.println("Filtered Data >30 List:" + filteredNums);
		
		//Reduce Combines elements  into  a single value
		Optional <Integer> sum=nums.stream().reduce((a,b)->a+b);
		sum.ifPresent(val->System.out.println(val));
		
		//count() Returns the number of elements in the stream
		long count=nums.stream().filter(num->num>0).count();
		System.out.println("Count of List is " + count);
		
		//min, max 
		Optional<Integer> min=nums.stream().min(Integer::compareTo);
		min.ifPresent(val->System.out.println("Min Value:" + val));
		Optional<Integer> max=nums.stream().max(Integer::compareTo);
		max.ifPresent(val->System.out.println("Max Value:" + val));
		
		//anyMatch(),allMatch(),noneMath() returns a boolean based on a Predicate
		boolean anyGreaterthan50=nums.stream().anyMatch((num)->num>20);
		System.out.println(anyGreaterthan50);
		
		boolean allMatchNums=nums.stream().allMatch((num)->num>0);
		System.out.println(allMatchNums);
		
		boolean noneMatch=nums.stream().noneMatch((num)->num<0);
		System.out.println(noneMatch);
		
		//findFirst
		Optional <Integer> firstFirst=nums.stream().filter((num)->num>25).findFirst();
		firstFirst.ifPresent(val->System.out.println("First Number >25:" + val));
		Optional <Integer> findAny=nums.stream().filter((num)->num>25).findAny();
		findAny.ifPresent(val->System.out.println("First Number >25:" + val));
		
		}

}
