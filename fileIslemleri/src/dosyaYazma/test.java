package dosyaYazma;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class test{
	public static void main(String[] args) {
		ogrenci ogr1 = new ogrenci("Samet", "�avur", 23, "12345");
		ogrenci ogr2 = new ogrenci("Osman", "Kaya", 27, "65432");
		ogrenci ogr3 = new ogrenci("Hakan", "Hakmaz", 43, "49012");
		dosyaYazma d = new dosyaYazma();
		boolean dOD=d.dosyaOlustur("ogrenciler");
		if(dOD==true) {
			System.out.println("��renciler Ba�ar�yla Olu�turuldu");
		}
		else {
			System.out.println("��renciler Olu�turulamad�");
		}
		d.ogrenciKaydet(ogr1);
		d.ogrenciKaydet(ogr2);
		d.ogrenciKaydet(ogr3);
		boolean dKD=d.dosyayiKapat();
		if(dKD==true) {
			System.out.println("��renciler Ba�ar�yla Kapat�ld�");
		}
		else {
			System.out.println("��renciler Kapat�lamad�");
		}
		
		dosyaOkuma dOku = new dosyaOkuma();
		dOku.dosyaOkumayiAc("ogrenciler");
		dOku.dosyaOkumayiKapat("ogrenciler");
		
	}

}
