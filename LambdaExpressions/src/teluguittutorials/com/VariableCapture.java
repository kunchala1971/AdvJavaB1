package teluguittutorials.com;

public class VariableCapture {
	

	//Instance variable
	int instanceVar=10;
	//Static variable
	static int staticVar=20;
	public void variableCapture()
	{
		//Local variable
				int localVar=30;
				Runnable r=()->{
					instanceVar=15;
					staticVar=25;
					System.out.println("intanceVariable:" + instanceVar);
					System.out.println("Static Variable:" + staticVar);
					System.out.println("Local Variable:" + localVar);

				};
				
				r.run();
	}
	public static void main(String[] args) {
		
		new VariableCapture().variableCapture();
	}

}
