package esnekBaglanti;

public class arabaIslemleriGuncel implements I_arabaIslemleri{

	@Override
	public boolean arabaKaydet(araba araba) {
		System.out.println("---KAYDEDÝLEN ARABA---");
		arabaBilgiGoster(araba);
		boolean durum = arabalar.add(araba);
		return durum;
	}

	@Override
	public boolean arabaSil(araba araba) {
		System.out.println("---SÝLÝNEN ARABA---");
		arabaBilgiGoster(araba);
		boolean durum = arabalar.remove(araba);
		return durum;
	}

	@Override
	public void arabaBilgiGoster(araba araba) {
		System.out.println(araba.getMarka());
		System.out.println(araba.getModel());
		System.out.println(araba.getYil());
	}

	@Override
	public void listele() {
		for (araba araba : arabalar) {
			System.out.println(araba);
		}
		
	}

}
