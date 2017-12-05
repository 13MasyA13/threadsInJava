package waitAndNotify;

public class MyThreadOne implements Runnable {
	AllMas m;
	
	public MyThreadOne(AllMas m) {
		this.m = m;
	}
	
	public void run() {
		try {
			m.add();
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}

}
