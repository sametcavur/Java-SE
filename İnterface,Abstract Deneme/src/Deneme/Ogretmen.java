package Deneme;

public class Ogretmen extends Kisi{
	private String brans;

	public Ogretmen() {
		
		// TODO Auto-generated constructor stub
	}

	public Ogretmen(String isim, String soyisim, int dogumYili, Deneme.adres adres, String brans) {
		super(isim, soyisim, dogumYili, adres);
		this.brans = brans;
	}

	public Ogretmen(String isim, String soyisim, int dogumYili, Deneme.adres adres) {
		super(isim, soyisim, dogumYili, adres);
	}

	public String getBrans() {
		return brans;
	}

	public void setBrans(String brans) {
		this.brans = brans;
	}

	@Override
	public String toString() {
		return "Ogretmen [brans=" + brans + ", Isim=" + getIsim() + ", Soyisim=" + getSoyisim()
				+ ", DogumYýlý=" + getDogumYili() + ", Adres=" + getAdres() + "]";
	}
	
	
	

}
