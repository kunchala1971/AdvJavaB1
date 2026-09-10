package teluguittutorials.com;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.Supplier;
public class BuiltInFunctionalInterfaces {

	public static void main(String[] args) {
		//Predicate<T> : Takes an argument of type T and return a boolean
		
		Predicate<Integer> isEven=(num)->num%2 == 0;
		System.out.println("Is 4 Even ? " + isEven.test(4));

		//Function<T,R> : Takes an argument of type T and returns a a result of type R
		Function<String,Integer> msgLength=(msg)->msg.length();
		System.out.println(msgLength.apply("Hello Bhargavi"));
		
		//Consumer<T> : Takes an argument of type T and returns no Result
		Consumer <String> printMsg=(msg)->System.out.println("Message:" + msg);
		printMsg.accept("Hello Srini");
		
		//Supplier<T>: Takes no arguments and returns a result of type T
		Supplier<Double> ramdomValue=()->Math.random();
		System.out.println("Random Value:" + ramdomValue.get());
	}

}
