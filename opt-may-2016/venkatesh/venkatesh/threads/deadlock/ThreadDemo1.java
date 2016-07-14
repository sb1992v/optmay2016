package venkatesh.threads.deadlock;

public class ThreadDemo1 extends Thread{

	@Override
	public void run() {
		   synchronized (TestThread.Lock1)
		   {
			   System.out.println("Thread 1 is holding lock1");
			   
			   try{
				   Thread.sleep(1000);
			   }
			   catch(InterruptedException ex)
			   {
				   ex.printStackTrace();
			   }
			   System.out.println("Thread 1 is waiting for lock2");

			   synchronized(TestThread.Lock2)
			   {
				   System.out.println("Thread 1 is holding lock1 & lock2");

			   }
		   }
	}

	
	
	
}
