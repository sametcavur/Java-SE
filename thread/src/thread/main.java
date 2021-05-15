package thread;

public class main {
	public static void main(String[] args) {
		kronometre kro1 = new kronometre("Ýlk Kronometre");
		Thread t1 = new Thread(kro1);
		kronometre kro2 = new kronometre("Ýkinci Kronometre");
		Thread t2 = new Thread(kro2);
		t1.start();
		t2.start();
}}
