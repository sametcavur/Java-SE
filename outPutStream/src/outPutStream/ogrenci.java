package outPutStream;

import java.io.Serializable;

@SuppressWarnings("serial")
public class ogrenci implements Serializable{
	private String isim;
	private String soyisim;
	private int yas;
	private String okulNo;
	public ogrenci(String isim, String soyisim, int yas, String okulNo) {super();
		this.isim = isim;
		this.soyisim = soyisim;
		this.yas = yas;
		this.okulNo = okulNo;
	}
	public ogrenci() {
		
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
		return "ogrenci [isim=" + isim + ", soyisim=" + soyisim + ", yas=" + yas + ", okulNo=" + okulNo + "]";
	}
	

}
