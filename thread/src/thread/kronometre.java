package thread;

public class kronometre implements Runnable {
	private String threadName;
	public kronometre(String threadName) {
		this.threadName = threadName;
	}
	public void run() {
		try {
		for (int i = 1; i <= 10; i++) {
			System.out.println(threadName + "=" +i);
			Thread.sleep(1000);
			}
		} 
		catch (InterruptedException e) 
		{e.getMessage();}
	}}

