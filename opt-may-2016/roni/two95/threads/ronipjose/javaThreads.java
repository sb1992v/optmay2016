package two95.threads.ronipjose;

/*
 * author Roni P Jose
 */




public class javaThreads extends Thread{

	public static void main(String[] args) {

		final String printer_1="printer_1";
		final String printer_2="printer_2";
		
		//thread 1 trying and trying to lock printer_1 first then printer_2
		Thread t1=new Thread(){
			
			public void run(){
				synchronized (printer_1){
				
					System.out.println(Thread.currentThread()+"has locked printer_1");
			        try{Thread.sleep(1000);}catch(Exception e)	{e.getMessage();}
			}	
				synchronized (printer_2){
					
					System.out.println(Thread.currentThread()+"has locked printer_2");
			        try{Thread.sleep(1000);}catch(Exception e)	{e.getMessage();}
			}	
				
				
			}
			
			
		};
		
		//thread 2 trying to lock printer_2 first then printer_1
        Thread t2=new Thread(){
			
			public void run(){
				synchronized (printer_2){
				
					System.out.println(Thread.currentThread()+"has locked printer_2");
			        try{Thread.sleep(1000);}catch(Exception e)	{e.getMessage();}
			}	
				synchronized (printer_1){
					
					System.out.println(Thread.currentThread()+"has locked printer_1");
			        try{Thread.sleep(1000);}catch(Exception e)	{e.getMessage();}
			}	
				
				
			}
			
			
		};
		
		t1.start();
		t2.start();
		
		
	}

}
