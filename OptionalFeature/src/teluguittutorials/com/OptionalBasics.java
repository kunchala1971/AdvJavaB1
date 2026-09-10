package teluguittutorials.com;

import java.util.Optional;

public class OptionalBasics {

	public static void main(String[] args) {
		
		//Create Optional
		Optional<String> emptyOpt=Optional.empty();
		Optional<String> nonNullOpt=Optional.of("Hello Java 8 New Feature");
		System.out.println(emptyOpt);
		System.out.println(nonNullOpt);
	}

}
