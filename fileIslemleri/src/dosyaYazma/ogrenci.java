package dosyaYazma;

public class ogrenci {
	private String adi;
	private String soyadi;
	private int yas;
	private String okulNo;
	public ogrenci(String adi, String soyadi, int yas, String okulNo) {
		this.adi = adi;
		this.soyadi = soyadi;
		this.yas = yas;
		this.okulNo = okulNo;
	}
	public ogrenci() {
		
	}
	public String getAdi() {
		return adi;
	}
	public void setAdi(String adi) {
		this.adi = adi;
	}
	public String getSoyadi() {
		return soyadi;
	}
	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}
	public int getYas() {
		return yas;
	}
	public void setYas(int yas) {
		this.yas = yas;
	}
	public String getOkulNo() {
		return okulNo;
	}
	public void setOkulNo(String okulNo) {
		this.okulNo = okulNo;
	}
	@Override
	public String toString() {
		return "ogrenci [adi=" + adi + ", soyadi=" + soyadi + ", yas=" + yas + ", okulNo=" + okulNo + "]";
	}
	

}
