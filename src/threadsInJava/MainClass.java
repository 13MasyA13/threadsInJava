package threadsInJava;

public class MainClass {
	public static void main(String[] args) {
		Thread t1 = new Thread(new MyRunnable(100));
		Thread t2 = new Thread(new MyRunnable(50));
		Thread t3 = new Thread(new MyRunnable(33));
		t1.start();
		t2.start();
		t3.start();
	}
}
