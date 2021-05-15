package Deneme;

public class Ogrenci extends Kisi {
	private int okulno;
	
	public Ogrenci() {
		
	}
	public Ogrenci(String isim, String soyisim, int dogumYili, Deneme.adres adres) {
		super(isim, soyisim, dogumYili, adres);
	}
	public Ogrenci(String isim, String soyisim, int dogumYili, Deneme.adres adres, int okulno) {
		super(isim, soyisim, dogumYili, adres);
		this.okulno = okulno;
	}
	public int getOkulno() {
		return okulno;
	}
	public void setOkulno(int okulno) {
		this.okulno = okulno;
	}
	@Override
	public String toString() {
		return "Ogrenci [okulno=" + okulno + ", Isim=" + getIsim() + ", Soyisim=" + getSoyisim()
				+ ", DogumYili=" + getDogumYili() + ", Adres=" + getAdres() + "]";
	}
	
	

}
