package ders3;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
	/*
	 * Çalýþanlar Classý -abstract- edildiði için bir alttaki nesne oluþmaz.
	*  Calisanlar Cal1 = new  Calisanlar();
	*  Fakat Calisanlar adý altýnda mühendis,doktor yada öðretmen classý açýlabilir.Yani
	*  Bir alltaki örnekteki nesne oluþturalabilir.
	*  Calisanlar Muh3 = new Muhendis();
	*/
	
	//PARAMETRELÝ CONSTRUCTOR ÝLE GÝRÝLENLER//
	Calisanlar muh1 = new Muhendis("Ýnþaat", "Faruk", "Yeni", 53,null);
	Calisanlar dok1 = new Doktor("Estetik", "Murat", "Çagýr", 32, null);
	Calisanlar ogr1 = new Ogretmen("Hakký", "Hakmaz", 33, null,null);
	
	
	// ASSOCATÝON (NESNELER ARASI ÝLÝÞKÝ) CLASSI //
	adres muhAdres = new adres("Ýst", "Zb", "43.sokak");
	muh1.setAdres(muhAdres);
	adres dokAdres = new adres("Denizli", "Karaköprü", "32.sokak");
	dok1.setAdres(dokAdres);
	adres ogrAdres = new adres("Antalya", "Kültür", "4312.sokak");
	ogr1.setAdres(ogrAdres);
	
	// KAPSÜLLENMÝÞ PARAMETRESÝZ ÖRNEK //
	Muhendis muh2 = new Muhendis();
	muh2.setBolum("Yazýlým");
	muh2.setIsim("Rel");
	muh2.setSoyisim("Þaþmaz");
	muh2.setYas(26);
	adres muh2adres = new adres("Ýst", "Bayrampaþa", "Çiçek sokak");
	muh2.setAdres(muh2adres);
	
	//NORMAL YAZDIRILANLAR//
	System.out.println("Mühendis 1'in Bilgileri:");
	System.out.println(muh1);
	System.out.println("-----");
	System.out.println("Doktor 1 'in Bilgileri:");
	System.out.println(dok1);
	System.out.println("-----");
	System.out.println("Öðretmen 1'in Bilgielri:");
	System.out.println(ogr1);
	System.out.println("-----");
	//Bu alttaki encapsülation örneði çýktýsý//
	System.out.println("Mühendis 2'in Bilgileri:");
	System.out.println(muh2);
	System.out.println("-----");
	
	//POLYMORFÝZM//
	ArrayList<String> calIsim = new ArrayList<>();
	calIsim.add(muh1.getIsim());
	calIsim.add(muh2.getIsim());
	calIsim.add(dok1.getIsim());
	calIsim.add(ogr1.getIsim());
	for (String string : calIsim) {
		System.out.println(string);
	}
	System.out.println("-----");
	// OVERRÝDE //
	// Override edilmiþ,Abstract classlar//
	muh2.Giris();
	dok1.Giris();
	muh1.Giris();
	ogr1.Giris();
	}
	// POLYMORPHÝZM CLASSI //
	public static void kisiBilgileriniGoster(Calisanlar Calisan) 
	{
		// instanceof örneði //
		if(Calisan instanceof Doktor) {
			System.out.println("Ýsim=" + Calisan.getIsim());	
			System.out.println("Soyisim="+ Calisan.getSoyisim());
		}
		else {
		System.out.println("Ýsmi=" + Calisan.getIsim());
		System.out.println("Soyisim=" + Calisan.getSoyisim());
		System.out.println("Yaþ="+Calisan.getYas());
		}
		}

}
	
