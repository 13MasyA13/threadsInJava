package waitAndNotify;

public class MyThreadTwo implements Runnable {

	AllMas m;
	
	public MyThreadTwo(AllMas m){
		this.m = m;
	}
	
	@Override
	public void run() {
		try {
			m.del();
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}

}
