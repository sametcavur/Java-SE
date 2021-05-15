package collection;

public class mapOgrenci {
	private String isim;
	private String soyisim;
	private int dogumYili;
	public mapOgrenci(String isim, String soyisim, int dogumYili) {
		this.isim = isim;
		this.soyisim = soyisim;
		this.dogumYili = dogumYili;
	}
	public mapOgrenci() {		
	}
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public String getSoyisim() {
		return soyisim;
	}
	public void setSoyisim(String soyisim) {
		this.soyisim = soyisim;
	}
	public int getDogumYili() {
		return dogumYili;
	}
	public void setDogumYili(int dogumYili) {
		this.dogumYili = dogumYili;
	}
	@Override
	public String toString() {
		return "Kisi [isim=" + isim + ", soyisim=" + soyisim + ", dogumYili=" + dogumYili + "]";
	}}
