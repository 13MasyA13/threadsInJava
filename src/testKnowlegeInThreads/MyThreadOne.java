package testKnowlegeInThreads;

public class MyThreadOne implements Runnable{
	Thread thr;
	
	public MyThreadOne(Thread thr) {
		this.thr = thr;
	}
	
	
	@Override
	public void run() {
		try {
			thr.join();
			System.out.println("Thread has joined!");
			System.out.println("End...");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
