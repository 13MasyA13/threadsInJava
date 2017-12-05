package waitAndNotify;

public class MainClass {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Begining...");
		AllMas m = new AllMas();
		Thread t1 = new Thread(new MyThreadOne(m));
		Thread t2 = new Thread(new MyThreadTwo(m));
		Thread.sleep(50);
		System.out.println("Threads are running...");
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("End...");
	}

}
