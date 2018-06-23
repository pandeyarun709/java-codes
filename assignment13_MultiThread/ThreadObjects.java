package assignment13_MultiThread;

public class ThreadObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Thread t = Thread.currentThread();
		
		TaskThread task = new TaskThread();
		
		Thread t1 = new Thread(task);
		Thread t2 = new Thread(task);
		
		
		t1.start();
		t2.start(); //thread 2 execute but t1 and t2 doing same task so t2 not repeat same task whisch is done by t1
		
		System.out.println(t1.getName() + " " +t1.getState()  + " " );
	}

}
