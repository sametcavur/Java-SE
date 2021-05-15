package ders3;

public class Muhendis extends Calisanlar {
	private String bolum;
	
	public Muhendis() {
		
	}
	public Muhendis(String bolum,String isim,String soyisim,int yas,adres adres) {
		super(isim,soyisim,yas,adres);
		this.bolum=bolum;
	}
	public String getBolum() {
		return this.bolum;
	}
	public void setBolum(String bolum) {
		this.bolum=bolum;
	}
	@Override // Override edilmiþ Giriþ //
	public void Giris() {
	 System.out.println("Mühendis Giriþ Yaptý!!!.");
	}
	@Override
	public String toString() {
		return "Muhendis [bolum=" + bolum +  ", Isim=" + getIsim()+ 
				", Soyisim=" + getSoyisim() + ", Yas=" + getYas() + ", Adres=" + getAdres() +"]";
	}
}
