package collection;
import java.util.*;
public class mainMap{
	public static void main(String[] args) {
		/*MAP KULLANIMI
		 * Herbir deðeri key value iliþkisiyle tutar.
		 * Arraylerdeki add yerine put koyarýz.
		 * Verileri çekmek içinde get koyarýz.*/
		Map ýdPass = new HashMap();
		ýdPass.put("ýd","Samet");
		ýdPass.put("password","1234");
		System.out.println("Kullanýcý Adý:"+ýdPass.get("ýd"));
		System.out.println("Þifre:"+ýdPass.get("password"));
		//----//
		Map<String,mapOgrenci> ogrenci = new HashMap<>();
		mapOgrenci ogr1 = new mapOgrenci("Samet", "Çavur", 1997);
		mapOgrenci ogr2 = new mapOgrenci("Hakký", "Duymaz", 1995);
		mapOgrenci ogr3 = new mapOgrenci("Resul","Çalýþkan", 1993);
		ogrenci.put("ilk", ogr1);
		ogrenci.put("ikinci", ogr2);
		ogrenci.put("ucuncu", ogr3);
		System.out.println(ogrenci.get("ilk"));
		//ogrenci mapindeki tüm keyleri alma//
		System.out.println(ogrenci.keySet());//ÇIKTI = [ilk, ucuncu, ikinci]
		//Map içindeki verileri koleksiyon yapabiliriz.//
		Collection <mapOgrenci> ogrenciListesi = ogrenci.values();
		System.out.println(ogrenciListesi);
		
	}}
