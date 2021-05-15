package denem;

public class Daire implements deneme{
	private final double piSayisi=Math.PI;
	private double r;
	
	public Daire() {
		
	}
	public Daire(double r) {
		super();
		this.r = r;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	public double getPiSayisi() {
		return piSayisi;
	}

	@Override
	public double alanHesapla() {
		// TODO Auto-generated method stub
		return piSayisi*r*r;
	}

	@Override
	public double cevreHesapla() {
		// TODO Auto-generated method stub
		return 2*piSayisi*r;
	}
	@Override
	public String toString() {
		return "Daire [alanHesapla()=" + alanHesapla() + ", cevreHesapla()=" + cevreHesapla() + "]";
	}

	


	

}
