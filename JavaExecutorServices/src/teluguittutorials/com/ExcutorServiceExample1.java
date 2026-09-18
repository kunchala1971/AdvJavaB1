package teluguittutorials.com;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExcutorServiceExample1 {

	public static void main(String[] args) {
		ExecutorService executor=Executors.newFixedThreadPool(3);
		for(int i=1;i<=5;i++)
		{
			final int taskId=i;
			executor.submit(()->{
				System.out.println("Task " + taskId + " Executed By " + Thread.currentThread().getName());
				try
				{
					Thread.sleep(1000);
					
				}catch(InterruptedException e)
				{
					Thread.currentThread().interrupt();
				}
			});
		}
		executor.shutdown();
		System.out.println("All Taks Submitted");

	}

}
