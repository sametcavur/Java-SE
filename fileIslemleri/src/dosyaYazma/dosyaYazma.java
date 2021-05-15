package dosyaYazma;
import java.io.*;

public class dosyaYazma {
	private  PrintWriter printWriter;
	public boolean dosyaOlustur(String dosyaIsmi) {
		try 
		{
			printWriter = new PrintWriter("C:/Users/Hp/Desktop/"+dosyaIsmi+".txt");
			return true;
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
			return false;
		}

	}
	public boolean dosyayiKapat() {
		try {
			printWriter.close();
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

	public void ogrenciKaydet(ogrenci ogrenci) {
		String adi = ogrenci.getAdi();
		String soyadi = ogrenci.getSoyadi();
		int yas = ogrenci.getYas();
		String okulNo = ogrenci.getOkulNo();
		printWriter.println(adi + " " + soyadi + " " + yas + " " + okulNo);
	}
	
}
