package threadsInJava;

public class MyRunnable implements Runnable{
	
	private int count;
	
	public MyRunnable(int i) {
		count = i;
	}
	public synchronized void increment() {
		count++;
	}
	
	public synchronized void decrement() {
		count--;
	}
	
	@Override
	public void run() {
		MyRunnable a = new MyRunnable(100);
		for(int i = 0; i < 100000; i++) {
			a.increment();
			System.out.println(count);
		}
		
		for(int i = 0; i < 100; i++) {
			a.decrement();
			System.out.println(count);
		}
		
		for(int i = 0; i < 1000000; i++) {
			a.increment();
			System.out.println(count);
		}
	}
	
}
