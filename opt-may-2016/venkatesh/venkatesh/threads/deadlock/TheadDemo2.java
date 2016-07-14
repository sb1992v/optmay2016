package venkatesh.threads.deadlock;

public class TheadDemo2 extends Thread{

	@Override
	public void run() {
		   synchronized (TestThread.Lock2)
		   {
			   System.out.println("Thread 2 is holding lock2");
			   
			   try{
				   Thread.sleep(1000);
			   }
			   catch(InterruptedException ex)
			   {
				   ex.printStackTrace();
			   }
			   System.out.println("Thread 2 is waiting for lock1");

			   synchronized(TestThread.Lock1)
			   {
				   System.out.println("Thread 2 is holding lock1 & lock2");

			   }
		   }
	}

	
	
	
	
	
}
