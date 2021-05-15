package ders3;

import java.util.ArrayList;

public class Ogretmen extends Calisanlar{
	private ArrayList<String> verdigiDersler;

	public Ogretmen(String isim, String soyisim, int yas, ArrayList<String> verdigiDersler,adres adres) {
		super(isim, soyisim, yas,adres);
		this.verdigiDersler = verdigiDersler;
	}
	public Ogretmen() {
	}
	public ArrayList<String> getVerdigiDersler() {
		return verdigiDersler;
	}
	public void setVerdigiDersler(ArrayList<String> verdigiDersler) {
		this.verdigiDersler = verdigiDersler;
	}
	@Override
	public String toString() {
		return "Ogretmen [verdigiDersler=" + verdigiDersler + ", Isim=" + getIsim() + ", Soyisim="
				+ getSoyisim() + ", Yas=" + getYas() +  "Adres= " + getAdres() +"]";
	}
	@Override
	public void Giris() {
		// TODO Auto-generated method stub
		System.out.println("Öðretmen Giriþ Yaptý");
	}
	

}
