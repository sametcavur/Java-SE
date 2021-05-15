package ders4;

import java.util.ArrayList;

public class BMW extends Araba {
	private String JantKalinligi;
	
	public BMW (){
		
	}
	public BMW(int yas, ArrayList<String> kazaDurumu, int km, String model, String renk, String jantKalinligi) {
		super(yas, kazaDurumu, km, model, renk);
		JantKalinligi = jantKalinligi;
	}

	
	//Abstract//
	@Override
	public int getKmBasiYakit(){
		// TODO Auto-generated method stub
		return getKm()*3;
	}
	
	public String getJantKalinligi() {
		return JantKalinligi;
	}
	public void setJantKalinligi(String jantKalinligi) {
		JantKalinligi = jantKalinligi;
	}
	
	@Override
	public String toString() {
		return "BMW [JantKalinligi=" + JantKalinligi + ", Renk=" + getRenk() + ", Model=" + getModel()
				+ ", Yas=" + getYas() + ", KazaDurumu=" + getKazaDurumu() + "]";
	}
	

}
