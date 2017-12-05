package testKnowlegeInThreads;

public class MainClass {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Beginning...");
		Thread t = new Thread(new MyThreadTwo());
		Thread t2 = new Thread(new MyThreadOne(t));
		Thread.sleep(100);
		t.start();
		t2.start();
	}
}
