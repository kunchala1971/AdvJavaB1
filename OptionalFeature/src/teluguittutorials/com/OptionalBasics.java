package teluguittutorials.com;

import java.util.Optional;

public class OptionalBasics {

	public static void main(String[] args) {
		
		//Create Optional
		Optional<String> emptyOpt=Optional.empty();
		Optional<String> nonNullOpt=Optional.of("Hello Java 8 New Feature");
		System.out.println(emptyOpt);
		System.out.println(nonNullOpt);
		//Checking Presence
		System.out.println("Non Null Option:"+ nonNullOpt.isPresent());
		System.out.println("Non Empty Option:"+ emptyOpt.isPresent());
		//ifPresent (functional Way) using lambda expression
		nonNullOpt.ifPresent((val)->System.out.println("The Value is :"+ val));
		emptyOpt.ifPresent((val)->System.out.println("The Value is :"+ val));
		
		//Default values if empty
		String result=emptyOpt.orElse("Default Test Value");
		System.out.println("Result using orElse:" + result);
		String result1=nonNullOpt.orElse("Default Test Value");
		System.out.println("Result using orElse:" + result1);
		
		//Throwing exception if empty
			try
			{
				emptyOpt.orElseThrow(()->new IllegalArgumentException("Value not present"));
			}
			catch(Exception e)
			{
				System.out.println("Caught Exception:" + e.getMessage());
			}
	}

}
