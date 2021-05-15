package esnekBaglanti;

public class main {
	public static void main(String[] args) {
		araba araba1 = new araba("bmw", "318", 2015);
		araba araba2 = new araba("mercedes", "cla180", 2017);
		
		I_arabaIslemleri arabaIslemleri = new arabaIslemleriGuncel();
		arabaIslemleri.arabaKaydet(araba1);
		arabaIslemleri.arabaKaydet(araba2);
		arabaIslemleri.listele();
		}

}
