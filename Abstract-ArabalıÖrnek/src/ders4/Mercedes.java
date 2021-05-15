package ders4;

import java.util.ArrayList;

public class Mercedes extends Araba {
	private int kapiAdedi;
	
	public Mercedes() {
		
	}
	public Mercedes(int yas, ArrayList<String> kazaDurumu, int km, String model, String renk, int kapiAdedi) {
		super(yas, kazaDurumu, km, model, renk);
		this.kapiAdedi = kapiAdedi;
	}

	
	public int getKapiAdedi() {
		return kapiAdedi;
	}
	public void setKapiAdedi(int kapiAdedi) {
		this.kapiAdedi = kapiAdedi;
	}
	
	@Override
	public String toString() {
		return "Mercedes [kapiAdedi=" + kapiAdedi + ", Renk=" + getRenk() + ", Model=" + getModel()
				+ ", Yas=" + getYas() + ",	KazaDurumu=" + getKazaDurumu() + ", Km=" + getKm() + "]";
	}
	// Abstract //
	@Override
	public int getKmBasiYakit() {
		// TODO Auto-generated method stub
		return getKm()*2;
	}

}
