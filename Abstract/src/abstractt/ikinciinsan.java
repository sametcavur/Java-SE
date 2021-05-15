package abstractt;

public class ikinciinsan extends insan{

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

	public ikinciinsan() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ikinciinsan(String adi, String soyadi, int yasi, String cinsiyeti) {
		super(adi, soyadi, yasi, cinsiyeti);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ikinciinsan [Adi=" + getAdi() + ", Soyadi=" + getSoyadi() + ", Yasi=" + getYasi()
				+ ", Cinsiyeti=" + getCinsiyeti() + "]";
	}
	

}
