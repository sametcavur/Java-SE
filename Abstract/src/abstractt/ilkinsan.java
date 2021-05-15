package abstractt;

public class ilkinsan extends insan{
	private String gozRengi;
	private int kilosu;
	

	public String getGozRengi() {
		return gozRengi;
	}

	public void setGozRengi(String gozRengi) {
		this.gozRengi = gozRengi;
	}

	public int getKilosu() {
		return kilosu;
	}

	public void setKilosu(int kilosu) {
		this.kilosu = kilosu;
	}

	@Override
	public String gozRengi() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int kilosu() {
		// TODO Auto-generated method stub
		return 0;
	}

	public ilkinsan() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ilkinsan(String adi, String soyadi, int yasi, String cinsiyeti) {
		super(adi, soyadi, yasi, cinsiyeti);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ilkinsan [gozRengi=" + gozRengi + ", kilosu=" + kilosu + ", Adi=" + getAdi() + ", Soyadi="
				+ getSoyadi() + ", Yasi=" + getYasi() + ", Cinsiyeti=" + getCinsiyeti() + "]";
	}

	
	
	
	
}
