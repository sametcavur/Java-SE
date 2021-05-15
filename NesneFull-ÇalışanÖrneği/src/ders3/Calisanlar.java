package ders3;

public abstract class Calisanlar {
	private String isim;
	private String soyisim;
	private int yas;
	private adres adres; // Assocation ( Nesneler Aras� �li�ki)//
	public Calisanlar(String isim, String soyisim, int yas,adres adres) {
		this.isim = isim;
		this.soyisim = soyisim;
		this.yas = yas;	
		this.adres=adres;
	}
	public Calisanlar() {
		
	}
	// M�hendis class�nda override edildi//
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
	// Encaps�lation //
	public void setIsim(String isim) {
		if(isim.length()<5)
		{
			this.isim="Kullan�c�";
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
