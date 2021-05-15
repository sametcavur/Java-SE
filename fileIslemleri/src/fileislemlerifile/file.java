package fileislemlerifile;

import java.io.*;
import java.util.Date;

public class file {
	public static void main(String[] args) {
		File dosya = new File("C:/Users/Hp/Desktop/Dersler");
		System.out.println(dosya.canExecute()); //Dosya �al���yor mu
		System.out.println(dosya.canRead());  //Dosya okunabilir mi
		System.out.println(dosya.canWrite());  //Dosya Yaz�labilir mi
		System.out.println(dosya.getAbsolutePath());  //Dosyan�n tam yeri
		System.out.println(dosya.getName());  //Dosyan�n Ad�
		System.out.println(dosya.getParent());  //Dosya nereye ba�l�
		System.out.println(dosya.lastModified());  //Dosya en son ne zaman d�zenlendi
		Date date = new Date(dosya.lastModified());  
		System.out.println(date);  //Dosya en sonra ne zaman d�zenlendi.(Tam Tarih)
	}

}
