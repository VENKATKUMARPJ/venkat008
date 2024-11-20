package sleepAndWaitDemo;

public class SleepWait {
private static Object LOCK= new Object();
	
	public static void main(String[] args) {
		
	
			try {
				
				Thread.sleep(3000);  
				System.out.println(Thread.currentThread().getName()+ "  woke up after " + "2 seconds of sleep");
				
				synchronized (LOCK) {
					LOCK.wait(6000);
					System.out.println("The Object is woke up after wait of 4 seconds");
				}
				
				
			}
			 catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
				System.out.println("Error Occured: "+e);
			}
		
		
	}

}
