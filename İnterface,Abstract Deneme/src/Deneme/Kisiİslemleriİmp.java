package Deneme;

import java.util.ArrayList;

public class Kisi�slemleri�mp implements KisiIslemleri{
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
		System.out.println("�sim= "+ kisi.getIsim());
		System.out.println("Soyisim= "+kisi.getSoyisim());
		System.out.println("Do�um Y�l�= "+kisi.getDogumYili());
		// TODO Auto-generated method stub
	}
	@Override
	public void adresBilgileriniGoster(Kisi kisi) {
		adres adres = kisi.getAdres();
		System.out.println(kisi.getIsim() + " adl� ki�inin adresi:");
		System.out.println("�l= "+adres.getIl());
		System.out.println("�l�e= "+adres.getIlce());
		System.out.println("Sokak= "+adres.getSokak());
		System.out.println("Cadde= "+adres.getCadde());
		System.out.println("Mahalle= "+adres.getMahalle());
		// TODO Auto-generated method stub	
	}

	@Override
	public void kisileriListele() {
		for(Kisi kisi : kisiler) {
			System.out.println("�sim= "+ kisi.getIsim());
		}
		
	}

}
