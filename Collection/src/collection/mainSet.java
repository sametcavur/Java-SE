package collection;
import java.util.*;


public class mainSet {
	public static void main(String[] args) {
		/*SET KULLANIMI
	 	Setin as�l �zelli�i ayn� veriyi tekrar tutmaz.
	  	1.hashset
	 	2.treeset
	 	3.linkedhashset*/
		
		//----HASH SET----//
		//�zelli�i s�ralama yoktur.
		//Hash kodlar�na g�re s�ralar//
		//Null bir tane tutar en ba�a yazar//
		Set isimler = new HashSet();
		isimler.add("Samet");
		isimler.add("Murat");
		isimler.add("Halil");
		//�terator ile yazd�rma//
		Iterator isimlerItr = isimler.iterator();
		while(isimlerItr.hasNext()) {
			System.out.println(isimlerItr.next());
		}
		//For Each ile yazd�rma//
		isimler.forEach(item -> System.out.println(item + " "));
		System.out.println("-------");
		//----L�NKED HASHSET----//
		//�zelli�i s�ralama vard�r.�lk giren ilk ��kar//
		//null bir tane tutar//
		Set gunler = new LinkedHashSet();
		gunler.add("Ptesi");
		gunler.add("Sal�");
		gunler.add("�ar�");
		Iterator gunlerItr = gunler.iterator();
		while(gunlerItr.hasNext()) {
			System.out.println(gunlerItr.next());
		}
		System.out.println("--------");
		//----TREE SET----//
		//Artan s�ralama ile tutar//
		//null kabul etmez//
		Set sayilar = new TreeSet();
		sayilar.add(4);
		sayilar.add(2);
		sayilar.add(8);
		sayilar.add(6);
		sayilar.forEach(sayi -> System.out.println(sayi+" "));
	}
}
