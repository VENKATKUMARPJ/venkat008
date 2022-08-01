package treadRunnable;

public class ThreadDemoRunnable implements Runnable  {
	public void run() {
	  	  for(int i=0;i<5;i++) {
	  	  System.out.println(Thread.currentThread().getName());
	  	  }
	  	  
	  	  try {
	  		  Thread.sleep(3000); //1000 milliseconds is 1 second 
	  	  }
	  	  catch(InterruptedException e){
	  		  e.printStackTrace();
	  		  System.out.println("error occured");
	  	  }
	    }
	    
	    public static void main(String args[]) {
	  	  
	  	  //create target of runnable interface
	    ThreadDemoRunnable td2=new ThreadDemoRunnable();
	  	ThreadDemoRunnable td3=new ThreadDemoRunnable();
	  	  
	  	  
	  	  //create threads by passing runnable targets in constructor
	  	  Thread t=new Thread(td2);
	  	  Thread t2=new Thread(td3);
	  	  
	  	  
	  	  //by setting name we can check which thread is running thats all
	  	  t.setName("google");
	  	  t2.setName("yahoo");
	  	  
	  	  t.start();
	  	  t2.start();
	    }


}
