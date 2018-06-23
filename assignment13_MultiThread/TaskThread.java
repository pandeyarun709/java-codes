package assignment13_MultiThread;

public class TaskThread implements Runnable {
	
	int i = 1;
	@Override
	public void run() {  
		System.out.println(Thread.currentThread().getName()  + " "  +Thread.currentThread().getState());
		synchronized (this) {
			while(i <= 1000) {
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				     System.out.println( Thread.currentThread().getName()  +"  "  +i);
			         i++;
			       }
			System.out.println( Thread.currentThread().getName() + " " + Thread.currentThread().getState());
		
		   }
	}
}
