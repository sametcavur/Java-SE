package collection;
import java.util.*;


public class mainSet {
	public static void main(String[] args) {
		/*SET KULLANIMI
	 	Setin asýl özelliði ayný veriyi tekrar tutmaz.
	  	1.hashset
	 	2.treeset
	 	3.linkedhashset*/
		
		//----HASH SET----//
		//Özelliði sýralama yoktur.
		//Hash kodlarýna göre sýralar//
		//Null bir tane tutar en baþa yazar//
		Set isimler = new HashSet();
		isimler.add("Samet");
		isimler.add("Murat");
		isimler.add("Halil");
		//Ýterator ile yazdýrma//
		Iterator isimlerItr = isimler.iterator();
		while(isimlerItr.hasNext()) {
			System.out.println(isimlerItr.next());
		}
		//For Each ile yazdýrma//
		isimler.forEach(item -> System.out.println(item + " "));
		System.out.println("-------");
		//----LÝNKED HASHSET----//
		//Özelliði sýralama vardýr.Ýlk giren ilk çýkar//
		//null bir tane tutar//
		Set gunler = new LinkedHashSet();
		gunler.add("Ptesi");
		gunler.add("Salý");
		gunler.add("Çarþ");
		Iterator gunlerItr = gunler.iterator();
		while(gunlerItr.hasNext()) {
			System.out.println(gunlerItr.next());
		}
		System.out.println("--------");
		//----TREE SET----//
		//Artan sýralama ile tutar//
		//null kabul etmez//
		Set sayilar = new TreeSet();
		sayilar.add(4);
		sayilar.add(2);
		sayilar.add(8);
		sayilar.add(6);
		sayilar.forEach(sayi -> System.out.println(sayi+" "));
	}
}
