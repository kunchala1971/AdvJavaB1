package teluguittutorials.com;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ConcurrentCallableFeature {

	public static void main(String[] args) {
		ExecutorService executor=Executors.newSingleThreadExecutor();
		//Callable returns a result, unlike runnable
		
		Callable<Integer> task=()->{
			System.out.println("Calculating Sum...");
			Thread.sleep(2000);
			return 10+20;
		};
		
		Future<Integer> future =executor.submit(task);
		
		try
		{
			Integer result=future.get();
			System.out.println("Result:" + result);
		}catch(InterruptedException | ExecutionException e)
		{
			e.printStackTrace();
		}
		finally {
			executor.shutdown();
		}
		
	}

}
