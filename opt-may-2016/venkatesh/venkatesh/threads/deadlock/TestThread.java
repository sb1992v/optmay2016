package venkatesh.threads.deadlock;

public class TestThread {
	 public static Object Lock1 = new Object();
	   public static Object Lock2 = new Object();
	   
	   public static void main(String[] args)
	   { System.out.println("....");
		   ThreadDemo1 t1=new ThreadDemo1();
		   TheadDemo2 	t2=new TheadDemo2();
		   t1.start();
		   t2.start();
	   }
	   
}
