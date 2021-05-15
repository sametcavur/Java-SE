package denem;

public class Karee implements deneme{
	private double kenar;
	
	public Karee() {
	}

	public Karee(double kenar) {
		super();
		this.kenar = kenar;
	}

	
	public double getKenar() {
		return kenar;
	}

	public void setKenar(double kenar) {
		this.kenar = kenar;
	}

	@Override
	public double alanHesapla() {
		// TODO Auto-generated method stub
		return kenar*kenar;
	}

	@Override
	public double cevreHesapla() {
		// TODO Auto-generated method stub
		return kenar*4;
	}

	@Override
	public String toString() {
		return "Karee [alanHesapla()=" + alanHesapla() + ", cevreHesapla()=" + cevreHesapla()
				+ "]";
	}

	
	}
	
	


