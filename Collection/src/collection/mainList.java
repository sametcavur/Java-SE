package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class mainList {
	public static void main(String[] args) {
		/*L�ST KULLANIMI
		 * Tekrarl� verilere izin verir.
		 * �lk giren ilk ��kar.
		 * S�ralama var
		 * �stenilen indekse veri eklenebilir.
		 */
		//----ARRAYL�ST L�NKEDL�ST �LE AYNI �EY----//
		//Yukar�daki �zellikler burada ge�erli//
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
