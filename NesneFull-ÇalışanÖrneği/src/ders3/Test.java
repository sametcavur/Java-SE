package ders3;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
	/*
	 * �al��anlar Class� -abstract- edildi�i i�in bir alttaki nesne olu�maz.
	*  Calisanlar Cal1 = new  Calisanlar();
	*  Fakat Calisanlar ad� alt�nda m�hendis,doktor yada ��retmen class� a��labilir.Yani
	*  Bir alltaki �rnekteki nesne olu�turalabilir.
	*  Calisanlar Muh3 = new Muhendis();
	*/
	
	//PARAMETREL� CONSTRUCTOR �LE G�R�LENLER//
	Calisanlar muh1 = new Muhendis("�n�aat", "Faruk", "Yeni", 53,null);
	Calisanlar dok1 = new Doktor("Estetik", "Murat", "�ag�r", 32, null);
	Calisanlar ogr1 = new Ogretmen("Hakk�", "Hakmaz", 33, null,null);
	
	
	// ASSOCAT�ON (NESNELER ARASI �L��K�) CLASSI //
	adres muhAdres = new adres("�st", "Zb", "43.sokak");
	muh1.setAdres(muhAdres);
	adres dokAdres = new adres("Denizli", "Karak�pr�", "32.sokak");
	dok1.setAdres(dokAdres);
	adres ogrAdres = new adres("Antalya", "K�lt�r", "4312.sokak");
	ogr1.setAdres(ogrAdres);
	
	// KAPS�LLENM�� PARAMETRES�Z �RNEK //
	Muhendis muh2 = new Muhendis();
	muh2.setBolum("Yaz�l�m");
	muh2.setIsim("Rel");
	muh2.setSoyisim("�a�maz");
	muh2.setYas(26);
	adres muh2adres = new adres("�st", "Bayrampa�a", "�i�ek sokak");
	muh2.setAdres(muh2adres);
	
	//NORMAL YAZDIRILANLAR//
	System.out.println("M�hendis 1'in Bilgileri:");
	System.out.println(muh1);
	System.out.println("-----");
	System.out.println("Doktor 1 'in Bilgileri:");
	System.out.println(dok1);
	System.out.println("-----");
	System.out.println("��retmen 1'in Bilgielri:");
	System.out.println(ogr1);
	System.out.println("-----");
	//Bu alttaki encaps�lation �rne�i ��kt�s�//
	System.out.println("M�hendis 2'in Bilgileri:");
	System.out.println(muh2);
	System.out.println("-----");
	
	//POLYMORF�ZM//
	ArrayList<String> calIsim = new ArrayList<>();
	calIsim.add(muh1.getIsim());
	calIsim.add(muh2.getIsim());
	calIsim.add(dok1.getIsim());
	calIsim.add(ogr1.getIsim());
	for (String string : calIsim) {
		System.out.println(string);
	}
	System.out.println("-----");
	// OVERR�DE //
	// Override edilmi�,Abstract classlar//
	muh2.Giris();
	dok1.Giris();
	muh1.Giris();
	ogr1.Giris();
	}
	// POLYMORPH�ZM CLASSI //
	public static void kisiBilgileriniGoster(Calisanlar Calisan) 
	{
		// instanceof �rne�i //
		if(Calisan instanceof Doktor) {
			System.out.println("�sim=" + Calisan.getIsim());	
			System.out.println("Soyisim="+ Calisan.getSoyisim());
		}
		else {
		System.out.println("�smi=" + Calisan.getIsim());
		System.out.println("Soyisim=" + Calisan.getSoyisim());
		System.out.println("Ya�="+Calisan.getYas());
		}
		}

}
	
