package collection;
import java.util.*;
public class mainMap{
	public static void main(String[] args) {
		/*MAP KULLANIMI
		 * Herbir de�eri key value ili�kisiyle tutar.
		 * Arraylerdeki add yerine put koyar�z.
		 * Verileri �ekmek i�inde get koyar�z.*/
		Map �dPass = new HashMap();
		�dPass.put("�d","Samet");
		�dPass.put("password","1234");
		System.out.println("Kullan�c� Ad�:"+�dPass.get("�d"));
		System.out.println("�ifre:"+�dPass.get("password"));
		//----//
		Map<String,mapOgrenci> ogrenci = new HashMap<>();
		mapOgrenci ogr1 = new mapOgrenci("Samet", "�avur", 1997);
		mapOgrenci ogr2 = new mapOgrenci("Hakk�", "Duymaz", 1995);
		mapOgrenci ogr3 = new mapOgrenci("Resul","�al��kan", 1993);
		ogrenci.put("ilk", ogr1);
		ogrenci.put("ikinci", ogr2);
		ogrenci.put("ucuncu", ogr3);
		System.out.println(ogrenci.get("ilk"));
		//ogrenci mapindeki t�m keyleri alma//
		System.out.println(ogrenci.keySet());//�IKTI = [ilk, ucuncu, ikinci]
		//Map i�indeki verileri koleksiyon yapabiliriz.//
		Collection <mapOgrenci> ogrenciListesi = ogrenci.values();
		System.out.println(ogrenciListesi);
		
	}}
