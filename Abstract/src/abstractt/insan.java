package abstractt;

public abstract class insan {
	private String adi;
	private String soyadi;
	private int yasi;
	private String cinsiyeti;
	
	public insan() {
		
	}
	public insan(String adi,String soyadi,int yasi,String cinsiyeti) {
		this.adi=adi;
		this.soyadi=soyadi;
		this.yasi=yasi;
		this.cinsiyeti=cinsiyeti;
	}
	public abstract String gozRengi();
	public abstract int kilosu();
	
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
	public int getYasi() {
		return yasi;
	}
	public void setYasi(int yasi) {
		this.yasi = yasi;
	}
	public String getCinsiyeti() {
		return cinsiyeti;
	}
	public void setCinsiyeti(String cinsiyeti) {
		this.cinsiyeti = cinsiyeti;
	}
	@Override
	public String toString() {
		return "insan [adi=" + adi + ", soyadi=" + soyadi + ", yasi=" + yasi + ", cinsiyeti=" + cinsiyeti + "]";
	}
	
	

}
