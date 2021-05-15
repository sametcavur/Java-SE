package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class mainList {
	public static void main(String[] args) {
		/*LÝST KULLANIMI
		 * Tekrarlý verilere izin verir.
		 * Ýlk giren ilk çýkar.
		 * Sýralama var
		 * Ýstenilen indekse veri eklenebilir.
		 */
		//----ARRAYLÝST LÝNKEDLÝST ÝLE AYNI ÞEY----//
		//Yukarýdaki özellikler burada geçerli//
		ArrayList array = new ArrayList();
		array.add("Samet");
		array.add("Samet");
		array.add(14);
		array.add(null);
		array.add(null);
		array.add(1,"Murat" );
		Iterator itr = array.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	
}}
