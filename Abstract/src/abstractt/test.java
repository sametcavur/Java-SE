package abstractt;

import java.util.ArrayList;

public class test {
	public static void main(String[] args) {
		ilkinsan insan1 = new ilkinsan("Samet","�avur",23,"Erkek");
		insan1.setGozRengi("Kahve");
		insan1.setKilosu(91);
		ilkinsan insan2 = new ilkinsan("Metin","�avur",23,"Erkek");
		insan1.setGozRengi("Kahve");
		insan1.setKilosu(91);
		ilkinsan insan3 = new ilkinsan("Murat","�avur",23,"Erkek");
		insan1.setGozRengi("Kahve");
		insan1.setKilosu(91);
		
		ArrayList<String> insanlar = new ArrayList<String>();

	}
	
	public static void InsanBilgileriniG�ster(insan i) {
		System.out.println("Adi="+ i.getAdi());
		System.out.println("Soyadi="+ i.getSoyadi());
		System.out.println("Ya��"+ i.getYasi());
		System.out.println("Cinsiyeti="+ i.getCinsiyeti());

	}

		}
	

