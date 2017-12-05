package waitAndNotify;

public class AllMas {
	
	private static int[] mas = new int[10];
	private final static int COUNT = 5;
	
	public synchronized void add() throws InterruptedException {
		while(mas[4] != 0) {
			wait();
		}
		for(int i = 0; i < COUNT; i++) {
			mas[i] = i;
		}
		
		notifyAll();
		System.out.println(this);
	}
	

	public synchronized void del() throws InterruptedException {
		while(mas[4] == 0) {
			wait();
		}
		for(int i = 0; i < COUNT; i++) {
			mas[i] = 0;
		}
		
		notifyAll();
		
		System.out.println(this);
	}
	
	@Override
	public String toString() {
		String str = "";
		for(int i = 0; i < mas.length; i++) {
			str += mas[i] + " , ";
		}
		
		return str;
	}
}
