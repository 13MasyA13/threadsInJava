package testKnowlegeInThreads;

public class MyThreadTwo implements Runnable {
	private int[] mas = new int[1000_000];
	
	@Override
	public void run() {
		
		for(int i = 0; i < mas.length; i++) {
			mas[i] = i;
		}
		
		for(int i = 0; i < mas.length; i++) {
			mas[i] *= 1000;
		}
		
		for(int i = 0; i < mas.length; i++) {
			mas[i] /= 100;
		}
	}

}
