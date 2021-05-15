package esnekBaglanti;
public class arabaIslemleri implements I_arabaIslemleri {

	@Override
	public boolean arabaKaydet(araba araba) {
		boolean durum = arabalar.add(araba);
		return durum;
	}
	@Override
	public boolean arabaSil(araba araba) {
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
