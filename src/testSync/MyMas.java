package testSync;

public class MyMas {
	private int[] mas = new int[50];
	
	public MyMas(int val) {
		for(int a = 0; a < mas.length; a++) {
			mas[a] = val;
		}
	}
	
	public void multiply() {
		for(int i = 0; i < mas.length; i++) {
			mas[i] *= 50;
		}
	}
	
	public void del() {
		for (int i = 0; i < mas.length; i++) {
			mas[i] /= 100;
		}
	}
	
	
	@Override
	public String toString() {
		String str = "";
		for (int i = 0; i < mas.length; i++) {
			str += mas[i] + " , ";
		}
		
		return str;
	}	
}