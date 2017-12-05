package testSync;

public class MainClass {

	public static void main(String[] args) throws InterruptedException{
		MyMas mm = new MyMas(1000);
		Thread t1 = new RunnableMult(mm);
		Thread t2 = new RunnableDel(mm);
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		System.out.println(mm);
	}

}
