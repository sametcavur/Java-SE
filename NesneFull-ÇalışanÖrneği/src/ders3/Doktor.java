package ders3;

public class Doktor extends Calisanlar {
	private String dal;
	public Doktor() {
	}

	public Doktor(String dal,String isim, String soyisim, int yas,adres adres) {
		super(isim, soyisim, yas,adres);
		this.dal=dal;
	}

	public String getDal() {
		return dal;
	}
	public void setDal(String dal) {
		this.dal = dal;
	}

	@Override
	public String toString() {
		return "Doktor [dal=" + dal +  ", Isim=" + getIsim() + ", Soyisim="
	+ getSoyisim() + ", Yas=" + getYas() + "Adres=" + getAdres()+ "]";
	}

	@Override
	public void Giris() {
		// TODO Auto-generated method stub
		System.out.println("Doktor Giriþ Yaptý");
		
	}
	
	
}
