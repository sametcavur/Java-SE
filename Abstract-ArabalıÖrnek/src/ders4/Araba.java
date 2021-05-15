package ders4;

import java.util.ArrayList;

public abstract class Araba {
	private int yas;
	private ArrayList<String> kazaDurumu;
	private int km;
	private String model;
	private String renk;
	
	public Araba() {
		
	}
	public Araba(int yas, ArrayList<String> kazaDurumu, int km,String model,String renk) {
		this.yas = yas;
		this.kazaDurumu = kazaDurumu;
		this.km = km;
		this.model=model;
		this.renk=renk;
	}
	
	public abstract int getKmBasiYakit();
	
	public String getRenk() {
		return renk;
	}
	public void setRenk(String renk) {
		this.renk = renk;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYas() {
		return yas;
	}
	public void setYas(int yas) {
		this.yas = yas;
	}
	public ArrayList<String> getKazaDurumu() {
		return kazaDurumu;
	}
	public void setKazaDurumu(ArrayList<String> kazaDurumu) {
		this.kazaDurumu = kazaDurumu;
	}
	public int getKm() {
		return km;
	}
	public void setKm(int km) {
		this.km = km;
	}
	@Override
	public String toString() {
		return "Araba [yas=" + yas + ", kazaDurumu=" + kazaDurumu + ", km=" + km + ", model=" + model + ", renk=" + renk
				+  "]";
	}
	
	
	}


