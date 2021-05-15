package Deneme;

import java.util.ArrayList;

public class KisiÝslemleriÝmp implements KisiIslemleri{
	ArrayList<Kisi> kisiler = new ArrayList<>();

	@Override
	public boolean kisiEkle(Kisi kisi) {
		boolean durum = kisiler.add(kisi);
		// TODO Auto-generated method stub
		return durum;
	}

	@Override
	public boolean kisiSil(Kisi kisi) {
		boolean durum = kisiler.remove(kisi);
		// TODO Auto-generated method stub
		return durum;
	}

	@Override
	public void kisiBilgileriniGoster(Kisi kisi) {
		System.out.println("Ýsim= "+ kisi.getIsim());
		System.out.println("Soyisim= "+kisi.getSoyisim());
		System.out.println("Doðum Yýlý= "+kisi.getDogumYili());
		// TODO Auto-generated method stub
	}
	@Override
	public void adresBilgileriniGoster(Kisi kisi) {
		adres adres = kisi.getAdres();
		System.out.println(kisi.getIsim() + " adlý kiþinin adresi:");
		System.out.println("Ýl= "+adres.getIl());
		System.out.println("Ýlçe= "+adres.getIlce());
		System.out.println("Sokak= "+adres.getSokak());
		System.out.println("Cadde= "+adres.getCadde());
		System.out.println("Mahalle= "+adres.getMahalle());
		// TODO Auto-generated method stub	
	}

	@Override
	public void kisileriListele() {
		for(Kisi kisi : kisiler) {
			System.out.println("Ýsim= "+ kisi.getIsim());
		}
		
	}

}
