package testSync;

public class RunnableDel extends Thread{
	private MyMas mas;
	
	public RunnableDel(MyMas m) {
		this.mas = m;
	}
	@Override
	public void run() {
		mas.del();
	}

}
