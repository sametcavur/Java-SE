package thread;

public class main {
	public static void main(String[] args) {
		kronometre kro1 = new kronometre("�lk Kronometre");
		Thread t1 = new Thread(kro1);
		kronometre kro2 = new kronometre("�kinci Kronometre");
		Thread t2 = new Thread(kro2);
		t1.start();
		t2.start();
}}
