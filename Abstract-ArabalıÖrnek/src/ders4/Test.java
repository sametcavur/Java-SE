package ders4;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		BMW bmw1 = new BMW(5, null, 1000, "3.18", "Beyaz", "50");
		ArrayList<String> kazalar = new ArrayList<String>();
		kazalar.add("Tampon Kazas�");
		kazalar.add("Kald�r�ma �arpm��");
		kazalar.add("At'a �arpm��");
		bmw1.setKazaDurumu(kazalar);
		
		Mercedes mer1 = new Mercedes(10, null,2000, "Cla180", "Siyah", 4);
		ArrayList<String> kazalar1 = new ArrayList<String>();
		kazalar1.add("Hafif Kaza");
		kazalar1.add("Trene �arpm��");
		mer1.setKazaDurumu(kazalar1);
		
		bilgileriGoruntule(bmw1);
		System.out.println("------------");
		bilgileriGoruntule(mer1);
		
		
		
		
	}
		public static void bilgileriGoruntule(Araba araba) {
			System.out.println("Araban�n Modeli=" + araba.getModel());
			System.out.println("Araban�n Kmsi=" + araba.getKm());
			System.out.println("Araban�n Rengi=" + araba.getRenk());
			System.out.println("Araban�n Ya��=" + araba.getYas());
			System.out.println("Araban�n Kaza Durumu" + araba.getKazaDurumu());
			System.out.println("Araban�n Km Ba��na Yak�t�="+ araba.getKmBasiYakit());
		}
		
	

}
