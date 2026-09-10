package teluguittutorials.com;

public class LambdaExpressions1 {
	// Functional interface with no parameters
	@FunctionalInterface
	interface sayHello
	{
		String hello();
	}
	// Functional interface with a single parameter
	interface Greeting
	{
		String sayGreet(String msg);
	}
	//Functional interface with multiple parameters
	interface MathOperations
	{
		int operation(int a,int b);
	}
	public static void main(String[] args) {
		sayHello sayhello=()->"Hello Students how are you";
		System.out.println(sayhello.hello());
		
		Greeting greet1=(msg)->"Hello " + msg;
		System.out.println(greet1.sayGreet("Bhargavi"));
		
		Greeting greet2=(String msg)->"Hello " + msg;
		System.out.println(greet2.sayGreet("Srini"));
		
		MathOperations addition=(int a,int b)->a+b;
		MathOperations subtract=(a,b)->a-b;
		System.out.println(addition.operation(10,20));
		System.out.println(subtract.operation(20,10));
		
		
		
	}

}
