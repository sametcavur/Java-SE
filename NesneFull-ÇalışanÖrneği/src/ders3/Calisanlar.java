package ders3;

public abstract class Calisanlar {
	private String isim;
	private String soyisim;
	private int yas;
	private adres adres; // Assocation ( Nesneler Arasý Ýliþki)//
	public Calisanlar(String isim, String soyisim, int yas,adres adres) {
		this.isim = isim;
		this.soyisim = soyisim;
		this.yas = yas;	
		this.adres=adres;
	}
	public Calisanlar() {
		
	}
	// Mühendis classýnda override edildi//
	public abstract void Giris();
	public adres getAdres() {
		return adres;
	}
	public void setAdres(adres adres) {
		this.adres = adres;
	}
	public String getIsim() {
		return isim;
	}
	// Encapsülation //
	public void setIsim(String isim) {
		if(isim.length()<5)
		{
			this.isim="Kullanýcý";
		}
		else
		this.isim = isim;
	}
	public String getSoyisim() {
		return soyisim;
	}
	public void setSoyisim(String soyisim) {
		this.soyisim = soyisim;
	}
	public int getYas() {
		return yas;
	}
	public void setYas(int yas) {
		this.yas = yas;
	}
	@Override
	public String toString() {
		return "Calisanlar [isim=" + isim + ", soyisim=" + soyisim + ", yas=" + yas + ", adres=" + adres + "]";
	}
}
